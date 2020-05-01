/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/23 13:07.
 */

package com.anxin.design.pattern.behavioral.mediator;

import lombok.Data;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/23
 */
@Data
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        StudyGroup.showMessage(this, message);
    }
}
