/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2019/12/29 14:47.
 */

package com.anxin.design.pattern.creational.builder;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2019/12/29
 */
public class Test {
    public static void main(String[] args){
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Director director = new Director();
        director.setCourseBuilder(courseBuilder);
        Course java = director.makeCourse("java", 101);
        System.out.println(java);

    }
}
