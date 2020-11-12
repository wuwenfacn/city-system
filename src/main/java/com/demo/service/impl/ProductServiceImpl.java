package com.demo.service.impl;

import com.demo.commons.requestEntity.ProductRequest;
import com.demo.entity.WProduct;
import com.demo.mapper.WProductMapper;
import com.demo.service.ProductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author qiaoshu
 * Date: 2020-11-11  11:26
 * Description:
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    WProductMapper productMapper;
    /**
     * 添加商品
     * @param productRequest
     * @return
     */
    @Override
    public boolean addProducts(ProductRequest productRequest) {
        WProduct wProduct = new WProduct();
        BeanUtils.copyProperties(productRequest,wProduct);
        int i = productMapper.insertSelective(wProduct);
        return i>0;
    }

    /**
     * 修改商品
     * @param productRequest
     * @return
     */
    @Override
    public boolean updateProduct(ProductRequest productRequest) {
        WProduct wProduct = new WProduct();
        BeanUtils.copyProperties(productRequest,wProduct);
        int i = productMapper.updateByPrimaryKeySelective(wProduct);
        return i>0;

    }

    /**
     * 删除商品
     * @param productId
     * @return
     */
    @Override
    public boolean deleteProduct(Integer productId) {
        int i = productMapper.deleteByPrimaryKey(productId);
        return i>0;
    }

    /**
     * 查询商品
     * @param productRequest
     * @param page
     * @param size
     * @return
     */
    @Override
    public List selectProduct(ProductRequest productRequest, int page, int size) {
        WProduct wProduct = new WProduct();
        BeanUtils.copyProperties(productRequest,wProduct);
        PageHelper.startPage(page,size);
        List<WProduct> wProducts = productMapper.selecAll(wProduct);
        PageInfo pageInfo = new PageInfo(wProducts);
        List list = pageInfo.getList();
        return list;
    }


}
