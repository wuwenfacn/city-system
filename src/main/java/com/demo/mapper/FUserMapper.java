package com.demo.mapper;

import com.demo.commons.vo.FUserAlterPasswordVo;
import com.demo.commons.vo.FUserAlterUserVo;
import com.demo.commons.vo.FUserLoginVo;
import com.demo.commons.vo.FUserRegisterVo;
import com.demo.entity.FUser;
import org.apache.ibatis.annotations.Param;

public interface FUserMapper {
    /*
    * 登录，传递账号和密码
    * */
    FUser login(@Param("fUserLoginVo") FUserLoginVo fUserLoginVo);

    /*
     * 注册，传递除了id的其他数据
     * */
    int register(@Param("fUserRegisterVo") FUserRegisterVo fUserRegisterVo);

    /*
    * 校验用户是否存在
    * */
    FUser checkUserByName(@Param("username")String username);

    /*
     * 校验id是否存在
     * */
    FUser checkUserByuId(@Param("uId")int uId);

    /*
     * 修改密码，传递id和新密码
     * */
    int alterPassword(@Param("fUserAlterPasswordVo") FUserAlterPasswordVo fUserAlterPasswordVo);

    /*
     * 修改个人信息，传递除了密码的其他数据
     * */
    int alterUser(@Param("fUserAlterUserVo") FUserAlterUserVo fUserAlterUserVo);

}
