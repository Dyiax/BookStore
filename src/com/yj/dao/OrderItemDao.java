package com.yj.dao;

import com.yj.bean.OrderItem;

import java.util.List;

public interface OrderItemDao {
    public int saveOrderItem(OrderItem orderItem);

    public List<OrderItem> showOrderItem(String orderId);
}
