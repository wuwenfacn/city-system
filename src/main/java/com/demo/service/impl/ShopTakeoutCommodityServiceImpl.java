package com.demo.service.impl;

import com.demo.commons.exception.ServiceException;
import com.demo.commons.result.ResultCodeEnum;
import com.demo.commons.vo.ShopTakeoutCommodityVo;
import com.demo.entity.ShopTakeoutCommodity;
import com.demo.mapper.ShopTakeoutCommodityMapper;
import com.demo.service.ShopTakeoutCommodityService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShopTakeoutCommodityServiceImpl implements ShopTakeoutCommodityService {
    @Resource
    ShopTakeoutCommodityMapper shopTakeoutCommodityMapper;

    /*
     * 显示所有的外卖商品信息
     * */
    @Override
    public List<ShopTakeoutCommodity> selectFTakeoutCommodityList() {
        List<ShopTakeoutCommodity> fTakeoutCommodities = shopTakeoutCommodityMapper.selectFTakeoutCommodityList();
        if(fTakeoutCommodities.size() < 1){
            throw new ServiceException(ResultCodeEnum.SYSTEM_INNER_ERROR);
        }
        return fTakeoutCommodities;
    }

    /*
     * 新增外卖商品
     * */
    @Override
    @Transactional
    public int insertFTakeoutCommodity(ShopTakeoutCommodityVo shopTakeoutCommodityVo) {
        int num = shopTakeoutCommodityMapper.insertFTakeoutCommodity(shopTakeoutCommodityVo);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }

    /*
     * 修改外卖商品信息
     * */
    @Override
    @Transactional
    public int updateFTakeoutCommodity(ShopTakeoutCommodity shopTakeoutCommodity) {
        int num = shopTakeoutCommodityMapper.updateFTakeoutCommodity(shopTakeoutCommodity);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }

    /*
     * 删除外卖商品
     * */
    @Override
    @Transactional
    public int deleteFTakeoutCommodityById(int cId) {
        int num = shopTakeoutCommodityMapper.deleteFTakeoutCommodityById(cId);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }
}
