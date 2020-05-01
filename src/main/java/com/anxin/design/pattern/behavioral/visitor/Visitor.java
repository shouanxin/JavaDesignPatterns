/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/23 19:39.
 */

package com.anxin.design.pattern.behavioral.visitor;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/23
 */
public class Visitor implements Ivisitor {
    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("免费课程 " + freeCourse.getName());
    }

    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("实战课程 " + codingCourse.getName() + " 价格：" + codingCourse.getPrice());
    }
}
