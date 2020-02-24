/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2019/12/28 18:52.
 */

package com.anxin.design.pattern.creational.factorymethod;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2019/12/28
 */
public class Test {
    public static void main(String[] args){
        VideoFactory videoFactory = new JavaFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
