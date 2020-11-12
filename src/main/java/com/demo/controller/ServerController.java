package com.demo.controller;

import com.demo.commons.vo.*;
import com.demo.entity.server.Business;
import com.demo.entity.server.FullReduction;
import com.demo.entity.server.PreSale;
import com.demo.service.ServerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/server")
public class ServerController {
    @Resource
    ServerService serverService;

    /*
    * 查询所有已上架的服务
    * */
    @GetMapping("/allserver")
    public ResponseEntity<BusinessVo> allserver(){
        return serverService.getAllOrder();
    }
    /*
    *编辑已上架的服务
    * */
    @PutMapping("/update")
    public ResponseEntity updateServer(@RequestBody Business business){
        int i = serverService.insertServer(business);
        return ResponseEntity.success(i);
    }
    /*
    *
    * */
    @GetMapping("/corderdetails")
    public ResponseEntity<ReminderRecordVo> allReminderRecord(){
        return serverService.getCorderdetails();
    }
    /*
    *查询所有服务订单
    * */
    @GetMapping("/allorder")
    public  ResponseEntity<ServerOrderVo> allServerOrder(){
        return serverService.allServerOrder();
    }
    /*
    * 免运费设定
    * */
    @PutMapping("/freight")
    public ResponseEntity setFreight(@RequestBody FullReduction fullReduction){
        int i = serverService.insertFullReduction(fullReduction);
        return ResponseEntity.success(i);
    }
    /*
    * 查询所有预售的商品
    * */
    @GetMapping("/presale")
    public ResponseEntity<PreSaleVo> allPreSale(){
        return serverService.allPreSale();
    }
    /*
    * 查询所有商品
    * */
    @GetMapping("/allshop")
    public ResponseEntity<ShopVo> allshop(){
        return serverService.allshop();
    }
    /*
    * 跟据显示的商品列表 选择一个商品插入到商品预售表中
    * */
    @PutMapping("/addoneshop")
     ResponseEntity addshop(@RequestBody PreSale preSale){
         int i = serverService.insertPreShop(preSale);
         return ResponseEntity.success(i);
    }

}
