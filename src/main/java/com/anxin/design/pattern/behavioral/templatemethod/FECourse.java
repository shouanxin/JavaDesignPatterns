/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/22 20:26.
 */

package com.anxin.design.pattern.behavioral.templatemethod;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/22
 */
public class FECourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供课程前端代码，图片等素材");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
