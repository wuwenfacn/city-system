package com.demo.mapper;

import com.demo.commons.vo.ShopTakeoutAppointmentVo;
import com.demo.entity.ShopTakeoutAppointment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopTakeoutAppointmentMapper {
    /*
    * 展示所有的预约信息
    * */
    List<ShopTakeoutAppointment> selectFTakeoutAppointmentList();

    /*
    * 新增预约
    * */
    int insertFTakeoutAppointment(@Param("shopTakeoutAppointmentVo") ShopTakeoutAppointmentVo shopTakeoutAppointmentVo);

    /*
    * 修改预约
    * */
    int updateFTakeoutAppointment(@Param("shopTakeoutAppointment") ShopTakeoutAppointment shopTakeoutAppointment);

    /*
     * 删除预约
     * */
    int deleteFTakeoutAppointment(@Param("aId") int aId);
}
