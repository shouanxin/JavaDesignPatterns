/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/21 20:00.
 */

package com.anxin.design.pattern.structural.flyweight;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/21
 */
public class Manager implements Employee {
    @Override
    public void report() {
        System.out.println("报告内容 ：" + content);
    }
    private String content;
    private String deptName;

    public Manager(String deptName) {
        this.deptName = deptName;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
