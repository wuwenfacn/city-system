package com.demo.service;

import com.demo.commons.vo.FTakeoutTypeVo;
import com.demo.entity.FTakeoutType;

import java.util.List;

public interface FTakeoutTypeService {

    /*
     * 显示所有的外卖分类
     * */
    List<FTakeoutType> selectFTakeoutTypeList();

    /*
     * 新增分类
     * */
    int insertFTakeoutType(FTakeoutTypeVo fTakeoutTypeVo);

    /*
     * 修改分类信息
     * */
    int updateFTakeoutTypeById(FTakeoutType fTakeoutType);

    /*
     * 删除分类
     * */
    int deleteFTakeoutTypeById(int tId);
}
