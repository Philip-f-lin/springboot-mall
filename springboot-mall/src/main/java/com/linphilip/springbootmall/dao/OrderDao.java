package com.linphilip.springbootmall.dao;

import com.linphilip.springbootmall.dto.CreateOrderRequest;
import com.linphilip.springbootmall.model.Order;
import com.linphilip.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);
}
