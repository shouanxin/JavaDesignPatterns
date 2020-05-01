/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/22 20:27.
 */

package com.anxin.design.pattern.behavioral.templatemethod;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/22
 */
public class Test {
    public static void main(String[] args){
        System.out.println("后端设课程start");
        ACourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();
        System.out.println("后端课程start");

        System.out.println("前端设课程start");
        ACourse feCourse = new FECourse();
        feCourse.makeCourse();
        System.out.println("前端设课程start");
    }
}
