/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/23 19:39.
 */

package com.anxin.design.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/23
 */
public class Test {
    public static void main(String[] args){
        List<Course> courseList = new ArrayList<>();

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("MVC");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setPrice(299);
        codingCourse.setName("java");

        courseList.add(freeCourse);
        courseList.add(codingCourse);

        for (Course course : courseList) {
            course.accept(new Visitor());
        }
    }
}
