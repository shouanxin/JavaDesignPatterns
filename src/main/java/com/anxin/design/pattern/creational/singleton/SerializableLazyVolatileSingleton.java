/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2019/4/7 12:24.
 */

package com.anxin.design.pattern.creational.singleton;

import java.io.Serializable;

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
 * 序列化与反序列化：
 * 为什么加readResolve方法
 * 1.查看源码：java.io.ObjectInputStream#readObject()
 * 2.java.io.ObjectInputStream#readObject0(boolean)
 * 3.java.io.ObjectInputStream#readOrdinaryObject(boolean)
 * 4.java.io.ObjectStreamClass#hasReadResolveMethod()
 *
 * @author: shouanxin
 * @date: 2019/4/7
 */
public class SerializableLazyVolatileSingleton implements Serializable {
    // 1.构造函数私有化
    private SerializableLazyVolatileSingleton(){

    }

    // 2.定义静态变量
    private static volatile SerializableLazyVolatileSingleton singletonDemo = null;

    // 3.定义初始化方法
    public static SerializableLazyVolatileSingleton getInstance() {
        if (null == singletonDemo) { // 双重检测机制
            synchronized (SerializableLazyVolatileSingleton.class) {// 锁
                if (null == singletonDemo) {
                    singletonDemo = new SerializableLazyVolatileSingleton();
                }
            }
        }
        return singletonDemo;
    }

    /**
     * 功能描述: 〈添加此方法〉.
     *
     * @param
     * @return  java.lang.Object
     * @author shouanxin
     * @date  2019/12/29 16:26
     */
    public Object readResolve() {
        return singletonDemo;
    }
}
