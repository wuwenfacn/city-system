package com.demo.controller;

import com.demo.commons.result.BaseResult;
import com.demo.commons.vo.FTakeoutAppointmentVo;
import com.demo.commons.vo.FTakeoutCommodityVo;
import com.demo.entity.FTakeoutAppointment;
import com.demo.service.FTakeoutAppointmentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ftakeoutappointment")
public class FTakeoutAppointmentController {
    @Resource
    FTakeoutAppointmentService fTakeoutAppointmentService;

    /*
     * 展示所有的预约信息
     * */
    @GetMapping("/selectftakeoutappointmentlist")
    public BaseResult<List<FTakeoutAppointment>> selectFTakeoutAppointmentList(){
        List<FTakeoutAppointment> fTakeoutAppointments = fTakeoutAppointmentService.selectFTakeoutAppointmentList();
        return BaseResult.success(fTakeoutAppointments);
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
    public BaseResult insertFTakeoutCommodity(@RequestBody FTakeoutAppointmentVo fTakeoutAppointmentVo){
        int num = fTakeoutAppointmentService.insertFTakeoutAppointment(fTakeoutAppointmentVo);
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
    public BaseResult updateFTakeoutCommodity(@RequestBody FTakeoutAppointment fTakeoutAppointment){
        int num = fTakeoutAppointmentService.updateFTakeoutAppointment(fTakeoutAppointment);
        return BaseResult.success(num);
    }

    /*
     * 删除预约
     * */
    @PutMapping("/deleteFTakeoutCommodityById")
    public BaseResult deleteFTakeoutCommodityById(int aId){
        int num = fTakeoutAppointmentService.deleteFTakeoutAppointment(aId);
        return BaseResult.success(num);
    }
}
