/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/23 13:07.
 */

package com.anxin.design.pattern.behavioral.mediator;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/23
 */
public class Test {
    public static void main(String[] args){
        User userAn = new User("an");
        User userGe = new User("ge");
        userAn.sendMessage("hello");
        userGe.sendMessage("hi");

    }
}
