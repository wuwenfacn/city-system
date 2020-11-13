package com.demo.controller;

import com.demo.commons.result.BaseResult;
import com.demo.commons.vo.ShopAuditSelectVo;
import com.demo.commons.vo.ShopAuditUpdateVo;
import com.demo.service.ShopAuditService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/audit")
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
    @PutMapping("/updateaudit")
    public BaseResult updateFAuditById(@RequestBody ShopAuditUpdateVo shopAuditUpdateVo){
        int num = shopAuditService.updateFAuditById(shopAuditUpdateVo);
        return BaseResult.success(num);
    }

    /*
    * 对下架申请进行审核，审核通过则允许下架
    * */
    @PutMapping("/auditout")
    public BaseResult updatesStatusOut(int id, int pass, String passReason){
        int num = shopAuditService.updatesStatusOut(id,pass,passReason);
        return BaseResult.success(num);
    }

    /*
     * 对上架申请进行审核，审核通过则允许上架
     * */
    @PutMapping("/auditup")
    public BaseResult updatesStatusUp(int id, int pass, String passReason){
        int num = shopAuditService.updatesStatusUp(id,pass,passReason);
        return BaseResult.success(num);
    }

    /*
     * 对删除申请进行审核，审核通过则允许删除
     * */
    @PutMapping("/auditdelete")
    public BaseResult updateDeleteStatus(int id, int pass, String passReason){
        int num = shopAuditService.updateDeleteStatus(id,pass,passReason);
        return BaseResult.success(num);
    }

    /*
     * 显示所有要审核的数据
     * aStatus：审核状态，1表示已审核，2表示未审核
     * */
    @GetMapping("/showaudit")
    public BaseResult<List<ShopAuditSelectVo>> selectFAuditList(int status){
        List<ShopAuditSelectVo> audits = shopAuditService.selectFAuditList(status);
        return BaseResult.success(audits);
    }
}
