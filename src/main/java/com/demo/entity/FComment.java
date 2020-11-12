package com.demo.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/*create table f_comment
        (
        comment_id int auto_increment primary key comment '评论表id',
        c_id int default null comment '商品表的外键',
        u_id int default null comment '用户表的外键',
        comment_star int default 5 comment'评论星级',
        comment_content varchar(255) default null comment '评论内容',
        comment_image varchar(255) default null comment '评论图片',
        comment_reply varchar(255) default null comment '商家回复',
        comment_create_time datetime default null comment '评论时间',
        delete_status int default 1 comment '是否删除，1表示正常，0表示已删除'
        )comment '评论表';*/

@Data
public class FComment implements Serializable {
    /**
     * 评论表id
     */
    private Integer commentId;

    /**
     * 商品表的外键
     */
    /*private Integer cId;*/

    /**
     * 用户表的外键
     */
    /*private Integer uId;*/

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

    /**
     * 评论时间
     */
    private Date commentCreateTime;

    /**
     * 是否删除，1表示正常，0表示已删除
     */
    /*private Integer deleteStatus;*/

    private static final long serialVersionUID = 1L;
}

