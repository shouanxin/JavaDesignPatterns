/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/23 19:38.
 */

package com.anxin.design.pattern.behavioral.visitor;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/23
 */
public class CodingCourse extends Course{

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void accept(Ivisitor ivisitor) {
        ivisitor.visit(this);
    }
}
