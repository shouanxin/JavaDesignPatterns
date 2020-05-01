/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/22 21:55.
 */

package com.anxin.design.pattern.behavioral.interpreter;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/22
 */
public class Test {
    public static void main(String[] args){
        String str = "6 100 11 + *";
        AnExpressionParser expressionParser = new AnExpressionParser();
        int result = expressionParser.parse(str);
        System.out.println("结果：" + result);
    }
}
