package com.demo.service.impl;

import com.demo.commons.requestEntity.GroupBuyingRequest;
import com.demo.entity.Groupbuying;
import com.demo.mapper.GroupbuyingMapper;
import com.demo.service.GroupBuyingService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author qiaoshu
 * Date: 2020-11-11  19:08
 * Description:
 */
@Service
public class GroupBuyingServiceImpl implements GroupBuyingService {
    @Resource
    GroupbuyingMapper groupbuyingMapper;

    @Override
    public boolean addCoupon(GroupBuyingRequest groupBuyingRequest) {
        Groupbuying groupbuying = new Groupbuying();
        BeanUtils.copyProperties(groupBuyingRequest,groupbuying);
        int insert = groupbuyingMapper.insert(groupbuying);
        return insert>0;
    }

    @Override
    public boolean deleteCoupon(GroupBuyingRequest groupBuyingRequest) {
        int i = groupbuyingMapper.deleteByPrimaryKey(groupBuyingRequest.getGid());
        return i>0;
    }

    @Override
    public boolean updateCoupon(GroupBuyingRequest groupBuyingRequest) {
        Groupbuying groupbuying = new Groupbuying();
        BeanUtils.copyProperties(groupBuyingRequest,groupbuying);
        int i = groupbuyingMapper.updateByPrimaryKeySelective(groupbuying);
        return i>0;
    }

    @Override
    public List selectCoupon(GroupBuyingRequest groupBuyingRequest,int page,int size) {
        Groupbuying groupbuying = new Groupbuying();
        BeanUtils.copyProperties(groupBuyingRequest,groupbuying);
        PageHelper.startPage(page,size);
        List<Groupbuying> groupbuyings = groupbuyingMapper.selectByPrimaryKey(groupbuying);
        PageInfo pageInfo = new PageInfo<>(groupbuyings);
        List list = pageInfo.getList();
        return list;
    }

}
