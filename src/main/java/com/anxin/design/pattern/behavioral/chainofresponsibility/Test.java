/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/23 13:28.
 */

package com.anxin.design.pattern.behavioral.chainofresponsibility;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/23
 */
public class Test {
    public static void main(String[] args){
        ArticleApprover articleApprover = new ArticleApprover();
        VideoApprover videoApprover = new VideoApprover();
        Course course = new Course();
        course.setName("java");
        course.setArticle("java 手记");
        course.setVideo("java video");

        articleApprover.setNextApprover(videoApprover);
        articleApprover.deploy(course);
    }
}
