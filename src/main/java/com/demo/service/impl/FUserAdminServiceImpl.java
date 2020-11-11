package com.demo.service.impl;

import com.demo.commons.exception.ServiceException;
import com.demo.commons.result.ResultCodeEnum;
import com.demo.entity.FUser;
import com.demo.mapper.FUserAdminMapper;
import com.demo.mapper.FUserMapper;
import com.demo.service.FUserAdminService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FUserAdminServiceImpl implements FUserAdminService {
    @Resource
    FUserAdminMapper fUserAdminMapper;
    @Resource
    FUserMapper fUserMapper;

    @Override
    public List<FUser> selectFUserList() {
        List<FUser> fUsers = fUserAdminMapper.selectFUserList();
        if(fUsers.size() < 1){
            throw new ServiceException(ResultCodeEnum.SYSTEM_INNER_ERROR);
        }
        return fUsers;
    }

    @Override
    public int deleteUser(int uId) {
        if(fUserMapper.checkUserByuId(uId) == null){
            throw new ServiceException(ResultCodeEnum.ACCOUNT_NOT_EXIST);
        }
        int num = fUserAdminMapper.deleteUser(uId);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }
}
