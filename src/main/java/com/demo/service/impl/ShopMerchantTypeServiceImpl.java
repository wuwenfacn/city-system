package com.demo.service.impl;

import com.demo.commons.exception.ServiceException;
import com.demo.commons.result.ResultCodeEnum;
import com.demo.entity.ShopMerchantType;
import com.demo.mapper.ShopMerchantTypeMapper;
import com.demo.service.ShopMerchantTypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class ShopMerchantTypeServiceImpl implements ShopMerchantTypeService {
    @Resource
    ShopMerchantTypeMapper shopMerchantTypeMapper;

    /*
     * 添加外卖基础设置表信息
     * */
    @Override
    @Transactional
    public int insertFMerchantType(ShopMerchantType shopMerchantType) {
        int num = shopMerchantTypeMapper.insertFMerchantType(shopMerchantType);
        /*
         * 如果没有添加成功就抛出异常 “ 数据错误 ”
         * */
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }
}
