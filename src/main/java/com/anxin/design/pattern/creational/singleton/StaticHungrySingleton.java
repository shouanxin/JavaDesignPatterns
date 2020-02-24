/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2019/4/7 12:42.
 */

package com.anxin.design.pattern.creational.singleton;

/**
 * 〈饿汉式——写法2 通过静态块初始化〉.
 * 在类装载时进行创建，保证线程安全
 *
 * 不足之处：如果初始化方法中包含过多处理，会导致类加载慢，可能会造成性能问题；如果只加载，而没有调用，会造成资源浪费。
 * @author: shouanxin
 * @date: 2019/4/7
 */
public class StaticHungrySingleton {
    // 1.构造函数私有化
    private StaticHungrySingleton(){

    }
    //region 错误写法 此写法，由于执行顺序，静态块先执行，对singletonDemo初始化，但下一句又将singletonDemo赋值null，所以最终结果为null， 将变量定义放在静态块上方。
//    static {
//        singletonDemo = new StaticHungrySingleton();
//    }
//    // 2.定义静态变量
//    private static StaticHungrySingleton singletonDemo = null;
    //endregion

    //region 正确写法
    // 2.定义静态变量
    private static StaticHungrySingleton singletonDemo = null;
    static {
        singletonDemo = new StaticHungrySingleton();
    }

    //endregion

    // 3.定义初始化方法
    public static StaticHungrySingleton getInstance() {
        return singletonDemo;
    }
}
