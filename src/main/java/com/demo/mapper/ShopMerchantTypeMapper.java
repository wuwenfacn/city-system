package com.demo.mapper;

import com.demo.entity.ShopMerchantType;
import org.apache.ibatis.annotations.Param;

public interface ShopMerchantTypeMapper {
    /*
    * 添加外卖基础设置表信息
    * */
    int insertFMerchantType(@Param("shopMerchantType") ShopMerchantType shopMerchantType);
}
