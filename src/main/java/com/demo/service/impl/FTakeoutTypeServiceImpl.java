package com.demo.service.impl;

import com.demo.commons.exception.ServiceException;
import com.demo.commons.result.ResultCodeEnum;
import com.demo.commons.vo.FTakeoutTypeVo;
import com.demo.entity.FTakeoutType;
import com.demo.mapper.FTakeoutTypeMapper;
import com.demo.service.FTakeoutTypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FTakeoutTypeServiceImpl implements FTakeoutTypeService {
    @Resource
    FTakeoutTypeMapper fTakeoutTypeMapper;

    @Override
    @Transactional
    public List<FTakeoutType> selectFTakeoutTypeList() {
        List<FTakeoutType> fTakeoutTypes = fTakeoutTypeMapper.selectFTakeoutTypeList();
        if(fTakeoutTypes == null){
            throw new ServiceException(ResultCodeEnum.SYSTEM_INNER_ERROR);
        }
        return fTakeoutTypes;
    }

    @Override
    @Transactional
    public int insertFTakeoutType(FTakeoutTypeVo fTakeoutTypeVo) {
        int num = fTakeoutTypeMapper.insertFTakeoutType(fTakeoutTypeVo);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }

    @Override
    @Transactional
    public int updateFTakeoutTypeById(FTakeoutType fTakeoutType) {
        int num = fTakeoutTypeMapper.updateFTakeoutTypeById(fTakeoutType);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }

    @Override
    @Transactional
    public int deleteFTakeoutTypeById(int tId) {
        int num = fTakeoutTypeMapper.deleteFTakeoutTypeById(tId);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }
}
