package com.demo.service;

import com.demo.commons.vo.FTakeoutAppointmentVo;
import com.demo.entity.FTakeoutAppointment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FTakeoutAppointmentService {

    /*
     * 展示所有的预约信息
     * */
    List<FTakeoutAppointment> selectFTakeoutAppointmentList();

    /*
     * 新增预约
     * */
    int insertFTakeoutAppointment(FTakeoutAppointmentVo fTakeoutAppointmentVo);

    /*
     * 修改预约
     * */
    int updateFTakeoutAppointment(FTakeoutAppointment fTakeoutAppointment);

    /*
     * 删除预约
     * */
    int deleteFTakeoutAppointment(int aId);
}
