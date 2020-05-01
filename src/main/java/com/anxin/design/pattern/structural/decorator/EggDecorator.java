/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/20 21:41.
 */

package com.anxin.design.pattern.structural.decorator;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/20
 */
public class EggDecorator extends AbstractDecorator {
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
