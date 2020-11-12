package com.demo.mapper;

import com.demo.commons.vo.ShopAuditUpdateVo;
import com.demo.entity.ShopAudit;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopAuditMapper {

    /*
    * 根据门店编号修改审核请求
    * */
    int updateFAuditById(@Param("shopAuditUpdateVo") ShopAuditUpdateVo shopAuditUpdateVo);

    /*
     * 门店下架审核
     * sId：门店编号
     * aPass：是否通过
     * aPassReason：是否通过的理由
     * */
    int updatesStatusOut(@Param("sId") int sId,@Param("aPass") int aPass,@Param("aPassReason")String aPassReason);

    /*
     * 门店上架审核
     * sId：门店编号
     * aPass：是否通过
     * aPassReason：是否通过的理由
     * */
    int updatesStatusUp(@Param("sId") int sId,@Param("aPass") int aPass,@Param("aPassReason")String aPassReason);

    /*
     * 门店删除审核
     * sId：门店编号
     * aPass：是否通过
     * aPassReason：是否通过的理由
     * */
    int updateDeleteStatus(@Param("sId") int sId,@Param("aPass") int aPass,@Param("aPassReason")String aPassReason);

    /*
     * 显示所有要审核的数据
     * aStatus：审核状态，1表示已审核，2表示未审核
     * */
    List<ShopAudit> selectFAuditList(@Param("aStatus") int aStatus);
}
