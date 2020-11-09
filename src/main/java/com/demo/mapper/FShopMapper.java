package com.demo.mapper;

import com.demo.commons.vo.FShopInsertVo;
import com.demo.commons.vo.FShopUpdateVo;
import com.demo.entity.FShop;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FShopMapper {
    /*
    * status：上线状态，0表示下线，1表示上线
    * pageNum：显示的页数
    * pageSize：每页显示的条数
    * */
    List<FShop> selectFShopList(@Param("status") int status,@Param("pageNum") int pageNum,@Param("pageSize") int pageSize);

    /*
    * 添加新门店
    * */
    int insertFShop(@Param("fShop") FShopInsertVo fShop);

    /*
    * 门店资料更新
    * */
    int updateFShopBysId(@Param("fShop")FShopUpdateVo fShop);

    /*
    * 门店下架
    * */
    int updatesStatusOut(@Param("sId") int sId);

    /*
     * 门店上架
     * */
    int updatesStatusUp(@Param("sId") int sId);

    /*
     * 门店删除
     * */
    int updateDeleteStatus(@Param("sId") int sId);
}
