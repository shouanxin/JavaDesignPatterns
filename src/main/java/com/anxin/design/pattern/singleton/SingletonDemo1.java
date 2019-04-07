/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2019/4/7 12:14.
 */

package com.anxin.design.pattern.singleton;

/**
 * 〈懒汉式设计模式〉.
 * 存在线程安全问题
 * 分析：
 * 多线程情况下访问getInstance方法，会造成singletonDemo1 = new SingletonDemo1()语句多次执行。如果构造函数做了大量初始化数据或者跟业务场景相关的操作。多次执行会造成效率问题或者业务逻辑错乱问题。
 * @see SingletonDemo2 加同步锁
 * @author: shouanxin
 * @date: 2019/4/7
 */
public class SingletonDemo1 {
    // 1.构造函数私有化
    private SingletonDemo1(){

    }

    // 2.定义静态变量
    private static SingletonDemo1 singletonDemo1 = null;

    // 3.定义初始化方法
    public static SingletonDemo1 getInstance() {
        if (null == singletonDemo1) {
            singletonDemo1 = new SingletonDemo1();
        }
        return singletonDemo1;
    }
}
