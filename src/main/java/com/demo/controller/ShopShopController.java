package com.demo.controller;

import com.demo.commons.result.BaseResult;
import com.demo.commons.vo.ShopShopInsertVo;
import com.demo.commons.vo.ShopShopSelectVo;
import com.demo.commons.vo.ShopShopUpdateVo;
import com.demo.service.ShopShopService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/shop")
public class ShopShopController {
    @Resource
    ShopShopService shopShopService;

    /*
    * 根据状态展示上架门店和下架门店
    * status：上线状态，0表示下线，1表示上线
    * */
    @GetMapping("/uporout")
    public BaseResult<List<ShopShopSelectVo>> selectFShopList(int status){
        List<ShopShopSelectVo> shopVos = shopShopService.selectFShopList(status);
        return BaseResult.success(shopVos);
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

    @PostMapping("/addshop")
    public BaseResult insertFShop(@RequestBody ShopShopInsertVo shop){
        int num = shopShopService.insertFShop(shop);
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

    @PutMapping("/updateshop")
    public BaseResult updateFShopBysId(@RequestBody ShopShopUpdateVo shop){
        int num = shopShopService.updateFShopBysId(shop);
        return BaseResult.success(num);
    }

    /*
    * 门店下架
    * */
    @PutMapping("/outshop")
    public BaseResult updatesStatusOut(int id){
        int num = shopShopService.updatesStatusOut(id);
        return BaseResult.success(num);
    }

    /*
     * 门店上架
     * */
    @PutMapping("/upshop")
    public BaseResult updatesStatusUp(int id){
        int num = shopShopService.updatesStatusUp(id);
        return BaseResult.success(num);

    }

    /*
     * 门店删除
     * */
    @PutMapping("/deleteshop")
    public BaseResult updateDeleteStatus(int id){
        int num = shopShopService.updateDeleteStatus(id);
        return BaseResult.success(num);
    }
}
