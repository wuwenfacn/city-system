package com.demo.service;

import com.demo.entity.FUser;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FUserAdminService {

    List<FUser> selectFUserList();

    int deleteUser(@Param("uId") int uId);
}
