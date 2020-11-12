package com.demo.mapper;

import com.demo.commons.vo.BusinessVo;
import com.demo.commons.vo.OrderVo;
import com.demo.commons.vo.ResponseEntity;
import com.demo.entity.Shop;
import com.demo.entity.server.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ServiceMapper {
    /*
    * 查询所有的已上架的服务
    * */
    List<BusinessVo> allServer();
    /*
    * 编辑已上架的服务
    * */
    int updateServer(@Param("business") Business business);

    /*
    * 批量删除上架的服务
    * */
    ResponseEntity<OrderVo> delServer(java.awt.List list);
    /*
    * 根据id删除上架的服务
    * */
    ResponseEntity delSingleServer(int id);

   List<ReminderRecord> allCorderdetails();
   /*
   * 查询服务订单
   * */
    List<ServerOrder> allServerOrder();
    /*
    * 免运费设置
    * */
    int insertFullReduction(@Param("fullReduction") FullReduction fullReduction);
    /*
    * 查询所有的预售商品
    * */
    List<PreSale> getallPreSale();
    /*
    * 查询所有的商品
    * */
    List<Shop> allShop();
    /*
    * 添加预售商品
    * */
    int addShop(@Param("preSale") PreSale preSale);
}
