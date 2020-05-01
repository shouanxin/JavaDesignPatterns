/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/20 21:42.
 */

package com.anxin.design.pattern.structural.decorator;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/20
 */
public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
