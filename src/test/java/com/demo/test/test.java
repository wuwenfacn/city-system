package com.demo.test;

import com.demo.commons.vo.ShopAuditSelectVo;
import com.demo.service.impl.ShopAuditServiceImpl;

import java.util.List;

public class test {
    public static void main(String[] args) {
        ShopAuditServiceImpl fAuditService = new ShopAuditServiceImpl();
        List<ShopAuditSelectVo> shopAuditSelectVos = fAuditService.selectFAuditList(1);
        System.out.println(shopAuditSelectVos);
    }
}
