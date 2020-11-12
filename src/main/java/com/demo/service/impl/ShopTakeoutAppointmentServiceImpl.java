package com.demo.service.impl;

import com.demo.commons.exception.ServiceException;
import com.demo.commons.result.ResultCodeEnum;
import com.demo.commons.vo.ShopTakeoutAppointmentVo;
import com.demo.entity.ShopTakeoutAppointment;
import com.demo.mapper.ShopTakeoutAppointmentMapper;
import com.demo.service.ShopTakeoutAppointmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShopTakeoutAppointmentServiceImpl implements ShopTakeoutAppointmentService {
    @Resource
    ShopTakeoutAppointmentMapper shopTakeoutAppointmentMapper;

    /*
     * 展示所有的预约信息
     * */
    @Override
    public List<ShopTakeoutAppointment> selectFTakeoutAppointmentList() {
        List<ShopTakeoutAppointment> shopTakeoutAppointments = shopTakeoutAppointmentMapper.selectFTakeoutAppointmentList();
        if(shopTakeoutAppointments.size() < 1){
            throw new ServiceException(ResultCodeEnum.SYSTEM_INNER_ERROR);
        }
        return shopTakeoutAppointments;
    }

    /*
     * 新增预约
     * */
    @Override
    @Transactional
    public int insertFTakeoutAppointment(ShopTakeoutAppointmentVo shopTakeoutAppointmentVo) {
        int num = shopTakeoutAppointmentMapper.insertFTakeoutAppointment(shopTakeoutAppointmentVo);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }

    /*
     * 修改预约
     * */
    @Override
    @Transactional
    public int updateFTakeoutAppointment(ShopTakeoutAppointment shopTakeoutAppointment) {
        int num = shopTakeoutAppointmentMapper.updateFTakeoutAppointment(shopTakeoutAppointment);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }

    /*
     * 删除预约
     * */
    @Override
    @Transactional
    public int deleteFTakeoutAppointment(int aId) {
        int num = shopTakeoutAppointmentMapper.deleteFTakeoutAppointment(aId);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }
}
