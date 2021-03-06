/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2019/4/7 12:24.
 */

package com.anxin.design.pattern.creational.singleton;

/**
 * 〈懒汉模式 —— synchronized锁，双重检测机制 + volatile〉.
 *
 * 不存在线程安全问题
 *
 * 在getInstance方法内部加锁，降低锁的粒度，在singletonDemo静态方法上加volatile关键字，禁止指令重排序。
 *
 * singletonDemo = new LazyDoubleCheckSingleton()语句cpu指令原理分析：
 * 1.分配对象内存空间
 * 2.初始化对象
 * 3.设置singletonDemo指向分配的内存
 *
 * @author: shouanxin
 * @date: 2019/4/7
 */
public class LazyVolatileSingleton{
    // 1.构造函数私有化
    private LazyVolatileSingleton(){

    }

    // 2.定义静态变量
    private static volatile LazyVolatileSingleton singletonDemo = null;

    // 3.定义初始化方法
    public static LazyVolatileSingleton getInstance() {
        if (null == singletonDemo) { // 双重检测机制
            synchronized (LazyVolatileSingleton.class) {// 锁
                if (null == singletonDemo) {
                    singletonDemo = new LazyVolatileSingleton();
                }
            }
        }
        return singletonDemo;
    }
}
