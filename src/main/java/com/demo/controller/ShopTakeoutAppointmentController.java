package com.demo.controller;

import com.demo.commons.result.BaseResult;
import com.demo.commons.vo.ShopTakeoutAppointmentVo;
import com.demo.entity.ShopTakeoutAppointment;
import com.demo.service.ShopTakeoutAppointmentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ftakeoutappointment")
public class ShopTakeoutAppointmentController {
    @Resource
    ShopTakeoutAppointmentService shopTakeoutAppointmentService;

    /*
     * 展示所有的预约信息
     * */
    @GetMapping("/selectftakeoutappointmentlist")
    public BaseResult<List<ShopTakeoutAppointment>> selectFTakeoutAppointmentList(){
        List<ShopTakeoutAppointment> shopTakeoutAppointments = shopTakeoutAppointmentService.selectFTakeoutAppointmentList();
        return BaseResult.success(shopTakeoutAppointments);
    }

    /*
     * 新增预约
     * */

    /*{
        "aname": "预约外卖4",
        "aprice": "100",
        "atime": "2020-11-10",
        "anumber": "6",
        "aremark": "xxx"
    }*/

    @PostMapping("/insertftakeoutcommodity")
    public BaseResult insertFTakeoutCommodity(@RequestBody ShopTakeoutAppointmentVo shopTakeoutAppointmentVo){
        int num = shopTakeoutAppointmentService.insertFTakeoutAppointment(shopTakeoutAppointmentVo);
        return BaseResult.success(num);
    }

    /*
     * 修改预约
     * */

    /*{
        "aid": 4,
        "aname": "预约外卖4",
        "aprice": "200",
        "atime": "2020-11-10",
        "anumber": "6",
        "aremark": "xxx"
    }*/

    @PutMapping("/updateFTakeoutCommodity")
    public BaseResult updateFTakeoutCommodity(@RequestBody ShopTakeoutAppointment shopTakeoutAppointment){
        int num = shopTakeoutAppointmentService.updateFTakeoutAppointment(shopTakeoutAppointment);
        return BaseResult.success(num);
    }

    /*
     * 删除预约
     * */
    @PutMapping("/deleteFTakeoutCommodityById")
    public BaseResult deleteFTakeoutCommodityById(int aId){
        int num = shopTakeoutAppointmentService.deleteFTakeoutAppointment(aId);
        return BaseResult.success(num);
    }
}
