package com.demo.service;

import com.demo.commons.vo.FTakeoutCommodityVo;
import com.demo.entity.FTakeoutCommodity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FTakeoutCommodityService {

    List<FTakeoutCommodity> selectFTakeoutCommodityList();

    int insertFTakeoutCommodity(FTakeoutCommodityVo fTakeoutCommodityVo);

    int updateFTakeoutCommodity(FTakeoutCommodity fTakeoutCommodity);

    int deleteFTakeoutCommodityById(int cId);
}
