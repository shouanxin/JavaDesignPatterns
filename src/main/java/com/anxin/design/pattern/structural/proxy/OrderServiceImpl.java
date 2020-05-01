/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/22 13:37.
 */

package com.anxin.design.pattern.structural.proxy;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/22
 */
public class OrderServiceImpl implements IOrderService {
    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        iOrderDao = new OrderDaoImpl();
        System.out.println("service invoke dao add order");
        return iOrderDao.insert(order);
    }
}
