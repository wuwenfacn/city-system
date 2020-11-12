package com.demo.service;

import com.demo.commons.vo.ShopShopInsertVo;
import com.demo.commons.vo.ShopShopSelectVo;
import com.demo.commons.vo.ShopShopUpdateVo;

import java.util.List;

public interface ShopShopService {

    /*
     * 根据状态展示上架商品和下架商品
     * status：上线状态，0表示下线，1表示上线
     * */
    List<ShopShopSelectVo> selectFShopList(int status);

    /*
     * 新增门店
     * */
    int insertFShop(ShopShopInsertVo fShop);

    /*
     * 门店资料更新
     * */
    int updateFShopBysId(ShopShopUpdateVo fShop);

    /*
     * 门店下架
     * */
    int updatesStatusOut(int sId);

    /*
     * 门店上架
     * */
    int updatesStatusUp(int sId);

    /*
     * 门店删除
     * */
    int updateDeleteStatus(int sId);

}
