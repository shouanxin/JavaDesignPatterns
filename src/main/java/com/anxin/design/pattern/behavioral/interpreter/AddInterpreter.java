/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/22 21:38.
 */

package com.anxin.design.pattern.behavioral.interpreter;

/**
 * 〈加法〉.
 *
 * @author: shouanxin
 * @date: 2020/4/22
 */
public class AddInterpreter implements Interpreter {
    private Interpreter firstExpression, secondExpression;

    public AddInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return this.firstExpression.interpret() + secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "+";
    }
}
