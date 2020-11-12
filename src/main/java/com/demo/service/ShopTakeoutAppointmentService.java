package com.demo.service;

import com.demo.commons.vo.ShopTakeoutAppointmentVo;
import com.demo.entity.ShopTakeoutAppointment;

import java.util.List;

public interface ShopTakeoutAppointmentService {

    /*
     * 展示所有的预约信息
     * */
    List<ShopTakeoutAppointment> selectFTakeoutAppointmentList();

    /*
     * 新增预约
     * */
    int insertFTakeoutAppointment(ShopTakeoutAppointmentVo shopTakeoutAppointmentVo);

    /*
     * 修改预约
     * */
    int updateFTakeoutAppointment(ShopTakeoutAppointment shopTakeoutAppointment);

    /*
     * 删除预约
     * */
    int deleteFTakeoutAppointment(int aId);
}
