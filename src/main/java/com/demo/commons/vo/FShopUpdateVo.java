package com.demo.commons.vo;

import lombok.Data;

import java.util.Date;

@Data
public class FShopUpdateVo {
    private Integer sId;

    private String sLogo;

    private String sBackImg;

    private String sProductImg;

    private String sEnvironmentImg;

    private String sElseImg;

    private String sAddress;

    private String sPath;

    private String sLinkman;

    private String sPhone;

    private Date sBusinessHours;

    private String sBrief;
}
