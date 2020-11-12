package com.demo.mapper;

import com.demo.entity.WActivity;
import org.aspectj.weaver.Lint;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

/**
 * @Author qiaoshu
 * Date: 2020-11-12  09:55
 * Description:
 */
public interface WActivityMapper {
    int deleteByPrimaryKey(Integer aId);

    int insert(WActivity record);

    int insertSelective(WActivity record);

    WActivity selectByPrimaryKey(Integer aId);

    int updateByPrimaryKeySelective(WActivity record);

    int updateByPrimaryKey(WActivity record);

    List selectAll();
}