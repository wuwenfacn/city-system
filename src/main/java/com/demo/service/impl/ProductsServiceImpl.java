package com.demo.service.impl;

import com.demo.entity.Products;
import com.demo.mapper.ProductsMapper;
import com.demo.service.ProductsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {
    @Resource
    ProductsMapper productsMapper;

    @Override
    public List<Products> getProductsList() {
        return productsMapper.selectProductsList();
    }
}
