package com.eureka.springeureka.order.service.impl;

import com.eureka.springeureka.order.dao.OrderManageDao;
import com.eureka.springeureka.order.service.OrderMangeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderMangeServiceImpl implements OrderMangeService {
    private static final Logger logger = LoggerFactory.getLogger(OrderMangeServiceImpl.class);

    @Autowired
    private OrderManageDao orderManageDao;


}
