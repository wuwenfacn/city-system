package com.demo.service;

import com.demo.commons.vo.ShopTakeoutTypeVo;
import com.demo.entity.ShopTakeoutType;

import java.util.List;

public interface ShopTakeoutTypeService {

    /*
     * 显示所有的外卖分类
     * */
    List<ShopTakeoutType> selectFTakeoutTypeList();

    /*
     * 新增分类
     * */
    int insertFTakeoutType(ShopTakeoutTypeVo shopTakeoutTypeVo);

    /*
     * 修改分类信息
     * */
    int updateFTakeoutTypeById(ShopTakeoutType shopTakeoutType);

    /*
     * 删除分类
     * */
    int deleteFTakeoutTypeById(int tId);
}
