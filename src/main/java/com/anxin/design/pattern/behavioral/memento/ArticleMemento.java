/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/23 09:50.
 */

package com.anxin.design.pattern.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/23
 */
@Getter
@AllArgsConstructor
public class ArticleMemento {
    private String title;
    private String content;
    private String imgs;
}
