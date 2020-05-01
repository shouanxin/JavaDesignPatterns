/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/21 20:44.
 */

package com.anxin.design.pattern.structural.flyweight;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/21
 */
public class Test {
    public static void main(String[] args){
        String deptName = "RD";
        for (int i = 0; i < 4; i++) {
            Manager manager = (Manager) EmployeeFactory.getManager(deptName);
            manager.report();
        }
    }
}
