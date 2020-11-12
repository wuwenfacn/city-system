package com.demo.commons.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ShopAuditSelectVo {

    private Integer sId;

    private String aName;

    private String aBusiness;

    private String aCity;

    private Date aSubmissionTime;

    private Integer aType;

    private Integer aStatus;

    private Integer aPass;

    private String aPassReason;

}

