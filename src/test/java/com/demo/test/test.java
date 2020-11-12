package com.demo.test;

import com.demo.commons.vo.FAuditSelectVo;
import com.demo.service.impl.FAuditServiceImpl;

import java.util.List;

public class test {
    public static void main(String[] args) {
        FAuditServiceImpl fAuditService = new FAuditServiceImpl();
        List<FAuditSelectVo> fAuditSelectVos = fAuditService.selectFAuditList(1);
        System.out.println(fAuditSelectVos);
    }
}
