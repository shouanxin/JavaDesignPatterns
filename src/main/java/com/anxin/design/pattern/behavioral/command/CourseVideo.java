/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/23 12:47.
 */

package com.anxin.design.pattern.behavioral.command;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/23
 */
public class CourseVideo {
    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open(){
        System.out.println(this.name + "课程开放");
    }

    public void close(){
        System.out.println(this.name + "课程关闭");
    }
}
