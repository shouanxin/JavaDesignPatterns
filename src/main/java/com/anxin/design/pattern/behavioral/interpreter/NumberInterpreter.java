/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/22 21:41.
 */

package com.anxin.design.pattern.behavioral.interpreter;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/22
 */
public class NumberInterpreter implements Interpreter {
    private int num;

    public NumberInterpreter(int num) {
        this.num = num;
    }

    public NumberInterpreter(String num) {
        this.num = Integer.valueOf(num);
    }

    @Override
    public int interpret() {
        return this.num;
    }
}
