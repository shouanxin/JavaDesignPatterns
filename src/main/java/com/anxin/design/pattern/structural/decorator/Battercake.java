/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/20 21:45.
 */

package com.anxin.design.pattern.structural.decorator;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/20
 */
public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
