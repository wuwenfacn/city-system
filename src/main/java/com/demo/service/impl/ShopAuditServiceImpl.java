package com.demo.service.impl;

import com.demo.commons.exception.ServiceException;
import com.demo.commons.result.ResultCodeEnum;
import com.demo.commons.utils.BeanConvertUtils;
import com.demo.commons.vo.ShopAuditSelectVo;
import com.demo.commons.vo.ShopAuditUpdateVo;
import com.demo.entity.ShopAudit;
import com.demo.mapper.ShopAuditMapper;
import com.demo.service.ShopAuditService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShopAuditServiceImpl implements ShopAuditService {
    @Resource
    ShopAuditMapper shopAuditMapper;

    /*
     * 根据门店编号修改审核信息
     * */
    @Override
    @Transactional
    public int updateFAuditById(ShopAuditUpdateVo shopAuditUpdateVo) {
        int num = shopAuditMapper.updateFAuditById(shopAuditUpdateVo);
        /*
        * 如果没有修改成功就抛出异常 “ 数据错误 ”
        * */
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }

    /*
     * 对下架申请进行审核，审核通过则允许下架
     * */
    @Override
    @Transactional
    public int updatesStatusOut(int id, int pass, String passReason) {
        int num = shopAuditMapper.updatesStatusOut(id, pass, passReason);
        /*
         * 如果没有修改成功就抛出异常 “ 数据错误 ”
         * */
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }

    /*
     * 对上架申请进行审核，审核通过则允许上架
     * */
    @Override
    @Transactional
    public int updatesStatusUp(int id, int pass, String passReason) {
        int num = shopAuditMapper.updatesStatusUp(id, pass, passReason);
        /*
         * 如果没有修改成功就抛出异常 “ 数据错误 ”
         * */
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }

    /*
     * 对删除申请进行审核，审核通过则允许删除
     * */
    @Override
    @Transactional
    public int updateDeleteStatus(int id, int pass, String passReason) {
        int num = shopAuditMapper.updateDeleteStatus(id, pass, passReason);
        /*
         * 如果没有修改成功就抛出异常 “ 数据错误 ”
         * */
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }

    /*
     * 显示所有要审核的数据
     * aStatus：审核状态，1表示已审核，2表示未审核
     * */
    @Override
    public List<ShopAuditSelectVo> selectFAuditList(int status) {
        List<ShopAudit> shopAudits = shopAuditMapper.selectFAuditList(status);
        /*
         * 如果查找失败就抛出异常 “ 系统繁忙，请稍后重试 ”
         * */
        if(shopAudits.size() < 1){
            throw new ServiceException(ResultCodeEnum.SYSTEM_INNER_ERROR);
        }
        /*
        * 使用 BeanConvertUtils 工具类转换对象
        * */
        List<ShopAuditSelectVo> shopAuditSelectVos = BeanConvertUtils.convertListTo(shopAudits, ShopAuditSelectVo::new);
        return shopAuditSelectVos;
    }

}
