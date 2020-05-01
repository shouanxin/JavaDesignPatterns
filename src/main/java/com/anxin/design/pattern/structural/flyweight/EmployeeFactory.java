/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/21 20:39.
 */

package com.anxin.design.pattern.structural.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/21
 */
public abstract class EmployeeFactory {
    private static final Map<String, Employee> MAP = new ConcurrentHashMap<>();

    public static Employee getManager(String deptName) {
        Employee employee = MAP.get(deptName);
        if (null == employee) {
            Manager manager = new Manager(deptName);
            manager.setContent(deptName + " 部门汇报");
            MAP.put(deptName, manager);
            employee = manager;
            System.out.println("创建部门经理：" + deptName);
        }
        return employee;
    }
}
