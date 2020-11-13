package com.demo.controller;

import com.demo.commons.result.BaseResult;
import com.demo.entity.Products;
import com.demo.service.ProductsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {
    @Resource
    ProductsService productsService;

    @GetMapping("/list")
    public BaseResult getProductsList(){
        List<Products> productsList = productsService.getProductsList();
        return BaseResult.success(productsList);
    }
}
