package com.eureka.springeureka.order.vo;

import java.util.Date;

public class OrderDetailsVo {
    private Long orderId;
    private String orderNumber;
    private Date creationDate;
    private Long customerId;
    private String customerName;
    private Double orderAmount;
    private String deliveryLoc;
    private Date deliveryDate;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getCreationDate() {
        if (creationDate != null){
            return creationDate;
        }else
            creationDate = new Date();
            return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getDeliveryLoc() {
        return deliveryLoc;
    }

    public void setDeliveryLoc(String deliveryLoc) {
        this.deliveryLoc = deliveryLoc;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "OrderDetailsVo{" +
                "orderId=" + orderId +
                ", orderNumber='" + orderNumber + '\'' +
                ", creationDate=" + creationDate +
                ", customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", orderAmount=" + orderAmount +
                ", deliveryLoc='" + deliveryLoc + '\'' +
                ", deliveryDate=" + deliveryDate +
                '}';
    }
}
