/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/20 08:55.
 */

package com.anxin.design.pattern.structural.facade;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/20
 */
public class Test {
    public static void main(String[] args){
        test1();
        test2();
    }

    public static void test1(){
        ILetterProcess letterProcess = new LetterProcessImpl();
        letterProcess.writeContext("举报举报");
        letterProcess.fillEnvelope("123@11");
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }

    public static void test2() {
        ModenPostOffice modenPostOffice = new ModenPostOffice();
        modenPostOffice.sendLetter("第二次写信", "123@qq.com");
    }

}
