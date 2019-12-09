package com.eureka.springeureka.order.dao;

import com.eureka.springeureka.order.vo.OrderDetailsVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface OrderManageDao {
    int placeOrder(OrderDetailsVo detailsVo);

    OrderDetailsVo queryOrder1(@Param("customerId") Long customerId);

    Map<String, String> cancelOrder(@Param("orderId") Long orderId, @Param("description") String description);

    int updateOrder(OrderDetailsVo detailsVo);

    List<OrderDetailsVo> queryOrder(Long customerId);
}
