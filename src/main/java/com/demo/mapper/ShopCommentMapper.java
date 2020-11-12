package com.demo.mapper;

import com.demo.commons.vo.ShopCommentVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopCommentMapper {
    /*
    * 展示评论表
    * */
    List<ShopCommentVo> selectFCommentList();

    /*
    * 商家回复
    * */
    int insertReplyByCommentId(@Param("commentId")int commentId,@Param("commentReply") String commentReply);

    /*
    * 删除评论
    * */
    int deleteReplyByCommentId(@Param("commentId")int commentId);

}
