/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/22 21:06.
 */

package com.anxin.design.pattern.behavioral.strategy;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/22
 */
public class LiJianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("立减促销");
    }
}
