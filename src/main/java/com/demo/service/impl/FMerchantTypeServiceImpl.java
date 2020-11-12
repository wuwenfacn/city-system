package com.demo.service.impl;

import com.demo.commons.exception.ServiceException;
import com.demo.commons.result.ResultCodeEnum;
import com.demo.entity.FMerchantType;
import com.demo.mapper.FMerchantTypeMapper;
import com.demo.service.FMerchantTypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class FMerchantTypeServiceImpl implements FMerchantTypeService {
    @Resource
    FMerchantTypeMapper fMerchantTypeMapper;

    /*
     * 添加外卖基础设置表信息
     * */
    @Override
    @Transactional
    public int insertFMerchantType(FMerchantType fMerchantType) {
        int num = fMerchantTypeMapper.insertFMerchantType(fMerchantType);
        /*
         * 如果没有添加成功就抛出异常 “ 数据错误 ”
         * */
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }
}
