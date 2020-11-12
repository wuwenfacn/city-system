package com.demo.service;

import com.demo.entity.ShopUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopUserAdminService {

    /*
     * 展示所有用户信息
     * */
    List<ShopUser> selectFUserList();

    /*
     * 删除用户
     * */
    int deleteUser(@Param("uId") int uId);
}
