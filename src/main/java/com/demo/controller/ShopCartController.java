package com.demo.controller;

import com.demo.commons.requestEntity.CartRequest;
import com.demo.commons.requestEntity.ShopCartIdList;
import com.demo.commons.result.BaseResult;
import com.demo.service.ShopCartService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author qiaoshu
 * Date: 2020-11-13  14:23
 * Description:
 *      购物车服务
 */
@RestController
@RequestMapping("/cart")
public class ShopCartController {
    @Resource
    ShopCartService shopCartService;

    /**
     * 添加购物车
     * @return
     */
    @PostMapping("/add")
    public BaseResult addShopcart(
            @RequestBody CartRequest cartRequest
    ){
        shopCartService.addCart(cartRequest);
        return BaseResult.success();
    }

    /**
     * 批量删除购物车
     * @param ids
     * @return
     */
    @PutMapping("/del")
    public BaseResult deleteShopcart(
            @RequestBody ShopCartIdList ids
            ){
        shopCartService.deleteCart(ids);
        return BaseResult.success();
    }

    /**
     * update购物车
     * @param cartRequest
     * @return
     */
    @PutMapping("/update")
    public BaseResult updateShopcart(
            CartRequest cartRequest
    ){
        shopCartService.updateCart(cartRequest);
        return BaseResult.success();
    }

    /**
     * 根据条件查找所有购物车
     * @param cartRequest
     * @return
     */
    @GetMapping("/list")
    public BaseResult selectAllCarts(
            CartRequest cartRequest
    ){
        List cartRequests = shopCartService.selectAllCart(cartRequest);
        return BaseResult.success(cartRequest);
    }
}
