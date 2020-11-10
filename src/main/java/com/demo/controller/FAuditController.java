package com.demo.controller;

import com.demo.commons.result.BaseResult;
import com.demo.commons.vo.FAuditSelectVo;
import com.demo.commons.vo.FAuditUpdateVo;
import com.demo.commons.vo.FShopSelectVo;
import com.demo.entity.FAudit;
import com.demo.service.FAuditService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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
    @PutMapping("/updatefaudit")
    public BaseResult updateFAuditById(@RequestBody FAuditUpdateVo fAuditUpdateVo){
        int num = fAuditService.updateFAuditById(fAuditUpdateVo);
        return BaseResult.success(num);
    }

    /*
    * 对下架申请进行审核，审核通过则允许下架
    * */
    @PutMapping("/updatesstatusout")
    public BaseResult updatesStatusOut(int sId, int aPass, String aPassReason){
        int num = fAuditService.updatesStatusOut(sId,aPass,aPassReason);
        return BaseResult.success(num);
    }

    /*
     * 对上架申请进行审核，审核通过则允许上架
     * */
    @PutMapping("/updatesstatusup")
    public BaseResult updatesStatusUp(int sId, int aPass, String aPassReason){
        int num = fAuditService.updatesStatusUp(sId,aPass,aPassReason);
        return BaseResult.success(num);
    }

    /*
     * 对删除申请进行审核，审核通过则允许删除
     * */
    @PutMapping("/updatedeletestatus")
    public BaseResult updateDeleteStatus(int sId, int aPass, String aPassReason){
        int num = fAuditService.updateDeleteStatus(sId,aPass,aPassReason);
        return BaseResult.success(num);
    }

    /*
     * 显示所有要审核的数据
     * aStatus：审核状态，1表示已审核，2表示未审核
     * */
    @GetMapping("/selectfauditlist")
    public BaseResult<List<FAuditSelectVo>> selectFAuditList(int aStatus){
        List<FAuditSelectVo> fAudits = fAuditService.selectFAuditList(aStatus);
        return BaseResult.success(fAudits);
    }
}
