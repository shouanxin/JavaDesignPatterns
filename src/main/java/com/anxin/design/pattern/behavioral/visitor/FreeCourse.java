/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/23 19:38.
 */

package com.anxin.design.pattern.behavioral.visitor;


/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/23
 */
public class FreeCourse extends Course{

    @Override
    public void accept(Ivisitor ivisitor) {
        ivisitor.visit(this);
    }
}
