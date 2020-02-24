/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2019/12/29 14:39.
 */

package com.anxin.design.pattern.creational.builder;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2019/12/29
 */
public class CourseActualBuilder implements CourseBuilder{
    private Course course = new Course();
    @Override
    public void buildCourseName(String name) {
        course.setName(name);
    }

    @Override
    public void buildCourseId(int id) {
        course.setId(id);
    }

    @Override
    public Course buildCourse() {
        return course;
    }
}
