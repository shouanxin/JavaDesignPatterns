/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/23 09:24.
 */

package com.anxin.design.pattern.behavioral.observer;

import java.util.Observable;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/23
 */
public class Course extends Observable {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course, Question question) {
        System.out.println(question.getUserName() + "提交了 " + question.getQuestionContent() + " 在课程 " + course.getCourseName());
        setChanged();
        notifyObservers(question);
    }
}
