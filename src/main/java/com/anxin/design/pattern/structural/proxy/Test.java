/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/22 14:10.
 */

package com.anxin.design.pattern.structural.proxy;

import com.anxin.design.pattern.structural.proxy.staticproxy.OrderServiceStaticProxy;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/22
 */
public class Test {
    public static void main(String[] args){
        Order order = new Order();
        order.setUserId(1);
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
