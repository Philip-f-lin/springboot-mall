package com.linphilip.springbootmall.service;

import com.linphilip.springbootmall.dao.OrderDao;
import com.linphilip.springbootmall.dto.CreateOrderRequest;
import com.linphilip.springbootmall.dto.OrderQueryParams;
import com.linphilip.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Integer countOrder(OrderQueryParams orderQueryParams);
}
