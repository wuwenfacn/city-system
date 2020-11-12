package com.demo.entity.server;

import lombok.Data;

@Data
public class FullReduction {
    /**
     * 是否开启免运费
     */
    private Integer status;

    /**
     * 到达金额阀值免运费
     */
    private Integer valve;
}

