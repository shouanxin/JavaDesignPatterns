/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2019/12/29 15:56.
 */

package com.anxin.design.pattern.creational.singleton;

/**
 * 〈静态内部类，基于类初始化的延迟加载解决方案〉.
 *
 * @author: shouanxin
 * @date: 2019/12/29
 */
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {

    }
    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }
}
