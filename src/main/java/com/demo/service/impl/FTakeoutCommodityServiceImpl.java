package com.demo.service.impl;

import com.demo.commons.exception.ServiceException;
import com.demo.commons.result.ResultCodeEnum;
import com.demo.commons.vo.FTakeoutCommodityVo;
import com.demo.entity.FTakeoutCommodity;
import com.demo.mapper.FTakeoutCommodityMapper;
import com.demo.service.FTakeoutCommodityService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FTakeoutCommodityServiceImpl implements FTakeoutCommodityService {
    @Resource
    FTakeoutCommodityMapper fTakeoutCommodityMapper;

    /*
     * 显示所有的外卖商品信息
     * */
    @Override
    public List<FTakeoutCommodity> selectFTakeoutCommodityList() {
        List<FTakeoutCommodity> fTakeoutCommodities = fTakeoutCommodityMapper.selectFTakeoutCommodityList();
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
    public int insertFTakeoutCommodity(FTakeoutCommodityVo fTakeoutCommodityVo) {
        int num = fTakeoutCommodityMapper.insertFTakeoutCommodity(fTakeoutCommodityVo);
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
    public int updateFTakeoutCommodity(FTakeoutCommodity fTakeoutCommodity) {
        int num = fTakeoutCommodityMapper.updateFTakeoutCommodity(fTakeoutCommodity);
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
        int num = fTakeoutCommodityMapper.deleteFTakeoutCommodityById(cId);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }
}
