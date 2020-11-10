package com.demo.mapper;

import com.demo.commons.vo.FTakeoutTypeVo;
import com.demo.entity.FTakeoutType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FTakeoutTypeMapper {
    /*
    * 查看所有分类信息
    * */
    List<FTakeoutType> selectFTakeoutTypeList();

    /*
    * 添加分类
    * */
    int insertFTakeoutType(@Param("fTakeoutType") FTakeoutTypeVo fTakeoutType);

    /*
    * 修改分类
    * */
    int updateFTakeoutTypeById(@Param("fTakeoutType") FTakeoutType fTakeoutType);

    /*
     * 删除分类
     * */
    int deleteFTakeoutTypeById(@Param("tId") int tId);

}
