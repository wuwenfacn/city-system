package com.demo.service.impl;

import com.demo.commons.exception.ServiceException;
import com.demo.commons.result.ResultCodeEnum;
import com.demo.commons.vo.FTakeoutAppointmentVo;
import com.demo.entity.FTakeoutAppointment;
import com.demo.mapper.FTakeoutAppointmentMapper;
import com.demo.service.FTakeoutAppointmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FTakeoutAppointmentServiceImpl implements FTakeoutAppointmentService {
    @Resource
    FTakeoutAppointmentMapper fTakeoutAppointmentMapper;

    @Override
    @Transactional
    public List<FTakeoutAppointment> selectFTakeoutAppointmentList() {
        List<FTakeoutAppointment> fTakeoutAppointments = fTakeoutAppointmentMapper.selectFTakeoutAppointmentList();
        if(fTakeoutAppointments.size() < 1){
            throw new ServiceException(ResultCodeEnum.SYSTEM_INNER_ERROR);
        }
        return fTakeoutAppointments;
    }

    @Override
    @Transactional
    public int insertFTakeoutAppointment(FTakeoutAppointmentVo fTakeoutAppointmentVo) {
        int num = fTakeoutAppointmentMapper.insertFTakeoutAppointment(fTakeoutAppointmentVo);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }

    @Override
    @Transactional
    public int updateFTakeoutAppointment(FTakeoutAppointment fTakeoutAppointment) {
        int num = fTakeoutAppointmentMapper.updateFTakeoutAppointment(fTakeoutAppointment);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }

    @Override
    @Transactional
    public int deleteFTakeoutAppointment(int aId) {
        int num = fTakeoutAppointmentMapper.deleteFTakeoutAppointment(aId);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }
}
