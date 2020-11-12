package com.demo.service;

import com.demo.commons.vo.*;
import com.demo.entity.server.Business;
import com.demo.entity.server.FullReduction;
import com.demo.entity.server.PreSale;


import java.util.List;

public interface ServerService {
    /*
    * 查村所有已上架的服务
    * */
    public ResponseEntity<BusinessVo> getAllOrder();
    /*
    * 编辑服务---插入操作
    * */
    int insertServer(Business business);

    ResponseEntity<ReminderRecordVo> getCorderdetails();
    /*
    * 查询所有的服务订单
    * */
    ResponseEntity<ServerOrderVo> allServerOrder();
    /*
    * 免运费设置
    * */
    int insertFullReduction(FullReduction fullReduction);
    /*
    * 查询所有的预售商品
    * */
    ResponseEntity<PreSaleVo> allPreSale();
    /*
    * 查询所有商品
    * */
    ResponseEntity<ShopVo> allshop();
    /*
    *添加预售商品
    **/
    int insertPreShop(PreSale preSale);
}
