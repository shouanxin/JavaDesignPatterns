/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/3/28 21:28.
 */

package com.anxin.design.pattern.creational.protetype;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/3/28
 */
public class Test {
    public static void main(String[] args){
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        LocalDateTime startTime = LocalDateTime.parse("2020-04-13 16:07:05",df);
//
//        LocalDateTime endTime = LocalDateTime.parse("2020-04-13 17:06:05",df);
//        pageTime(startTime, endTime);
        LocalDate nowDate = LocalDate.now();
        LocalDateTime localDateTime = nowDate.atTime(LocalTime.of(7, 0));
        System.out.println(localDateTime);
        System.out.println(-1 << 29);
    }

    public static void pageTime(LocalDateTime startTime, LocalDateTime endTime) {
        int page = 0;
        LocalDateTime pageStartTime;
        LocalDateTime pageEndTime = startTime;
        while (pageEndTime.isBefore(endTime)) {
            pageStartTime = pageEndTime;
            pageEndTime = pageStartTime.plusMinutes(5L);
            page ++;
        }
        System.out.println(page);
    }
}
