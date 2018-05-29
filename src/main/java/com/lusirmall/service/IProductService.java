package com.lusirmall.service;

import com.lusirmall.common.ServerResponse;
import com.lusirmall.pojo.Product;
import com.lusirmall.vo.ProductDetailVo;

public interface IProductService {
    ServerResponse saveOrUpdateProduct(Product product);

    ServerResponse<String> setSaleStatus(Integer productId, Integer status);

    ServerResponse<ProductDetailVo> manageProductDetail(Integer productId);
}
