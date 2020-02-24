/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2019/12/29 11:35.
 */

package com.anxin.design.pattern.creational.abstractfactory;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2019/12/29
 */
public interface CourseFactory {
    SourceCode getSourceCode();
    Video getVideo();
}
