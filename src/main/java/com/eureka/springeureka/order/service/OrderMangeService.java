package com.eureka.springeureka.order.service;

import com.eureka.springeureka.order.vo.OrderDetailsVo;

import java.util.List;

public interface OrderMangeService {
    OrderDetailsVo placeOrder(OrderDetailsVo detailsVo) throws Exception;

    List<String> queryOrder(Long customerId);
}
