package com.demo.service;

import com.demo.commons.vo.FAuditSelectVo;
import com.demo.commons.vo.FAuditUpdateVo;
import com.demo.entity.FAudit;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FAuditService {

    /*
     * 根据门店编号修改审核信息
     * */
    int updateFAuditById(FAuditUpdateVo fAuditUpdateVo);

    /*
     * 对下架申请进行审核，审核通过则允许下架
     * */
    int updatesStatusOut(int sId, int aPass, String aPassReason);

    /*
     * 对上架申请进行审核，审核通过则允许上架
     * */
    int updatesStatusUp(int sId, int aPass, String aPassReason);

    /*
     * 对删除申请进行审核，审核通过则允许删除
     * */
    int updateDeleteStatus(int sId, int aPass, String aPassReason);

    /*
     * 显示所有要审核的数据
     * aStatus：审核状态，1表示已审核，2表示未审核
     * */
    List<FAuditSelectVo> selectFAuditList(int aStatus);

}
