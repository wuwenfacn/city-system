package com.demo.service.impl;

import com.demo.commons.exception.ServiceException;
import com.demo.commons.result.ResultCodeEnum;
import com.demo.commons.vo.ShopTakeoutTypeVo;
import com.demo.entity.ShopTakeoutType;
import com.demo.mapper.ShopTakeoutTypeMapper;
import com.demo.service.ShopTakeoutTypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShopTakeoutTypeServiceImpl implements ShopTakeoutTypeService {
    @Resource
    ShopTakeoutTypeMapper shopTakeoutTypeMapper;

    /*
     * 显示所有的外卖分类
     * */
    @Override
    public List<ShopTakeoutType> selectFTakeoutTypeList() {
        List<ShopTakeoutType> shopTakeoutTypes = shopTakeoutTypeMapper.selectFTakeoutTypeList();
        if(shopTakeoutTypes.size() < 1){
            throw new ServiceException(ResultCodeEnum.SYSTEM_INNER_ERROR);
        }
        return shopTakeoutTypes;
    }

    /*
     * 新增分类
     * */
    @Override
    @Transactional
    public int insertFTakeoutType(ShopTakeoutTypeVo shopTakeoutTypeVo) {
        int num = shopTakeoutTypeMapper.insertFTakeoutType(shopTakeoutTypeVo);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }

    /*
     * 修改分类信息
     * */
    @Override
    @Transactional
    public int updateFTakeoutTypeById(ShopTakeoutType shopTakeoutType) {
        int num = shopTakeoutTypeMapper.updateFTakeoutTypeById(shopTakeoutType);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }

    /*
     * 删除分类
     * */
    @Override
    @Transactional
    public int deleteFTakeoutTypeById(int tId) {
        int num = shopTakeoutTypeMapper.deleteFTakeoutTypeById(tId);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }
}
