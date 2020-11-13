package com.demo.service;

import com.demo.commons.requestEntity.CartRequest;
import com.demo.commons.requestEntity.ShopCartIdList;

import java.util.List;

/**
 * @Author qiaoshu
 * Date: 2020-11-13  14:24
 * Description:
 *      购物车业务层
 */
public interface ShopCartService {


    boolean addCart(CartRequest cartRequest);

    boolean deleteCart(ShopCartIdList ids);

    boolean updateCart(CartRequest cartRequest);

    List selectAllCart(CartRequest cartRequest);

}
