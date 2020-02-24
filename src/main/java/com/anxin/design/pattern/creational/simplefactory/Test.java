/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2019/12/28 17:49.
 */

package com.anxin.design.pattern.creational.simplefactory;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2019/12/28
 */
public class Test {
    public static void main(String[] args){
        Video video = VideoFactory.getVideo(JavaVideo.class);
        video.produce();
    }
}
