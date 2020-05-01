/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/23 09:26.
 */

package com.anxin.design.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/23
 */
public class Teacher implements Observer {
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(teacherName + "老师的 " + course.getCourseName() + "课程收到一个" + question.getUserName() + "提交的" + question.getQuestionContent());
    }
}
