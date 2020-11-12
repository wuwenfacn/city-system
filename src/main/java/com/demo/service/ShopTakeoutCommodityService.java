package com.demo.service;

import com.demo.commons.vo.ShopTakeoutCommodityVo;
import com.demo.entity.ShopTakeoutCommodity;

import java.util.List;

public interface ShopTakeoutCommodityService {

    /*
     * 显示所有的外卖商品信息
     * */
    List<ShopTakeoutCommodity> selectFTakeoutCommodityList();

    /*
     * 新增外卖商品
     * */
    int insertFTakeoutCommodity(ShopTakeoutCommodityVo shopTakeoutCommodityVo);

    /*
     * 修改外卖商品信息
     * */
    int updateFTakeoutCommodity(ShopTakeoutCommodity shopTakeoutCommodity);

    /*
     * 删除外卖商品
     * */
    int deleteFTakeoutCommodityById(int cId);
}
