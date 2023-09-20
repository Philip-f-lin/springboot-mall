package com.linphilip.springbootmall.dao;

import com.linphilip.springbootmall.dto.CreateOrderRequest;
import com.linphilip.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
