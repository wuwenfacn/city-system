package com.demo.controller;

import com.demo.commons.result.BaseResult;
import com.demo.commons.vo.ShopTakeoutTypeVo;
import com.demo.entity.ShopTakeoutType;
import com.demo.service.ShopTakeoutTypeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/takeouttype")
public class ShopTakeoutTypeController {
    @Resource
    ShopTakeoutTypeService shopTakeoutTypeService;

    /*
    * 显示所有的外卖分类
    * */
    @GetMapping("/showtype")
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

    @PostMapping("/addtype")
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

    @PutMapping("/updatetype")
    public BaseResult updateFTakeoutTypeById(@RequestBody ShopTakeoutType shopTakeoutType){
        int num = shopTakeoutTypeService.updateFTakeoutTypeById(shopTakeoutType);
        return BaseResult.success(num);
    }

    /*
    * 删除分类
    * */
    @PutMapping("/deletetype")
    public BaseResult deleteFTakeoutTypeById(int id){
        int num = shopTakeoutTypeService.deleteFTakeoutTypeById(id);
        return BaseResult.success(num);
    }
}
