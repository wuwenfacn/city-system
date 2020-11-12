package com.demo.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @Author qiaoshu
 * Date: 2020-11-11  15:42
 * Description:
 */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring-context.xml",
        "classpath:spring-mvc.xml",
        "classpath:spring-tx.xml",
        "classpath:spring-mybatis.xml",
})

public class ProductServiceImplTest {

    @Test
    public void addProducts() {

    }
}