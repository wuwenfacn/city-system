package com.demo.commons.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class FCommentVo {
    /**
     * 评论表id
     */
    private Integer commentId;

    /**
     * 评论星级
     */
    private Integer commentStar;

    /**
     * 评论内容
     */
    private String commentContent;

    /**
     * 评论图片
     */
    private String commentImage;

    /**
     * 商家回复
     */
    private String commentReply;

    /*
    * 商品表的外键
    * */
    private String cName;

    /*
     * 用户表的外键
     * */
    private String uUsername;

    /**
     * 评论时间
     */
    private Date commentCreateTime;

}

