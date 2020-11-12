package com.demo.controller;

import com.demo.commons.result.BaseResult;
import com.demo.commons.vo.ShopTakeoutCommodityVo;
import com.demo.entity.ShopTakeoutCommodity;
import com.demo.service.ShopTakeoutCommodityService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ftakeoutcommodity")
public class ShopTakeoutCommodityController {
    @Resource
    ShopTakeoutCommodityService shopTakeoutCommodityService;

    /*
     * 显示所有的外卖商品信息
     * */
    @GetMapping("/selectftakeoutcommodity")
    public BaseResult<List<ShopTakeoutCommodity>> selectFTakeoutCommodityList(){
        List<ShopTakeoutCommodity> fTakeoutCommodities = shopTakeoutCommodityService.selectFTakeoutCommodityList();
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
    public BaseResult insertFTakeoutCommodity(@RequestBody ShopTakeoutCommodityVo shopTakeoutCommodityVo){
        int num = shopTakeoutCommodityService.insertFTakeoutCommodity(shopTakeoutCommodityVo);
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
    public BaseResult updateFTakeoutCommodity(@RequestBody ShopTakeoutCommodity shopTakeoutCommodity){
        int num = shopTakeoutCommodityService.updateFTakeoutCommodity(shopTakeoutCommodity);
        return BaseResult.success(num);
    }

    /*
     * 删除外卖商品
     * */
    @PutMapping("/deleteftakeoutcommodity")
    public BaseResult deleteFTakeoutCommodityById(int cId){
        int num = shopTakeoutCommodityService.deleteFTakeoutCommodityById(cId);
        return BaseResult.success(num);
    }
}
