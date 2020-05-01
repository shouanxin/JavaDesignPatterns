/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/20 21:37.
 */

package com.anxin.design.pattern.structural.decorator;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/20
 */
public abstract class AbstractDecorator extends ABattercake {
    protected ABattercake aBattercake;
    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    @Override
    protected String getDesc() {
        return aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return aBattercake.cost();
    }
}
