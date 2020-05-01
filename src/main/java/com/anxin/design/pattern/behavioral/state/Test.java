/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/23 21:53.
 */

package com.anxin.design.pattern.behavioral.state;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/23
 */
public class Test {
    public static void main(String[] args){
        CourseVideoContext courseVideoContext = new CourseVideoContext();
        courseVideoContext.setCourseVideoState(new PlayState());
        System.out.println("当前状态： " + courseVideoContext.getVideoState().getClass().getSimpleName());
        courseVideoContext.pause();

        System.out.println("当前状态： " + courseVideoContext.getVideoState().getClass().getSimpleName());

    }
}
