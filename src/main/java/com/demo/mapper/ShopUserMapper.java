package com.demo.mapper;

import com.demo.commons.vo.ShopUserAlterPasswordVo;
import com.demo.commons.vo.ShopUserAlterUserVo;
import com.demo.commons.vo.ShopUserLoginVo;
import com.demo.commons.vo.ShopUserRegisterVo;
import com.demo.entity.ShopUser;
import org.apache.ibatis.annotations.Param;

public interface ShopUserMapper {
    /*
    * 登录，传递账号和密码
    * */
    ShopUser login(@Param("shopUserLoginVo") ShopUserLoginVo shopUserLoginVo);

    /*
     * 注册，传递除了id的其他数据
     * */
    int register(@Param("shopUserRegisterVo") ShopUserRegisterVo shopUserRegisterVo);

    /*
    * 校验用户是否存在
    * */
    ShopUser checkUserByName(@Param("username")String username);

    /*
     * 校验id是否存在
     * */
    ShopUser checkUserByuId(@Param("uId")int uId);

    /*
     * 修改密码，传递id和新密码
     * */
    int alterPassword(@Param("shopUserAlterPasswordVo") ShopUserAlterPasswordVo shopUserAlterPasswordVo);

    /*
     * 修改个人信息，传递除了密码的其他数据
     * */
    int alterUser(@Param("shopUserAlterUserVo") ShopUserAlterUserVo shopUserAlterUserVo);

}
