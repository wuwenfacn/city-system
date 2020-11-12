package com.demo.service.impl;

import com.demo.commons.exception.ServiceException;
import com.demo.commons.result.ResultCodeEnum;
import com.demo.commons.vo.FCommentVo;
import com.demo.entity.FComment;
import com.demo.mapper.FCommentMapper;
import com.demo.service.FCommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FCommentServiceImpl implements FCommentService {
    @Resource
    FCommentMapper fCommentMapper;

    /*
     * 展示评论表
     * */
    @Override
    public List<FCommentVo> selectFCommentList() {
        List<FCommentVo> fCommentVos = fCommentMapper.selectFCommentList();
        /*
         * 如果查找失败就抛出异常 “ 系统繁忙，请稍后重试 ”
         * */
        if(fCommentVos.size() < 1){
            throw new ServiceException(ResultCodeEnum.SYSTEM_INNER_ERROR);
        }
        return fCommentVos;
    }

    /*
     * 商家回复
     * */
    @Override
    public int insertReplyByUid(int commentId,String commentReply) {
        int num = fCommentMapper.insertReplyByCommentId(commentId, commentReply);
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
        int num = fCommentMapper.deleteReplyByCommentId(commentId);
        /*
         * 如果没有修改成功就抛出异常 “ 数据错误 ”
         * */
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }
}
