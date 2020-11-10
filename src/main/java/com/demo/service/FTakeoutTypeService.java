package com.demo.service;

import com.demo.commons.vo.FTakeoutTypeVo;
import com.demo.entity.FTakeoutType;

import java.util.List;

public interface FTakeoutTypeService {

    List<FTakeoutType> selectFTakeoutTypeList();

    int insertFTakeoutType(FTakeoutTypeVo fTakeoutTypeVo);

    int updateFTakeoutTypeById(FTakeoutType fTakeoutType);

    int deleteFTakeoutTypeById(int tId);
}
