package com.demo.service.impl;

import com.demo.commons.exception.ServiceException;
import com.demo.commons.result.ResultCodeEnum;
import com.demo.entity.ShopUser;
import com.demo.mapper.ShopUserAdminMapper;
import com.demo.mapper.ShopUserMapper;
import com.demo.service.ShopUserAdminService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShopUserAdminServiceImpl implements ShopUserAdminService {
    @Resource
    ShopUserAdminMapper shopUserAdminMapper;
    @Resource
    ShopUserMapper shopUserMapper;

    /*
     * 展示所有用户信息
     * */
    @Override
    public List<ShopUser> selectFUserList() {
        List<ShopUser> shopUsers = shopUserAdminMapper.selectFUserList();
        if(shopUsers.size() < 1){
            throw new ServiceException(ResultCodeEnum.SYSTEM_INNER_ERROR);
        }
        return shopUsers;
    }

    /*
     * 删除用户
     * */
    @Override
    @Transactional
    public int deleteUser(int uId) {
        if(shopUserMapper.checkUserByuId(uId) == null){
            throw new ServiceException(ResultCodeEnum.ACCOUNT_NOT_EXIST);
        }
        int num = shopUserAdminMapper.deleteUser(uId);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }
}
