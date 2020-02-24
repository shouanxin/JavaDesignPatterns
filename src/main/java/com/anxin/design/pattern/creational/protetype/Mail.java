/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2019/12/29 18:33.
 */

package com.anxin.design.pattern.creational.protetype;

import lombok.Data;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2019/12/29
 */
@Data
public class Mail {
    private String name;
    private String address;
    private String content;

    public Mail(){
        System.out.println("mail constructor");
    }
}
