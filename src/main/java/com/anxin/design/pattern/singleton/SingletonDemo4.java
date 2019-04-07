/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2019/4/7 12:24.
 */

package com.anxin.design.pattern.singleton;

/**
 * 〈懒汉模式 —— synchronized锁，双重检测机制 + volatile〉.
 *
 * 不存在线程安全问题
 *
 * 在getInstance方法内部加锁，降低锁的粒度，在singletonDemo静态方法上加volatile关键字，禁止指令重排序。
 *
 * singletonDemo = new SingletonDemo3()语句cpu指令原理分析：
 * 1.分配对象内存空间
 * 2.初始化对象
 * 3.设置singletonDemo指向分配的内存
 *
 * @author: shouanxin
 * @date: 2019/4/7
 */
public class SingletonDemo4 {
    // 1.构造函数私有化
    private SingletonDemo4(){

    }

    // 2.定义静态变量
    private static volatile SingletonDemo4 singletonDemo = null;

    // 3.定义初始化方法
    public static SingletonDemo4 getInstance() {
        if (null == singletonDemo) { // 双重检测机制
            synchronized (SingletonDemo4.class) {// 锁
                if (null == singletonDemo) {
                    singletonDemo = new SingletonDemo4();
                }
            }
        }
        return singletonDemo;
    }
}
