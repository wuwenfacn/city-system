package com.demo.service.impl;

import com.demo.commons.exception.ServiceException;
import com.demo.commons.result.ResultCodeEnum;
import com.demo.commons.utils.BeanConvertUtils;
import com.demo.commons.vo.FAuditSelectVo;
import com.demo.commons.vo.FAuditUpdateVo;
import com.demo.commons.vo.FShopSelectVo;
import com.demo.entity.FAudit;
import com.demo.mapper.FAuditMapper;
import com.demo.service.FAuditService;
import com.mysql.cj.util.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FAuditServiceImpl implements FAuditService {
    @Resource
    FAuditMapper fAuditMapper;

    /*
     * 根据门店编号修改审核信息
     * */
    @Override
    @Transactional
    public int updateFAuditById(FAuditUpdateVo fAuditUpdateVo) {
        int num = fAuditMapper.updateFAuditById(fAuditUpdateVo);
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
    public int updatesStatusOut(int sId, int aPass, String aPassReason) {
        int num = fAuditMapper.updatesStatusOut(sId, aPass, aPassReason);
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
    public int updatesStatusUp(int sId, int aPass, String aPassReason) {
        int num = fAuditMapper.updatesStatusUp(sId, aPass, aPassReason);
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
    public int updateDeleteStatus(int sId, int aPass, String aPassReason) {
        int num = fAuditMapper.updateDeleteStatus(sId, aPass, aPassReason);
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
    public List<FAuditSelectVo> selectFAuditList(int aStatus) {
        List<FAudit> fAudits = fAuditMapper.selectFAuditList(aStatus);
        /*
         * 如果查找失败就抛出异常 “ 系统繁忙，请稍后重试 ”
         * */
        if(fAudits.size() < 1){
            throw new ServiceException(ResultCodeEnum.SYSTEM_INNER_ERROR);
        }
        /*
        * 使用 BeanConvertUtils 工具类转换对象
        * */
        List<FAuditSelectVo> fAuditSelectVos = BeanConvertUtils.convertListTo(fAudits, FAuditSelectVo::new);
        return fAuditSelectVos;
    }

}
