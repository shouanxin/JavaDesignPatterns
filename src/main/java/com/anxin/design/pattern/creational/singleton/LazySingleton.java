/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2019/4/7 12:14.
 */

package com.anxin.design.pattern.creational.singleton;

/**
 * 〈懒汉式设计模式〉.
 * 存在线程安全问题
 * 分析：
 * 多线程情况下访问getInstance方法，会造成singletonDemo1 = new LazySingleton()语句多次执行。如果构造函数做了大量初始化数据或者跟业务场景相关的操作。多次执行会造成效率问题或者业务逻辑错乱问题。
 * @see LazySynchronizedSingleton 加同步锁
 * @author: shouanxin
 * @date: 2019/4/7
 */
public class LazySingleton {
    // 1.构造函数私有化
    private LazySingleton(){

    }

    // 2.定义静态变量
    private static LazySingleton lazySingleton = null;

    // 3.定义初始化方法
    public static LazySingleton getInstance() {
        if (null == lazySingleton) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
