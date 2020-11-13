package com.demo.service;

import com.demo.commons.vo.ShopAuditSelectVo;
import com.demo.commons.vo.ShopAuditUpdateVo;

import java.util.List;

public interface ShopAuditService {

    /*
     * 根据门店编号修改审核信息
     * */
    int updateFAuditById(ShopAuditUpdateVo shopAuditUpdateVo);

    /*
     * 对下架申请进行审核，审核通过则允许下架
     * */
    int updatesStatusOut(int id, int pass, String passReason);

    /*
     * 对上架申请进行审核，审核通过则允许上架
     * */
    int updatesStatusUp(int id, int pass, String passReason);

    /*
     * 对删除申请进行审核，审核通过则允许删除
     * */
    int updateDeleteStatus(int id, int pass, String passReason);

    /*
     * 显示所有要审核的数据
     * aStatus：审核状态，1表示已审核，2表示未审核
     * */
    List<ShopAuditSelectVo> selectFAuditList(int status);

}
