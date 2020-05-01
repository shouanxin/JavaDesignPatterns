/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/23 13:24.
 */

package com.anxin.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/23
 */
public class ArticleApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotBlank(course.getArticle())) {

            System.out.println(course.getName() + "含有手记，批准");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不含有手记，不批准");
        }
    }
}
