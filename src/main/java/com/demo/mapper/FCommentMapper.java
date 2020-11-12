package com.demo.mapper;

import com.demo.commons.vo.FCommentVo;
import com.demo.entity.FComment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FCommentMapper {
    /*
    * 展示评论表
    * */
    List<FCommentVo> selectFCommentList();

    /*
    * 商家回复
    * */
    int insertReplyByCommentId(@Param("commentId")int commentId,@Param("commentReply") String commentReply);

    /*
    * 删除评论
    * */
    int deleteReplyByCommentId(@Param("commentId")int commentId);

}
