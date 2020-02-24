/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2019/12/28 18:51.
 */

package com.anxin.design.pattern.creational.factorymethod;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2019/12/28
 */
public class JavaFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
