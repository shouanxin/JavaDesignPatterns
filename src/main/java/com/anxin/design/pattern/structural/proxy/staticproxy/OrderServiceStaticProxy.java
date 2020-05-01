/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/22 13:40.
 */

package com.anxin.design.pattern.structural.proxy.staticproxy;

import com.anxin.design.pattern.structural.proxy.IOrderService;
import com.anxin.design.pattern.structural.proxy.Order;
import com.anxin.design.pattern.structural.proxy.OrderServiceImpl;
import com.anxin.design.pattern.structural.proxy.db.DataSourceContextHolder;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/22
 */
public class OrderServiceStaticProxy {
    private IOrderService iOrderService;
    public int saveOrder(Order order) {
        iOrderService = new OrderServiceImpl();
        beforeMethod(order);
        int count = iOrderService.saveOrder(order);
        afterMethod();
        return count;
    }

    private void beforeMethod(Order order) {
        System.out.println("静态代理 before");
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配DB：" + dbRouter);
        // 设置DB
        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));
    }

    private void afterMethod(){
        System.out.println("静态代理 after");
    }
}
