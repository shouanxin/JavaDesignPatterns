/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2019/12/29 14:45.
 */

package com.anxin.design.pattern.creational.builder;

import lombok.Data;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2019/12/29
 */
@Data
public class Director {
    private CourseBuilder courseBuilder;
    public Course makeCourse(String name, int id) {
        courseBuilder.buildCourseId(id);
        courseBuilder.buildCourseName(name);
        return courseBuilder.buildCourse();
    }
}
