/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/19 21:42.
 */

package com.anxin.design.pattern.structural.facade;

/**
 * 〈写信〉.
 *
 * @author: shouanxin
 * @date: 2020/4/19
 */
public interface ILetterProcess {
    /**
     * 功能描述: 〈写入信的内容〉.
     *
     * @param context
     * @return  void
     * @author shouanxin
     * @date  2020/4/20 08:52
     */
    void writeContext(String context);

    /**
     * 功能描述: 〈填充信的地址〉.
     *
     * @param address
     * @return  void
     * @author shouanxin
     * @date  2020/4/20 08:52
     */
    void fillEnvelope(String address);

    /**
     * 功能描述: 〈把信放到信封里〉.
     *
     * @param
     * @return  void
     * @author shouanxin
     * @date  2020/4/20 08:52
     */
    void letterIntoEnvelope();

    /**
     * 功能描述: 〈邮递〉.
     *
     * @param
     * @return  void
     * @author shouanxin
     * @date  2020/4/20 08:53
     */
    void sendLetter();
}
