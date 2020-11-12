package com.demo.commons.utils;

/**
 * @Author qiaoshu
 * jdk8
 * Date: 2020-11-10  14:56
 * Description:
 */
@FunctionalInterface
public interface BeanCopyUtilCallBack <S, T>{
    /**
     * 定义默认回调方法
     * @param t
     * @param s
     */
    void callBack(S t, T s);
}
