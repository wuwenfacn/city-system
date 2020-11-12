package com.demo.service;

import com.demo.commons.vo.FAuditSelectVo;
import com.demo.commons.vo.FAuditUpdateVo;
import com.demo.entity.FAudit;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FAuditService {

    int updateFAuditById(FAuditUpdateVo fAuditUpdateVo);

    int updatesStatusOut(int sId, int aPass, String aPassReason);

    int updatesStatusUp(int sId, int aPass, String aPassReason);

    int updateDeleteStatus(int sId, int aPass, String aPassReason);

    List<FAuditSelectVo> selectFAuditList(int aStatus);

}
