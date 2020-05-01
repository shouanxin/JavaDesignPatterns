/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/22 21:44.
 */

package com.anxin.design.pattern.behavioral.interpreter;

import java.util.Stack;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/22
 */
public class AnExpressionParser {
    private Stack<Interpreter> stack = new Stack<>();

    public int parse(String str) {
        String[] strItemArray = str.split(" ");
        for (String symbol : strItemArray) {
            // 数字
            if (!OperatorUtil.isOperator(symbol)) {
                NumberInterpreter numberInterpreter = new NumberInterpreter(symbol);
                stack.push(numberInterpreter);
                System.out.println("入栈 ：" + symbol);
            } else {
                // 运算符
                Interpreter firstExpression = stack.pop();
                Interpreter secondExpression = stack.pop();
                System.out.println("出栈");
                Interpreter operator = OperatorUtil.getExpressionObject(firstExpression, secondExpression, symbol);
                int result = operator.interpret();
                NumberInterpreter numberInterpreter = new NumberInterpreter(result);
                stack.push(numberInterpreter);
                System.out.println("阶段结果入栈：" + result);
            }
        }
        return stack.pop().interpret();
    }
}
