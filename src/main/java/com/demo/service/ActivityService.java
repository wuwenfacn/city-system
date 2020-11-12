package com.demo.service;

import com.demo.commons.requestEntity.ActivityRequest;

import java.util.LinkedHashSet;
import java.util.List;

/**
 * @Author qiaoshu
 * Date: 2020-11-12  09:33
 * Description:
 */
public interface ActivityService {

    boolean addActivity(ActivityRequest activityRequest);

    boolean updateActivity(ActivityRequest activityRequest);

    boolean deleteActivity(Integer actid);

    List selectAll(Integer page,Integer size);
}
