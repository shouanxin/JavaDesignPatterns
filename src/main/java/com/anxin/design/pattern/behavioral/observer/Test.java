/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/23 09:34.
 */

package com.anxin.design.pattern.behavioral.observer;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/23
 */
public class Test {
    public static void main(String[] args){
        Course course = new Course("java");
        Teacher teacher = new Teacher("Alpha");

        course.addObserver(teacher);
        Question question = new Question();
        question.setQuestionContent("java怎么学");
        question.setUserName("an");
        course.produceQuestion(course, question);
    }
}
