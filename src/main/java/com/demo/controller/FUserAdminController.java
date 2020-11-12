package com.demo.controller;

import com.demo.commons.result.BaseResult;
import com.demo.entity.FUser;
import com.demo.service.FUserAdminService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/fuseradmin")
public class FUserAdminController {
    @Resource
    FUserAdminService fUserAdminService;

    /*
    * 展示所有用户信息
    * */
    @GetMapping("/selectFUserList")
    public BaseResult<List<FUser>> selectFUserList() {
        List<FUser> fUsers = fUserAdminService.selectFUserList();
        return BaseResult.success(fUsers);
    }

    /*
    * 删除用户
    * */
    @PutMapping("/deleteUser")
    public BaseResult deleteUser(int uId) {
        int num = fUserAdminService.deleteUser(uId);
        return BaseResult.success(num);
    }
}
