package com.demo.controller;

import com.demo.commons.result.BaseResult;
import com.demo.commons.vo.FCommentVo;
import com.demo.entity.FComment;
import com.demo.entity.FMerchantType;
import com.demo.service.FCommentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/fcomment")
public class FCommentController {
    @Resource
    FCommentService fCommentService;

    /*
     * 展示评论表
     * */
    @GetMapping("/selectFCommentList")
    public BaseResult selectFCommentList(){
        List<FCommentVo> fCommentVos = fCommentService.selectFCommentList();
        return BaseResult.success(fCommentVos);
    }

    /*
     * 商家回复
     * */
    @PutMapping("/insertReplyByUid")
    public BaseResult insertReplyByUid(int commentId,String commentReply){
        int num = fCommentService.insertReplyByUid(commentId,commentReply);
        return BaseResult.success(num);
    }

    /*
     * 删除评论
     * */
    @PutMapping("/deleteReplyByCommentId")
    public BaseResult deleteReplyByCommentId(int commentId){
        int num = fCommentService.deleteReplyByCommentId(commentId);
        return BaseResult.success(num);
    }
}
