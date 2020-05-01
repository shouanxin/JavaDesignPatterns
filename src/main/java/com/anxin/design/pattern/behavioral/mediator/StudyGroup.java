/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/23 13:06.
 */

package com.anxin.design.pattern.behavioral.mediator;

import java.util.Date;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/23
 */
public class StudyGroup {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " user " +  user.getName() + " 消息： " + message);
    }
}
