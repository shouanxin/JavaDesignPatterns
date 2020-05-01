/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/21 13:17.
 */

package com.anxin.design.pattern.structural.adapter.clazz;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/21
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
