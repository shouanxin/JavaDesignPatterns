/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/23 09:51.
 */

package com.anxin.design.pattern.behavioral.memento;

import java.util.Stack;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/23
 */
public class ArticleMementoManager {
    private final Stack<ArticleMemento> mementoStack = new Stack<>();

    public ArticleMemento getMemento() {
        return mementoStack.pop();
    }

    public void addMemento(ArticleMemento articleMemento) {
        mementoStack.push(articleMemento);
    }
}
