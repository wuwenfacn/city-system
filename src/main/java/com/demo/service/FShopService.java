package com.demo.service;

import com.demo.commons.vo.FShopInsertVo;
import com.demo.commons.vo.FShopSelectVo;
import com.demo.commons.vo.FShopUpdateVo;
import com.demo.entity.FShop;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FShopService {

    List<FShopSelectVo> selectFShopList(int status);

    int insertFShop(FShopInsertVo fShop);

    int updateFShopBysId(FShopUpdateVo fShop);

    int updatesStatusOut(int sId);

    int updatesStatusUp(int sId);

    int updateDeleteStatus(int sId);

}
