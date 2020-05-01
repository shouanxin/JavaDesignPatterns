/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/21 21:22.
 */

package com.anxin.design.pattern.structural.composite;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/21
 */
public class Test {
    public static void main(String[] args){
        Course course = new Course("java", 321.0);
        CourseCatalog courseCatalog = new CourseCatalog("java系列");
        courseCatalog.add(course);
        courseCatalog.print();
    }
}
