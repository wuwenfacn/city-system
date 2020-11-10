package com.demo.mapper;

import com.demo.entity.FMerchantType;
import org.apache.ibatis.annotations.Param;

public interface FMerchantTypeMapper {
    /*
    * 添加外卖基础设置表信息
    * */
    int insertFMerchantType(@Param("fMerchantType") FMerchantType fMerchantType);
}
