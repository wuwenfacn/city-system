package com.demo.service.impl;

import com.demo.commons.exception.ServiceException;
import com.demo.commons.requestEntity.CartRequest;
import com.demo.commons.requestEntity.ShopCartIdList;
import com.demo.commons.result.ResultCodeEnum;
import com.demo.entity.Shopcart;
import com.demo.mapper.ShopcartMapper;
import com.demo.service.ShopCartService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * @Author qiaoshu
 * Date: 2020-11-13  14:25
 * Description:
 *      购物车业务层
 */

@Service
public class ShopCartServiceImpl implements ShopCartService {
    @Resource
    ShopcartMapper shopcartMapper;

    /**
     * 添加购物车
     * @param cartRequest
     * @return
     */
    @Override
    public boolean addCart(CartRequest cartRequest) {
        Shopcart shopcart = new Shopcart();
        int insert = 0;
        BeanUtils.copyProperties(cartRequest,shopcart);
        /*根据单价和数量计算总价*/
        Integer quantity = shopcart.getQuantity();
        BigDecimal unitPrice = shopcart.getUnitPrice();
        BigDecimal bigDecimal = new BigDecimal(quantity);
        BigDecimal total = bigDecimal.multiply(unitPrice);
        shopcart.setTotalPrice(total);
        try{
            /*插入数据*/
            insert = shopcartMapper.insert(shopcart);
        }catch (Exception e){
            throw new ServiceException(ResultCodeEnum.SQL_INSERT_ERROR);
        }
        return insert>0;
    }

    /**
     * 批量删除购物车
     * @param ids
     * @return
     */
    @Override
    public boolean deleteCart(ShopCartIdList ids) {
        int i = 0;
        List<Integer> ids1 = ids.getIds();
        i = shopcartMapper.deleteByIds(ids1);
        if (i<1){
            throw new ServiceException(ResultCodeEnum.SQL_DELETE_ERROR);
        }
        return i>0;
    }

    /**
     * update购物车
     * @param cartRequest
     * @return
     */
    @Override
    public boolean updateCart(CartRequest cartRequest) {
        return false;
    }

    /**
     * 查询所有购物车
     * @param cartRequest
     * @return
     */
    @Override
    public List selectAllCart(CartRequest cartRequest) {
        return null;
    }


}
