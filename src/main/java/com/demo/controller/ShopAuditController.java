package com.demo.controller;

import com.demo.commons.result.BaseResult;
import com.demo.commons.vo.ShopAuditSelectVo;
import com.demo.commons.vo.ShopAuditUpdateVo;
import com.demo.service.ShopAuditService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/faudit")
public class ShopAuditController {
    @Resource
    ShopAuditService shopAuditService;

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
    public BaseResult updateFAuditById(@RequestBody ShopAuditUpdateVo shopAuditUpdateVo){
        int num = shopAuditService.updateFAuditById(shopAuditUpdateVo);
        return BaseResult.success(num);
    }

    /*
    * 对下架申请进行审核，审核通过则允许下架
    * */
    @PutMapping("/updatesstatusout")
    public BaseResult updatesStatusOut(int sId, int aPass, String aPassReason){
        int num = shopAuditService.updatesStatusOut(sId,aPass,aPassReason);
        return BaseResult.success(num);
    }

    /*
     * 对上架申请进行审核，审核通过则允许上架
     * */
    @PutMapping("/updatesstatusup")
    public BaseResult updatesStatusUp(int sId, int aPass, String aPassReason){
        int num = shopAuditService.updatesStatusUp(sId,aPass,aPassReason);
        return BaseResult.success(num);
    }

    /*
     * 对删除申请进行审核，审核通过则允许删除
     * */
    @PutMapping("/updatedeletestatus")
    public BaseResult updateDeleteStatus(int sId, int aPass, String aPassReason){
        int num = shopAuditService.updateDeleteStatus(sId,aPass,aPassReason);
        return BaseResult.success(num);
    }

    /*
     * 显示所有要审核的数据
     * aStatus：审核状态，1表示已审核，2表示未审核
     * */
    @GetMapping("/selectfauditlist")
    public BaseResult<List<ShopAuditSelectVo>> selectFAuditList(int aStatus){
        List<ShopAuditSelectVo> fAudits = shopAuditService.selectFAuditList(aStatus);
        return BaseResult.success(fAudits);
    }
}
