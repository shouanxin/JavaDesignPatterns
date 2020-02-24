/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2019/12/28 17:53.
 */

package com.anxin.design.pattern.creational.factorymethod;


/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2019/12/28
 */
public class PythonVideo implements Video {
    @Override
    public void produce() {
        System.out.println("python视频");
    }
}
