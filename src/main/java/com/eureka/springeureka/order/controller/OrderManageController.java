package com.eureka.springeureka.order.controller;

import com.eureka.springeureka.order.service.OrderMangeService;
import com.eureka.springeureka.order.vo.OrderDetailsVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/order")
public class OrderManageController {
    private static final Logger logger = LoggerFactory.getLogger(OrderManageController.class);

    @Autowired
    private OrderMangeService orderMangeService;

    @PostMapping("/placeOrder")
    public OrderDetailsVo placeOrder(@RequestBody OrderDetailsVo detailsVo) {
        logger.info("enter into placeOrder: " + detailsVo.toString());
        OrderDetailsVo orderDetailsVo = new OrderDetailsVo();
        try {
            orderDetailsVo = orderMangeService.placeOrder(detailsVo);
        } catch (Exception e){
            e.printStackTrace();
            logger.error("existing API placeOrder: " + orderDetailsVo.toString());
        }
        logger.info("existing API placeOrder: " + orderDetailsVo.toString());
        return orderDetailsVo;
    }
}
