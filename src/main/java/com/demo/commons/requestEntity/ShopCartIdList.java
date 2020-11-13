package com.demo.commons.requestEntity;

import lombok.Data;

import java.util.List;

/**
 * @Author qiaoshu
 * Date: 2020-11-13  16:31
 * Description:
 */
@Data
public class ShopCartIdList {
    /*前端传过来的批量购物车id*/
    List<Integer> ids;
}
