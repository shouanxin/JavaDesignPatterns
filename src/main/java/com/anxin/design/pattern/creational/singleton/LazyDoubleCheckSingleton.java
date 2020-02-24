/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2019/4/7 12:24.
 */

package com.anxin.design.pattern.creational.singleton;

/**
 * 〈懒汉模式 —— synchronized锁，双重检测机制〉.
 * 在getInstance方法内部加锁，降低锁的粒度。
 *
 * 存在线程安全问题。
 * singletonDemo = new LazyDoubleCheckSingleton()语句cpu指令原理分析：
 * 1.分配对象内存空间
 * 2.初始化对象
 * 3.设置singletonDemo指向分配的内存
 *
 * 多线程情况下，会发生指令重排序。
 * 例如：指令顺序变为1-3-2
 * 线程A拿到锁，进行singletonDemo = new LazyDoubleCheckSingleton()操作；此时刚执行完步骤1、3，此时线程B进来判断singletonDemo不为null，直接返回；但是此对象并未进行初始化，造成线程安全问题。
 *
 * @see LazyVolatileSingleton
 * @author: shouanxin
 * @date: 2019/4/7
 */
public class LazyDoubleCheckSingleton {
    // 1.构造函数私有化
    private LazyDoubleCheckSingleton(){

    }

    // 2.定义静态变量
    private static LazyDoubleCheckSingleton singletonDemo = null;

    // 3.定义初始化方法
    public static LazyDoubleCheckSingleton getInstance() {
        if (null == singletonDemo) { // 双重检测机制
            synchronized (LazyDoubleCheckSingleton.class) {// 锁
                if (null == singletonDemo) {
                    singletonDemo = new LazyDoubleCheckSingleton();
                }
            }
        }
        return singletonDemo;
    }
}
