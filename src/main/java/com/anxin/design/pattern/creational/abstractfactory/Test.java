/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2019/12/29 11:41.
 */

package com.anxin.design.pattern.creational.abstractfactory;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2019/12/29
 */
public class Test {
    public static void main(String[] args){
        CourseFactory courseFactory = new JavaCourseFactory();
        SourceCode sourceCode = courseFactory.getSourceCode();
        Video video = courseFactory.getVideo();
        sourceCode.produce();
        video.produce();
    }
}
