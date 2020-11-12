package com.demo.controller;

import com.demo.commons.result.BaseResult;
import com.demo.commons.vo.ShopTakeoutTypeVo;
import com.demo.entity.ShopTakeoutType;
import com.demo.service.ShopTakeoutTypeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ftakeouttype")
public class ShopTakeoutTypeController {
    @Resource
    ShopTakeoutTypeService shopTakeoutTypeService;

    /*
    * 显示所有的外卖分类
    * */
    @GetMapping("/selectftakeout")
    public BaseResult<List<ShopTakeoutType>> selectFTakeoutTypeList(){
        List<ShopTakeoutType> shopTakeoutTypes = shopTakeoutTypeService.selectFTakeoutTypeList();
        return BaseResult.success(shopTakeoutTypes);
    }

    /*
    * 新增分类
    * */

    /*{
        "tname": "饮品",
        "tsort": 10,
        "tstate": 1
    }*/

    @PostMapping("/insertftakeout")
    public BaseResult insertFTakeoutType(@RequestBody ShopTakeoutTypeVo shopTakeoutTypeVo){
        int num = shopTakeoutTypeService.insertFTakeoutType(shopTakeoutTypeVo);
        return BaseResult.success(num);
    }

    /*
    * 修改分类信息
    * */

    /*{
        "tid": 4,
        "tname": "小龙虾",
        "tsort": 10,
        "tstate": 1
    }*/

    @PutMapping("/updateftakeout")
    public BaseResult updateFTakeoutTypeById(@RequestBody ShopTakeoutType shopTakeoutType){
        int num = shopTakeoutTypeService.updateFTakeoutTypeById(shopTakeoutType);
        return BaseResult.success(num);
    }

    /*
    * 删除分类
    * */
    @PutMapping("/deleteftakeout")
    public BaseResult deleteFTakeoutTypeById(int tId){
        int num = shopTakeoutTypeService.deleteFTakeoutTypeById(tId);
        return BaseResult.success(num);
    }
}
