/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2019/12/29 11:40.
 */

package com.anxin.design.pattern.creational.abstractfactory;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2019/12/29
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public SourceCode getSourceCode() {
        return new JavaSourceCode();
    }

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
