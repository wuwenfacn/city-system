package com.demo.service.impl;

import com.demo.commons.exception.ServiceException;
import com.demo.commons.result.ResultCodeEnum;
import com.demo.commons.utils.BeanConvertUtils;
import com.demo.commons.vo.FShopInsertVo;
import com.demo.commons.vo.FShopSelectVo;
import com.demo.commons.vo.FShopUpdateVo;
import com.demo.entity.FShop;
import com.demo.mapper.FShopMapper;
import com.demo.service.FShopService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FShopServiceImpl implements FShopService {
    @Resource
    FShopMapper fShopMapper;

    /*
     * 根据状态展示上架商品和下架商品
     * status：上线状态，0表示下线，1表示上线
     * */
    @Override
    public List<FShopSelectVo> selectFShopList(int status) {
        List<FShop> fShops = fShopMapper.selectFShopList(status);
        if(fShops.size() < 1){
            throw new ServiceException(ResultCodeEnum.SYSTEM_INNER_ERROR);
        }
        List<FShopSelectVo> fShopVos = BeanConvertUtils.convertListTo(fShops, FShopSelectVo::new);
        return fShopVos;
    }

    /*
     * 新增门店
     * */
    @Override
    @Transactional
    public int insertFShop(FShopInsertVo fShop) {
        int num = fShopMapper.insertFShop(fShop);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }

    /*
     * 门店资料更新
     * */
    @Override
    @Transactional
    public int updateFShopBysId(FShopUpdateVo fShop) {
        int num = fShopMapper.updateFShopBysId(fShop);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }

    /*
     * 门店下架
     * */
    @Override
    @Transactional
    public int updatesStatusOut(int sId) {
        int num = fShopMapper.updatesStatusOut(sId);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }

    /*
     * 门店上架
     * */
    @Override
    @Transactional
    public int updatesStatusUp(int sId) {
        int num = fShopMapper.updatesStatusUp(sId);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }

    /*
     * 门店删除
     * */
    @Override
    @Transactional
    public int updateDeleteStatus(int sId) {
        int num = fShopMapper.updateDeleteStatus(sId);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }
}
