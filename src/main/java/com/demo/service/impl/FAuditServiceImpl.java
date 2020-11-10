package com.demo.service.impl;

import com.demo.commons.exception.ServiceException;
import com.demo.commons.result.ResultCodeEnum;
import com.demo.commons.utils.BeanConvertUtils;
import com.demo.commons.vo.FAuditSelectVo;
import com.demo.commons.vo.FAuditUpdateVo;
import com.demo.commons.vo.FShopSelectVo;
import com.demo.entity.FAudit;
import com.demo.mapper.FAuditMapper;
import com.demo.service.FAuditService;
import com.mysql.cj.util.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FAuditServiceImpl implements FAuditService {
    @Resource
    FAuditMapper fAuditMapper;

    @Override
    @Transactional
    public int updateFAuditById(FAuditUpdateVo fAuditUpdateVo) {
        int num = fAuditMapper.updateFAuditById(fAuditUpdateVo);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }

    @Override
    @Transactional
    public int updatesStatusOut(int sId, int aPass, String aPassReason) {
        int num = fAuditMapper.updatesStatusOut(sId, aPass, aPassReason);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }

    @Override
    @Transactional
    public int updatesStatusUp(int sId, int aPass, String aPassReason) {
        int num = fAuditMapper.updatesStatusUp(sId, aPass, aPassReason);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }

    @Override
    @Transactional
    public int updateDeleteStatus(int sId, int aPass, String aPassReason) {
        int num = fAuditMapper.updateDeleteStatus(sId, aPass, aPassReason);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }

    @Override
    @Transactional
    public List<FAuditSelectVo> selectFAuditList(int aStatus) {
        List<FAudit> fAudits = fAuditMapper.selectFAuditList(aStatus);
        if(fAudits.size() < 1){
            throw new ServiceException(ResultCodeEnum.SYSTEM_INNER_ERROR);
        }
        List<FAuditSelectVo> fAuditSelectVos = BeanConvertUtils.convertListTo(fAudits, FAuditSelectVo::new);
        return fAuditSelectVos;
    }

}
