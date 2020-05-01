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
public class Test {
    public static void main(String[] args){
        ABattercake aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);
        System.out.println("销售： " + aBattercake.getDesc() + "; 价格 ： " + aBattercake.cost());

    }
}
