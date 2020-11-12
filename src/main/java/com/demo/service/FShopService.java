package com.demo.service;

import com.demo.commons.vo.FShopInsertVo;
import com.demo.commons.vo.FShopSelectVo;
import com.demo.commons.vo.FShopUpdateVo;
import com.demo.entity.FShop;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FShopService {

    /*
     * 根据状态展示上架商品和下架商品
     * status：上线状态，0表示下线，1表示上线
     * */
    List<FShopSelectVo> selectFShopList(int status);

    /*
     * 新增门店
     * */
    int insertFShop(FShopInsertVo fShop);

    /*
     * 门店资料更新
     * */
    int updateFShopBysId(FShopUpdateVo fShop);

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
