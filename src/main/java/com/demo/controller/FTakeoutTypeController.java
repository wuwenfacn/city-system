package com.demo.controller;

import com.demo.commons.result.BaseResult;
import com.demo.commons.vo.FShopInsertVo;
import com.demo.commons.vo.FShopUpdateVo;
import com.demo.commons.vo.FTakeoutTypeVo;
import com.demo.entity.FTakeoutType;
import com.demo.service.FTakeoutTypeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ftakeouttype")
public class FTakeoutTypeController {
    @Resource
    FTakeoutTypeService fTakeoutTypeService;

    /*
    * 显示所有的外卖分类
    * */
    @GetMapping("/selectftakeout")
    public BaseResult<List<FTakeoutType>> selectFTakeoutTypeList(){
        List<FTakeoutType> fTakeoutTypes = fTakeoutTypeService.selectFTakeoutTypeList();
        return BaseResult.success(fTakeoutTypes);
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
    public BaseResult insertFTakeoutType(@RequestBody FTakeoutTypeVo fTakeoutTypeVo){
        int num = fTakeoutTypeService.insertFTakeoutType(fTakeoutTypeVo);
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
    public BaseResult updateFTakeoutTypeById(@RequestBody FTakeoutType fTakeoutType){
        int num = fTakeoutTypeService.updateFTakeoutTypeById(fTakeoutType);
        return BaseResult.success(num);
    }

    /*
    * 删除分类
    * */
    @PutMapping("/deleteftakeout")
    public BaseResult deleteFTakeoutTypeById(int tId){
        int num = fTakeoutTypeService.deleteFTakeoutTypeById(tId);
        return BaseResult.success(num);
    }
}
