package com.demo.service.impl;

import com.demo.commons.vo.FAuditUpdateVo;
import com.demo.mapper.FAuditMapper;
import com.demo.service.FAuditService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FAuditServiceImpl implements FAuditService {
    @Resource
    FAuditMapper fAuditMapper;
    @Override
    public int updateFAuditById(FAuditUpdateVo fAuditUpdateVo) {
        return fAuditMapper.updateFAuditById(fAuditUpdateVo);
    }
}
