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

    @Override
    @Transactional
    public List<FShopSelectVo> selectFShopList(int status, int pageNum, int pageSize) {
        List<FShop> fShops = fShopMapper.selectFShopList(status, pageNum, pageSize);
        if(fShops == null){
            throw new ServiceException(ResultCodeEnum.SYSTEM_INNER_ERROR);
        }
        List<FShopSelectVo> fShopVos = BeanConvertUtils.convertListTo(fShops, FShopSelectVo::new);
        return fShopVos;
    }

    @Override
    @Transactional
    public int insertFShop(FShopInsertVo fShop) {
        int num = fShopMapper.insertFShop(fShop);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }

    @Override
    @Transactional
    public int updateFShopBysId(FShopUpdateVo fShop) {
        int num = fShopMapper.updateFShopBysId(fShop);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }

    @Override
    @Transactional
    public int updatesStatusOut(int sId) {
        int num = fShopMapper.updatesStatusOut(sId);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }

    @Override
    @Transactional
    public int updatesStatusUp(int sId) {
        int num = fShopMapper.updatesStatusUp(sId);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }

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
