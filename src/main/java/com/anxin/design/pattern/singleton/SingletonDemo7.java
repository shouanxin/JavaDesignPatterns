/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2019/4/7 12:53.
 */

package com.anxin.design.pattern.singleton;

/**
 * 〈枚举式——推荐写法〉.
 *
 * @author: shouanxin
 * @date: 2019/4/7
 */
public class SingletonDemo7 {
    private SingletonDemo7() {

    }

    public static SingletonDemo7 getInstance() {
        return singletonEnum.INSTANCE.getSingletonDemo7();
    }
    private enum singletonEnum {
        INSTANCE;
        private SingletonDemo7 singletonDemo7;

        // jvm保证该方法只调用一次
        singletonEnum() {
            this.singletonDemo7 = new SingletonDemo7();
        }

        public SingletonDemo7 getSingletonDemo7() {
            return singletonDemo7;
        }
    }
}
