package com.demo.service.impl;

import com.demo.commons.exception.ServiceException;
import com.demo.commons.requestEntity.ProductRequest;
import com.demo.commons.result.ResultCodeEnum;
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
        int i = 0;
        try{
            i = productMapper.insertSelective(wProduct);
        }catch (RuntimeException exception){
            throw new ServiceException(ResultCodeEnum.SQL_INSERT_ERROR);
        }
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
        int i = 0;
        try{
            i = productMapper.updateByPrimaryKeySelective(wProduct);
        }catch (RuntimeException exception){
            throw new ServiceException(ResultCodeEnum.SQL_UPDATE_ERROR);
        }
        return i>0;
    }

    /**
     * 删除商品
     * @param productId
     * @return
     */
    @Override
    public boolean deleteProduct(Integer productId) {
        int i = 0;
        try{
            i = productMapper.deleteByPrimaryKey(productId);
        }catch (RuntimeException exception){
            throw new ServiceException(ResultCodeEnum.SQL_DELETE_ERROR);
        }
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
        if (wProducts==null) {
            throw new ServiceException(ResultCodeEnum.SQL_SELECT_ERROR);
        }
        PageInfo pageInfo = new PageInfo(wProducts);
        List list = pageInfo.getList();
        return list;
    }


}
