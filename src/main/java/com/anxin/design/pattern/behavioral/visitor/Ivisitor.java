/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/23 19:39.
 */

package com.anxin.design.pattern.behavioral.visitor;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/23
 */
public interface Ivisitor {
    void visit(FreeCourse freeCourse);

    void visit(CodingCourse codingCourse);
}
