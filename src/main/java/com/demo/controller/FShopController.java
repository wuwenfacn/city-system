package com.demo.controller;

import com.demo.commons.result.BaseResult;
import com.demo.commons.vo.FShopInsertVo;
import com.demo.commons.vo.FShopSelectVo;
import com.demo.commons.vo.FShopUpdateVo;
import com.demo.entity.FShop;
import com.demo.service.FShopService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/fshop")
public class FShopController {
    @Resource
    FShopService fShopService;

    /*
    * status：上线状态，0表示下线，1表示上线
    * */
    @GetMapping("/uporout")
    public BaseResult<List<FShopSelectVo>> selectFShopList(int status){
        List<FShopSelectVo> fShopVos = fShopService.selectFShopList(status);
        return BaseResult.success(fShopVos);
    }

    /*
    * 新增门店
    * */

    /*{
        "sname": "3",
            "sreserve": 3,
            "sserve": 3,
            "slabel": "3",
            "slogo": "3",
            "sbackImg": "3",
            "sproductImg": "3",
            "senvironmentImg": "3",
            "selseImg": "3",
            "sbusiness": "3",
            "sprovince": "3",
            "scity": "3",
            "sdistrict": "3",
            "strading": "3",
            "saddress": "3",
            "spath": "3",
            "slinkman": "3",
            "sphone": "3",
            "sbusinessHours": "2020-11-09",
            "sbrief": "3"
    }*/

    @PostMapping("/insertfshop")
    public BaseResult insertFShop(@RequestBody FShopInsertVo fShop){
        int num = fShopService.insertFShop(fShop);
        return BaseResult.success(num);
    }

    /*
    * 门店资料更新
    * */

    /*{
        "sid": 5,
        "slogo": "6",
        "sbackImg": "6",
        "sproductImg": "6",
        "senvironmentImg": "6",
        "selseImg": "6",
        "saddress": "6",
        "spath": "6",
        "slinkman": "6",
        "sphone": "6",
        "sbusinessHours": "2020-11-10",
        "sbrief": "6"
    }*/

    @PutMapping("/updatefshop")
    public BaseResult updateFShopBysId(@RequestBody FShopUpdateVo fShop){
        int num = fShopService.updateFShopBysId(fShop);
        return BaseResult.success(num);
    }

    /*
    * 门店下架
    * */
    @PutMapping("/outfshop")
    public BaseResult updatesStatusOut(int sId){
        int num = fShopService.updatesStatusOut(sId);
        return BaseResult.success(num);
    }

    /*
     * 门店上架
     * */
    @PutMapping("/upfshop")
    public BaseResult updatesStatusUp(int sId){
        int num = fShopService.updatesStatusUp(sId);
        return BaseResult.success(num);
    }

    /*
     * 门店删除
     * */
    @PutMapping("/deletefshop")
    public BaseResult updateDeleteStatus(int sId){
        int num = fShopService.updateDeleteStatus(sId);
        return BaseResult.success(num);
    }
}
