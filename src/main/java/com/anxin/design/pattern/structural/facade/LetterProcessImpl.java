/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/20 08:50.
 */

package com.anxin.design.pattern.structural.facade;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/20
 */
public class LetterProcessImpl implements ILetterProcess{
    /**
     * 功能描述: 〈写入信的内容〉.
     *
     * @param context
     * @return void
     * @author shouanxin
     * @date 2020/4/20 08:52
     */
    @Override
    public void writeContext(String context) {
        System.out.println("信的内容：" + context);
    }

    /**
     * 功能描述: 〈填充信的地址〉.
     *
     * @param address
     * @return void
     * @author shouanxin
     * @date 2020/4/20 08:52
     */
    @Override
    public void fillEnvelope(String address) {
        System.out.println("信的地址：" + address);
    }

    /**
     * 功能描述: 〈把信放到信封里〉.
     *
     * @return void
     * @author shouanxin
     * @date 2020/4/20 08:52
     */
    @Override
    public void letterIntoEnvelope() {
        System.out.println("把信放到信封里");
    }

    /**
     * 功能描述: 〈邮递〉.
     *
     * @return void
     * @author shouanxin
     * @date 2020/4/20 08:53
     */
    @Override
    public void sendLetter() {
        System.out.println("邮递信件。。。");
    }
}
