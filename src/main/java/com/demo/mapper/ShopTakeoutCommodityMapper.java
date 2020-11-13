package com.demo.mapper;

import com.demo.commons.vo.ShopTakeoutCommodityVo;
import com.demo.entity.ShopTakeoutCommodity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopTakeoutCommodityMapper {

    /*
    * 显示所有的外卖商品信息
    * */
    List<ShopTakeoutCommodity> selectFTakeoutCommodityList();

    /*
    * 新增外卖商品
    * */
    int insertFTakeoutCommodity(@Param("shopTakeoutCommodityVo") ShopTakeoutCommodityVo shopTakeoutCommodityVo);

    /*
    * 修改外卖商品信息
    * */
    int updateFTakeoutCommodity(@Param("shopTakeoutCommodity") ShopTakeoutCommodity shopTakeoutCommodity);

    /*
    * 删除外卖商品
    * */
    int deleteFTakeoutCommodityById(@Param("id") int id);
}
