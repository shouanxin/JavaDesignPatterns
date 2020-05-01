/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/20 08:58.
 */

package com.anxin.design.pattern.structural.facade;

/**
 * 〈封装写信过程〉.
 *
 * @author: shouanxin
 * @date: 2020/4/20
 */
public class ModenPostOffice {
    private ILetterProcess letterProcess = new LetterProcessImpl();
    /**
     * 功能描述: 〈封装过程〉.
     *
     * @param context
     * @param address
     * @return  void
     * @author shouanxin
     * @date  2020/4/20 09:00
     */
    public void sendLetter(String context, String address) {
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }
}
