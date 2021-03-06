package com.demo.service.impl;

import com.demo.commons.exception.ServiceException;
import com.demo.commons.result.ResultCodeEnum;
import com.demo.commons.utils.BeanConvertUtils;
import com.demo.commons.vo.ShopShopInsertVo;
import com.demo.commons.vo.ShopShopSelectVo;
import com.demo.commons.vo.ShopShopUpdateVo;
import com.demo.entity.ShopShop;
import com.demo.mapper.ShopShopMapper;
import com.demo.service.ShopShopService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShopShopServiceImpl implements ShopShopService {
    @Resource
    ShopShopMapper shopShopMapper;

    /*
     * 根据状态展示上架商品和下架商品
     * status：上线状态，0表示下线，1表示上线
     * */
    @Override
    public List<ShopShopSelectVo> selectFShopList(int status) {
        List<ShopShop> shopShops = shopShopMapper.selectFShopList(status);
        if(shopShops.size() < 1){
            throw new ServiceException(ResultCodeEnum.SYSTEM_INNER_ERROR);
        }
        List<ShopShopSelectVo> fShopVos = BeanConvertUtils.convertListTo(shopShops, ShopShopSelectVo::new);
        return fShopVos;
    }

    /*
     * 新增门店
     * */
    @Override
    @Transactional
    public int insertFShop(ShopShopInsertVo shop) {
        int num = shopShopMapper.insertFShop(shop);
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
    public int updateFShopBysId(ShopShopUpdateVo shop) {
        int num = shopShopMapper.updateFShopBysId(shop);
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
    public int updatesStatusOut(int id) {
        int num = shopShopMapper.updatesStatusOut(id);
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
    public int updatesStatusUp(int id) {
        int num = shopShopMapper.updatesStatusUp(id);
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
    public int updateDeleteStatus(int id) {
        int num = shopShopMapper.updateDeleteStatus(id);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }
}
