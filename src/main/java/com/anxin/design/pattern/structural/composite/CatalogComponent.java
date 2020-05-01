/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/21 21:13.
 */

package com.anxin.design.pattern.structural.composite;

import jdk.nashorn.internal.runtime.regexp.joni.exception.InternalException;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/21
 */
public class CatalogComponent {
    protected void add(CatalogComponent catalogComponent) {
        throw new InternalException("不支持添加");
    }

    protected void remove(CatalogComponent catalogComponent) {
        throw new InternalException("不支持删除");
    }

    protected String getName(CatalogComponent catalogComponent) {
        throw new InternalException("不支持获取名称");
    }

    protected double getPrice(CatalogComponent catalogComponent) {
        throw new InternalException("不支持获取价格");
    }

    protected void print() {
        System.out.println(this.toString());
    }
}
