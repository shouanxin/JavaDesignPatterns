/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/22 14:28.
 */

package com.anxin.design.pattern.structural.proxy.dynamicproxy;

import com.anxin.design.pattern.structural.proxy.IOrderService;
import com.anxin.design.pattern.structural.proxy.Order;
import com.anxin.design.pattern.structural.proxy.OrderServiceImpl;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/22
 */
public class Test {
    public static void main(String[] args){
        Order order = new Order();
        order.setUserId(2);
        IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderService.saveOrder(order);
    }
}
