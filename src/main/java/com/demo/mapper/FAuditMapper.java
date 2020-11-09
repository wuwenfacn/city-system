package com.demo.mapper;

import com.demo.commons.vo.FAuditUpdateVo;
import org.apache.ibatis.annotations.Param;

public interface FAuditMapper {
    /*
    * 根据门店编号修改审核请求
    * */
    int updateFAuditById(@Param("fAuditUpdateVo")FAuditUpdateVo fAuditUpdateVo);
}
