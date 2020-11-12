package com.demo.service;

import com.demo.entity.FUser;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FUserAdminService {

    /*
     * 展示所有用户信息
     * */
    List<FUser> selectFUserList();

    /*
     * 删除用户
     * */
    int deleteUser(@Param("uId") int uId);
}
