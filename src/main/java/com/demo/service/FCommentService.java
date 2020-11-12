package com.demo.service;

import com.demo.commons.vo.FCommentVo;
import com.demo.entity.FComment;

import java.util.List;

public interface FCommentService {
    /*
     * 展示评论表
     * */
    List<FCommentVo> selectFCommentList();

    /*
     * 商家回复
     * */
    int insertReplyByUid(int commentId,String commentReply);

    /*
     * 删除评论
     * */
    int deleteReplyByCommentId(int commentId);
}
