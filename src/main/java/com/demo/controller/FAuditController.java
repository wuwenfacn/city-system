package com.demo.controller;

import com.demo.commons.result.BaseResult;
import com.demo.commons.vo.FAuditUpdateVo;
import com.demo.service.FAuditService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/faudit")
public class FAuditController {
    @Resource
    FAuditService fAuditService;

    /*
    * 根据门店编号修改审核信息
    * */

    /*{
        "sid": 2,
            "aname": "5",
            "areserve": 5,
            "aserve": 5,
            "alabel": "5",
            "abusiness": "5",
            "aprovince": "5",
            "acity": "5",
            "adistrict": "5",
            "atrading": "5",
            "aaddress": "5"
    }*/
    @PutMapping("/update")
    public BaseResult updateFAuditById(@RequestBody FAuditUpdateVo fAuditUpdateVo){
        int num = fAuditService.updateFAuditById(fAuditUpdateVo);
        return BaseResult.success(num);
    }
}
