package com.demo.mapper;

import com.demo.entity.FUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FUserAdminMapper {
    /*
     * 展示所有的用户信息
     * */
    List<FUser> selectFUserList();

    /*
    * 删除用户
    * */
    int deleteUser(@Param("uId") int uId);
}
