package com.demo.mapper;

import com.demo.entity.ShopUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopUserAdminMapper {
    /*
     * 展示所有的用户信息
     * */
    List<ShopUser> selectFUserList();

    /*
    * 删除用户
    * */
    int deleteUser(@Param("id") int id);
}
