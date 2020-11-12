package com.demo.service;

import com.demo.commons.vo.FTakeoutCommodityVo;
import com.demo.entity.FTakeoutCommodity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FTakeoutCommodityService {

    /*
     * 显示所有的外卖商品信息
     * */
    List<FTakeoutCommodity> selectFTakeoutCommodityList();

    /*
     * 新增外卖商品
     * */
    int insertFTakeoutCommodity(FTakeoutCommodityVo fTakeoutCommodityVo);

    /*
     * 修改外卖商品信息
     * */
    int updateFTakeoutCommodity(FTakeoutCommodity fTakeoutCommodity);

    /*
     * 删除外卖商品
     * */
    int deleteFTakeoutCommodityById(int cId);
}
