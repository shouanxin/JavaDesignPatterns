/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/21 21:18.
 */

package com.anxin.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/21
 */
public class CourseCatalog extends CatalogComponent {
    private List<CatalogComponent> catalogComponentList = new ArrayList<>();
    private String name;

    public CourseCatalog(String name) {
        this.name = name;
    }

    @Override
    protected void add(CatalogComponent catalogComponent) {
        catalogComponentList.add(catalogComponent);
    }

    @Override
    protected void remove(CatalogComponent catalogComponent) {
        catalogComponentList.remove(catalogComponent);
    }

    @Override
    protected String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    protected void print() {
        System.out.println("课程目录：" + name);
        for (CatalogComponent component : catalogComponentList) {
            component.print();
        }
    }
}
