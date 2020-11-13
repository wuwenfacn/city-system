package com.demo.controller;

import com.demo.commons.result.BaseResult;
import com.demo.entity.ShopUser;
import com.demo.service.ShopUserAdminService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/useradmin")
public class ShopUserAdminController {
    @Resource
    ShopUserAdminService shopUserAdminService;

    /*
    * 展示所有用户信息
    * */
    @GetMapping("/showuser")
    public BaseResult<List<ShopUser>> selectFUserList() {
        List<ShopUser> shopUsers = shopUserAdminService.selectFUserList();
        return BaseResult.success(shopUsers);
    }

    /*
    * 删除用户
    * */
    @PutMapping("/deleteuser")
    public BaseResult deleteUser(int id) {
        int num = shopUserAdminService.deleteUser(id);
        return BaseResult.success(num);
    }
}
