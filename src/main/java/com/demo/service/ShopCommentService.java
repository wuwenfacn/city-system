package com.demo.service;

import com.demo.commons.vo.ShopCommentVo;

import java.util.List;

public interface ShopCommentService {
    /*
     * 展示评论表
     * */
    List<ShopCommentVo> selectFCommentList();

    /*
     * 商家回复
     * */
    int insertReplyByUid(int commentId,String commentReply);

    /*
     * 删除评论
     * */
    int deleteReplyByCommentId(int commentId);
}
