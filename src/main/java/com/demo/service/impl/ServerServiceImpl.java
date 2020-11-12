package com.demo.service.impl;

import com.demo.commons.vo.*;
import com.demo.entity.Shop;
import com.demo.entity.server.*;
import com.demo.mapper.ServiceMapper;
import com.demo.service.ServerService;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServerServiceImpl implements ServerService {

    @Resource
    ServiceMapper serviceMapper;

    /*
    * 查询所有已上架的服务
    * */
    @Override
    public ResponseEntity<BusinessVo> getAllOrder() {
        ResponseEntity<BusinessVo> responseEntity = new ResponseEntity<>();
        List<BusinessVo> list=new ArrayList<>();
        list = serviceMapper.allServer();
        responseEntity.setStatus(200);
        responseEntity.setMsg("success");
        responseEntity.setData(list);
        return responseEntity;
    }
    /*
     * 编辑已上架的服务---插入操作
     * */
    @Override
    public int insertServer(Business business) {

        return serviceMapper.updateServer(business);
    }

    /*
    * 查询所有催帐单
    * */
    @Override
    public ResponseEntity<ReminderRecordVo> getCorderdetails() {
        ResponseEntity<ReminderRecordVo> responseEntity = new ResponseEntity<>();
        //包装类集合
        List<ReminderRecordVo> list=new ArrayList<>();
        ReminderRecordVo reminderRecordVo;
        List<ReminderRecord> corderdetails = serviceMapper.allCorderdetails();

        for (ReminderRecord cor: corderdetails
             ) {
            reminderRecordVo=new ReminderRecordVo();
            BeanUtils.copyProperties(cor,reminderRecordVo);
            list.add(reminderRecordVo);
        }
        responseEntity.setStatus(200);
        responseEntity.setMsg("success");
        responseEntity.setData(list);
        return responseEntity;
    }
    /*
    * 查询所有服务订单
    * */
    @Override
    public ResponseEntity<ServerOrderVo> allServerOrder() {
        ResponseEntity<ServerOrderVo> responseEntity = new ResponseEntity<>();
        ServerOrderVo serverOrderVo=new ServerOrderVo();
        List<ServerOrder> serverOrders = serviceMapper.allServerOrder();
        List<ServerOrderVo> list =new ArrayList<>();
        for (ServerOrder ser:serverOrders
             ) {
            serverOrderVo=new ServerOrderVo();
            BeanUtils.copyProperties(ser,serverOrderVo);
            list.add(serverOrderVo);
        }
        responseEntity.setStatus(200);
        responseEntity.setMsg("success");
        responseEntity.setData(list);
        return responseEntity;
    }
    /*
    * 免运费设定
    * */
    @Override
    public int insertFullReduction(FullReduction fullReduction) {
        return serviceMapper.insertFullReduction(fullReduction);
    }
    /*
    * 查询所有的预售商品
    * */
    @Override
    public ResponseEntity<PreSaleVo> allPreSale() {
        ResponseEntity<PreSaleVo> responseEntity=new ResponseEntity<>();
        List<PreSale> preSales = serviceMapper.getallPreSale();
        List<PreSaleVo> list=new ArrayList<>();
        PreSaleVo preSaleVo ;
        for (PreSale pre:preSales
             ) {
            preSaleVo= new PreSaleVo();
            BeanUtils.copyProperties(pre,preSaleVo);
            list.add(preSaleVo);
        }
        responseEntity.setStatus(200);
        responseEntity.setMsg("success");
        responseEntity.setData(list);
        return responseEntity;
    }

    /*
    * 查询所以有商品
    * */
    @Override
    public ResponseEntity<ShopVo> allshop() {
        ResponseEntity<ShopVo> responseEntity=new ResponseEntity<>();
        List<Shop> shops = serviceMapper.allShop();
        List<ShopVo> list = new ArrayList<>();
        ShopVo shopVo;
        for (Shop shop:shops
             ) {
            shopVo=new ShopVo();
            BeanUtils.copyProperties(shop,shopVo);
            list.add(shopVo);
        }
        responseEntity.setStatus(200);
        responseEntity.setMsg("success");
        responseEntity.setData(list);
        return responseEntity;
    }

    @Override
    public int insertPreShop(PreSale preSale) {
        return serviceMapper.addShop(preSale);
    }


}
