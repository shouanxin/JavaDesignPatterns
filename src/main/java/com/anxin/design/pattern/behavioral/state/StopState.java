/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/23 21:41.
 */

package com.anxin.design.pattern.behavioral.state;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/23
 */
public class StopState extends CourseVideoState {
    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("停止状态不能快进");
    }

    @Override
    public void pause() {
        System.out.println("停止状态不能暂停");
    }

    @Override
    public void stop() {
        System.out.println("暂停播放");
    }
}
