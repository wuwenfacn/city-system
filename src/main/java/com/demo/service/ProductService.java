package com.demo.service;

import com.demo.commons.requestEntity.ProductRequest;

import java.util.List;

/**
 * @Author qiaoshu
 * Date: 2020-11-11  11:25
 * Description:
 */
public interface ProductService {

    boolean addProducts(ProductRequest productRequest);

    boolean updateProduct(ProductRequest productRequest);

    boolean deleteProduct(Integer productId);

    List selectProduct(ProductRequest productRequest, int page, int size);
}
