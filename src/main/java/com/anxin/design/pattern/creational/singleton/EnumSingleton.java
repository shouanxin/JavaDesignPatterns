/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2019/4/7 12:53.
 */

package com.anxin.design.pattern.creational.singleton;

/**
 * 〈枚举式——推荐写法〉.
 *
 * @author: shouanxin
 * @date: 2019/4/7
 */
public class EnumSingleton {
    private EnumSingleton() {

    }

    public static EnumSingleton getInstance() {
        return EnumInstance.INSTANCE.getEnumSingleton();
    }
    private enum EnumInstance {
        INSTANCE {
            @Override
            protected void test() {
                System.out.println("test");
            }
        };

        protected abstract void test();
        private EnumSingleton enumSingleton;

        // jvm保证该方法只调用一次
        EnumInstance() {
            this.enumSingleton = new EnumSingleton();
        }

        public EnumSingleton getEnumSingleton() {
            return enumSingleton;
        }
    }
}
