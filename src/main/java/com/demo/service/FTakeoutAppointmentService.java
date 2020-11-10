package com.demo.service;

import com.demo.commons.vo.FTakeoutAppointmentVo;
import com.demo.entity.FTakeoutAppointment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FTakeoutAppointmentService {

    List<FTakeoutAppointment> selectFTakeoutAppointmentList();

    int insertFTakeoutAppointment(FTakeoutAppointmentVo fTakeoutAppointmentVo);

    int updateFTakeoutAppointment(FTakeoutAppointment fTakeoutAppointment);

    int deleteFTakeoutAppointment(int aId);
}
