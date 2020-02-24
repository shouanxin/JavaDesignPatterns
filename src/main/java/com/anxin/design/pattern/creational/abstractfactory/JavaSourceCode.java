/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2019/12/29 11:39.
 */

package com.anxin.design.pattern.creational.abstractfactory;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2019/12/29
 */
public class JavaSourceCode implements SourceCode{
    @Override
    public void produce() {
        System.out.println("java 源码");
    }
}
