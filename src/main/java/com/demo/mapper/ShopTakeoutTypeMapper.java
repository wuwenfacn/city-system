package com.demo.mapper;

import com.demo.commons.vo.ShopTakeoutTypeVo;
import com.demo.entity.ShopTakeoutType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopTakeoutTypeMapper {
    /*
    * 查看所有分类信息
    * */
    List<ShopTakeoutType> selectFTakeoutTypeList();

    /*
    * 添加分类
    * */
    int insertFTakeoutType(@Param("fTakeoutType") ShopTakeoutTypeVo fTakeoutType);

    /*
    * 修改分类
    * */
    int updateFTakeoutTypeById(@Param("shopTakeoutType") ShopTakeoutType shopTakeoutType);

    /*
     * 删除分类
     * */
    int deleteFTakeoutTypeById(@Param("id") int id);

}
