package com.demo.service.impl;

import com.demo.commons.exception.ServiceException;
import com.demo.commons.requestEntity.ActivityRequest;
import com.demo.commons.result.ResultCodeEnum;
import com.demo.entity.WActivity;
import com.demo.mapper.WActivityMapper;
import com.demo.service.ActivityService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author qiaoshu
 * Date: 2020-11-12  09:34
 * Description:
 */
@Service
public class ActivityServiceImpl implements ActivityService {
    @Resource
    WActivityMapper activityMapper;
    @Override
    public boolean addActivity(ActivityRequest activityRequest) {
        WActivity wActivity = new WActivity();
        BeanUtils.copyProperties(activityRequest,wActivity);
        int i = 0;
        try {
            i = activityMapper.insertSelective(wActivity);
        }catch (RuntimeException e){
            throw new ServiceException(ResultCodeEnum.SQL_INSERT_ERROR);
        }
        return i>1;
    }

    @Override
    public boolean updateActivity(ActivityRequest activityRequest) {
        WActivity wActivity = new WActivity();
        BeanUtils.copyProperties(activityRequest,wActivity);
        int i = 0;
        try {
            i = activityMapper.updateByPrimaryKey(wActivity);
        }catch (RuntimeException e){
            throw new ServiceException(ResultCodeEnum.SQL_UPDATE_ERROR);
        }
        return i>1;
    }

    @Override
    public boolean deleteActivity(Integer actid) {
        int i = 0;
        try {
            i = activityMapper.deleteByPrimaryKey(actid);
        }catch (RuntimeException e){
            throw new ServiceException(ResultCodeEnum.SQL_DELETE_ERROR);
        }
        return i>0;
    }

    @Override
    public List selectAll(Integer page,Integer size) {
        PageHelper.startPage(page,size);
        List list = activityMapper.selectAll();
        if (list==null){
            throw new ServiceException(ResultCodeEnum.SQL_SELECT_ERROR);
        }
        PageInfo pageInfo = new PageInfo<>(list);
        return pageInfo.getList();
    }
}
