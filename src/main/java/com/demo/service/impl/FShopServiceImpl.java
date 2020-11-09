package com.demo.service.impl;

import com.demo.commons.utils.BeanConvertUtils;
import com.demo.commons.vo.FShopInsertVo;
import com.demo.commons.vo.FShopSelectVo;
import com.demo.commons.vo.FShopUpdateVo;
import com.demo.entity.FShop;
import com.demo.mapper.FShopMapper;
import com.demo.service.FShopService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FShopServiceImpl implements FShopService {
    @Resource
    FShopMapper fShopMapper;

    @Override
    public List<FShopSelectVo> selectFShopList(int status, int pageNum, int pageSize) {
        List<FShop> fShops = fShopMapper.selectFShopList(status, pageNum, pageSize);
        List<FShopSelectVo> fShopVos = BeanConvertUtils.convertListTo(fShops, FShopSelectVo::new);
        return fShopVos;
    }

    @Override
    public int insertFShop(FShopInsertVo fShop) {
        return fShopMapper.insertFShop(fShop);
    }

    @Override
    public int updateFShopBysId(FShopUpdateVo fShop) {
        return fShopMapper.updateFShopBysId(fShop);
    }

    @Override
    public int updatesStatusOut(int sId) {
        return fShopMapper.updatesStatusOut(sId);
    }

    @Override
    public int updatesStatusUp(int sId) {
        return fShopMapper.updatesStatusUp(sId);
    }

    @Override
    public int updateDeleteStatus(int sId) {
        return fShopMapper.updateDeleteStatus(sId);
    }
}
