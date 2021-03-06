/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2019/4/7 12:24.
 */

package com.anxin.design.pattern.creational.singleton;

/**
 * 〈懒汉模式 —— synchronized同步锁〉.
 * 在getInstance方法在上加synchroized同步锁，多线程情况下影响效率
 * @see LazyDoubleCheckSingleton 双重检测机制
 * @author: shouanxin
 * @date: 2019/4/7
 */
public class LazySynchronizedSingleton {
    // 1.构造函数私有化
    private LazySynchronizedSingleton(){

    }

    // 2.定义静态变量
    private static LazySynchronizedSingleton singletonDemo = null;

    // 3.定义初始化方法
    public static synchronized LazySynchronizedSingleton getInstance() {
        if (null == singletonDemo) {
            singletonDemo = new LazySynchronizedSingleton();
        }
        return singletonDemo;
    }
}
