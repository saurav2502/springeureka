package com.eureka.springeureka.order.service;

import com.eureka.springeureka.order.vo.OrderDetailsVo;

public interface OrderMangeService {
    OrderDetailsVo placeOrder(OrderDetailsVo detailsVo) throws Exception;
}
