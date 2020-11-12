package com.demo.service.impl;

import com.demo.commons.exception.ServiceException;
import com.demo.commons.result.ResultCodeEnum;
import com.demo.commons.vo.ShopCommentVo;
import com.demo.mapper.ShopCommentMapper;
import com.demo.service.ShopCommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShopCommentServiceImpl implements ShopCommentService {
    @Resource
    ShopCommentMapper shopCommentMapper;

    /*
     * 展示评论表
     * */
    @Override
    public List<ShopCommentVo> selectFCommentList() {
        List<ShopCommentVo> shopCommentVos = shopCommentMapper.selectFCommentList();
        /*
         * 如果查找失败就抛出异常 “ 系统繁忙，请稍后重试 ”
         * */
        if(shopCommentVos.size() < 1){
            throw new ServiceException(ResultCodeEnum.SYSTEM_INNER_ERROR);
        }
        return shopCommentVos;
    }

    /*
     * 商家回复
     * */
    @Override
    public int insertReplyByUid(int commentId,String commentReply) {
        int num = shopCommentMapper.insertReplyByCommentId(commentId, commentReply);
        /*
         * 如果没有修改成功就抛出异常 “ 数据错误 ”
         * */
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }

    /*
     * 删除评论
     * */
    @Override
    public int deleteReplyByCommentId(int commentId) {
        int num = shopCommentMapper.deleteReplyByCommentId(commentId);
        /*
         * 如果没有修改成功就抛出异常 “ 数据错误 ”
         * */
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }
}
