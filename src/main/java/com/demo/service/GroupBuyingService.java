package com.demo.service;

import com.demo.commons.requestEntity.GroupBuyingRequest;
import com.demo.entity.Groupbuying;

import java.util.List;

/**
 * @Author qiaoshu
 * Date: 2020-11-11  19:00
 * Description:
 */
public interface GroupBuyingService {


    boolean addCoupon(GroupBuyingRequest groupBuyingRequest);

    boolean deleteCoupon(GroupBuyingRequest groupBuyingRequest);

    boolean updateCoupon(GroupBuyingRequest groupBuyingRequest);

    List selectCoupon(GroupBuyingRequest groupBuyingRequest,int page,int size);
}
