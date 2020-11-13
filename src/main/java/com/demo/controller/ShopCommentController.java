package com.demo.controller;

import com.demo.commons.result.BaseResult;
import com.demo.commons.vo.ShopCommentVo;
import com.demo.service.ShopCommentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/comment")
public class ShopCommentController {
    @Resource
    ShopCommentService shopCommentService;

    /*
     * 展示评论表
     * */
    @GetMapping("/showcomment")
    public BaseResult selectFCommentList(){
        List<ShopCommentVo> shopCommentVos = shopCommentService.selectFCommentList();
        return BaseResult.success(shopCommentVos);
    }

    /*
     * 商家回复
     * */
    @PutMapping("/merchantreply")
    public BaseResult insertReplyByUid(int commentId,String commentReply){
        int num = shopCommentService.insertReplyByUid(commentId,commentReply);
        return BaseResult.success(num);
    }

    /*
     * 删除评论
     * */
    @PutMapping("/deletecomment")
    public BaseResult deleteReplyByCommentId(int commentId){
        int num = shopCommentService.deleteReplyByCommentId(commentId);
        return BaseResult.success(num);
    }
}
