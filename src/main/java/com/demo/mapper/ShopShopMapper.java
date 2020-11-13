package com.demo.mapper;

import com.demo.commons.vo.ShopShopInsertVo;
import com.demo.commons.vo.ShopShopUpdateVo;
import com.demo.entity.ShopShop;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopShopMapper {
    /*
    * status：上线状态，0表示下线，1表示上线
    * */
    List<ShopShop> selectFShopList(@Param("status") int status);

    /*
    * 添加新门店
    * */
    int insertFShop(@Param("shop") ShopShopInsertVo shop);

    /*
    * 门店资料更新
    * */
    int updateFShopBysId(@Param("shop") ShopShopUpdateVo shop);

    /*
    * 门店下架
    * */
    int updatesStatusOut(@Param("id") int id);

    /*
     * 门店上架
     * */
    int updatesStatusUp(@Param("id") int id);

    /*
     * 门店删除
     * */
    int updateDeleteStatus(@Param("id") int id);
}
