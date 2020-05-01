/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/3/28 21:18.
 */

package com.anxin.design.pattern.creational.protetype;

import java.text.MessageFormat;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/3/28
 */
public class MailUtils {
    public static void sendMail(Mail mail) {
        String content = "向{0}同学，邮件地址：{1}，邮件内容：{2}, 发送邮件成功";
        String format = MessageFormat.format(content, mail.getName(), mail.getAddress(), mail.getContent());
        System.out.println(format);
    }

    public static void saveOriginMail(Mail mail) {
        System.out.println("存储原始邮件记录，" + mail.getContent());
    }
}
