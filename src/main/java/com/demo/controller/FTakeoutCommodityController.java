package com.demo.controller;

import com.demo.commons.result.BaseResult;
import com.demo.commons.vo.FTakeoutCommodityVo;
import com.demo.entity.FTakeoutCommodity;
import com.demo.service.FTakeoutCommodityService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ftakeoutcommodity")
public class FTakeoutCommodityController {
    @Resource
    FTakeoutCommodityService fTakeoutCommodityService;

    /*
     * 显示所有的外卖商品信息
     * */
    @GetMapping("/selectftakeoutcommodity")
    public BaseResult<List<FTakeoutCommodity>> selectFTakeoutCommodityList(){
        List<FTakeoutCommodity> fTakeoutCommodities = fTakeoutCommodityService.selectFTakeoutCommodityList();
        return BaseResult.success(fTakeoutCommodities);
    }

    /*
     * 新增外卖商品
     * */

    /*{
        "cname": "烤肉",
        "ctype": "烧烤",
        "cimg": "xxx.jpg",
        "cprice": "99.99"
    }*/

    @PostMapping("/insertftakeoutcommodity")
    public BaseResult insertFTakeoutCommodity(@RequestBody FTakeoutCommodityVo fTakeoutCommodityVo){
        int num = fTakeoutCommodityService.insertFTakeoutCommodity(fTakeoutCommodityVo);
        return BaseResult.success(num);
    }

    /*
     * 修改外卖商品信息
     * */

    /*{
        "cid":4,
        "cname": "烤肉",
        "ctype": "烧烤",
        "cimg": "xxx.jpg",
        "cprice": "199.99"
    }*/

    @PutMapping("/updateftakeoutcommodity")
    public BaseResult updateFTakeoutCommodity(@RequestBody FTakeoutCommodity fTakeoutCommodity){
        int num = fTakeoutCommodityService.updateFTakeoutCommodity(fTakeoutCommodity);
        return BaseResult.success(num);
    }

    /*
     * 删除外卖商品
     * */
    @PutMapping("/deleteftakeoutcommodity")
    public BaseResult deleteFTakeoutCommodityById(int cId){
        int num = fTakeoutCommodityService.deleteFTakeoutCommodityById(cId);
        return BaseResult.success(num);
    }
}
