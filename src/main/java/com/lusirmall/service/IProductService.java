package com.lusirmall.service;

import com.lusirmall.common.ServerResponse;
import com.lusirmall.pojo.Product;

public interface IProductService {
    ServerResponse saveOrUpdateProduct(Product product);

    ServerResponse<String> setSaleStatus(Integer productId, Integer status);
}
