package com.lusirmall.service;

import com.lusirmall.common.ServerResponse;
import com.lusirmall.vo.CartVo;

public interface ICartService {
    ServerResponse<CartVo> add(Integer userId, Integer productId, Integer count);
}
