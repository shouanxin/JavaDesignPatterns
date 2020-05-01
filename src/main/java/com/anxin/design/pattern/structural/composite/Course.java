/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/21 21:15.
 */

package com.anxin.design.pattern.structural.composite;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/21
 */
public class Course extends CatalogComponent{
    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    protected String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    protected double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "课程{" +
                "课程名称 name='" + name + '\'' +
                ", 课程价格 price=" + price +
                "} ";
    }
}
