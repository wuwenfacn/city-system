package com.demo.controller;

import com.demo.commons.requestEntity.OrderRequest;
import com.demo.commons.requestEntity.ProductRequest;
import com.demo.commons.utils.BaseResult;
import com.demo.service.ProductService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author qiaoshu
 * Date: 2020-11-11  11:24
 * Description:
 *      商品服务
 */
@RestController
@RequestMapping("/pro")
public class ProductController {
    @Resource
    ProductService productService;

    /**
     * 新增商品
     * @param productRequest
     * @return
     */
    @PostMapping("/add")
    public BaseResult addProduct(@RequestBody ProductRequest productRequest){
        if (productService.addProducts(productRequest)) {
            return BaseResult.success();
        }
        return BaseResult.error();
    }

    /**
     * 编辑商品
     * @param productRequest
     * @return
     */
    @PutMapping("/update")
    public BaseResult updateProduct(
            @RequestBody ProductRequest productRequest
    ){
        if (productService.updateProduct(productRequest)) {
            return BaseResult.success();
        }
        return BaseResult.error();
    }

    /**
     * 删除商品
     * @param productId
     * @return
     */
    @PutMapping("/delete")
    public BaseResult deleteProduct(
            Integer productId
    ){
        if (productService.deleteProduct(productId)) {
            return BaseResult.success();
        }
        return BaseResult.error();
    }

    @GetMapping("/list")
    public BaseResult selectProduct(
            ProductRequest productRequest,
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "3") int size
    ){
        List list = productService.selectProduct(productRequest, page, size);
        BaseResult success = BaseResult.success(list);
        return success;
    }




}
