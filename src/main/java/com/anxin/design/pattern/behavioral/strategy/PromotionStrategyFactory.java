/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/22 21:17.
 */

package com.anxin.design.pattern.behavioral.strategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/22
 */
public class PromotionStrategyFactory {
    private static final Map<String, PromotionStrategy> MAP = new ConcurrentHashMap<>();

    static {
        MAP.put(PromotionKey.LIJIAN, new LiJianPromotionStrategy());
        MAP.put(PromotionKey.MANJIAN, new ManJianPromotionStrategy());
        MAP.put(PromotionKey.FANXIAN, new FanXianPromotionStrategy());
    }

    private static final PromotionStrategy EMPTY = new EmptyPromotionStrategy();

    private PromotionStrategyFactory(){

    }

    public static PromotionStrategy getPromotionStategy(String promotionKey) {
        return MAP.get(promotionKey) == null ? EMPTY : MAP.get(promotionKey);
    }

    private interface PromotionKey{
        String LIJIAN = "LIJIAN";
        String MANJIAN = "MANJIAN";
        String FANXIAN = "FANXIAN";
    }
}
