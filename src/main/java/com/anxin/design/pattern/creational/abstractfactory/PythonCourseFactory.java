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
public class PythonCourseFactory implements CourseFactory {
    @Override
    public SourceCode getSourceCode() {
        return new PythonSourceCode();
    }

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
