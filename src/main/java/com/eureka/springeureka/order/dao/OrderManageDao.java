package com.eureka.springeureka.order.dao;

import com.eureka.springeureka.order.vo.OrderDetailsVo;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface OrderManageDao {
    int placeOrder(OrderDetailsVo detailsVo);

    OrderDetailsVo queryOrder(@Param("orderId") Long orderId);

    Map<String, String> cancelOrder(@Param("orderId") Long orderId, @Param("description") String description);

    int updateOrder(OrderDetailsVo detailsVo);

}
