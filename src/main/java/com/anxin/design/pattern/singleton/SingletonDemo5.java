/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2019/4/7 12:42.
 */

package com.anxin.design.pattern.singleton;

/**
 * 〈饿汉式——写法1 通过静态域初始化〉.
 * 在类装载时进行创建，保证线程安全
 *
 * 不足之处：如果初始化方法中包含过多处理，会导致类加载慢，可能会造成性能问题；如果只加载，而没有调用，会造成资源浪费。
 * @author: shouanxin
 * @date: 2019/4/7
 */
public class SingletonDemo5 {
    // 1.构造函数私有化
    private SingletonDemo5(){

    }

    // 2.定义静态变量
    private static SingletonDemo5 singletonDemo = new SingletonDemo5();

    // 3.定义初始化方法
    public static SingletonDemo5 getInstance() {
        return singletonDemo;
    }
}
