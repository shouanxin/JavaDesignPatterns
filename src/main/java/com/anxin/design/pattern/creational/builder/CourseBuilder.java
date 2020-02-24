/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2019/12/29 14:38.
 */

package com.anxin.design.pattern.creational.builder;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2019/12/29
 */
public interface CourseBuilder {
    void buildCourseName(String name);
    void buildCourseId(int id);
    Course buildCourse();
}
