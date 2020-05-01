/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/23 21:39.
 */

package com.anxin.design.pattern.behavioral.state;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/23
 */
public class CourseVideoContext {
    private CourseVideoState videoState;

    public final static PlayState PLAY_STATE = new PlayState();
    public final static StopState STOP_STATE = new StopState();
    public final static SpeedState SPEED_STATE = new SpeedState();
    public final static PauseState PAUSE_STATE = new PauseState();

    public CourseVideoState getVideoState() {
        return videoState;
    }

    public void setCourseVideoState(CourseVideoState courseVideoState) {
        this.videoState = courseVideoState;
        this.videoState.setCourseVideoContext(this);
    }

    public void play() {
        this.videoState.play();
    }
    public void speed() {
        this.videoState.speed();
    }
    public void stop() {
        this.videoState.stop();
    }
    public void pause() {
        this.videoState.pause();
    }
}
