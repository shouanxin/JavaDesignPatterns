/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/23 09:49.
 */

package com.anxin.design.pattern.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/23
 */
@Data
@AllArgsConstructor
public class Article {
    private String title;
    private String content;
    private String imgs;

    public ArticleMemento saveToMemento() {
        return new ArticleMemento(this.title, this.content, this.imgs);
    }

    public void undoFromMemento(ArticleMemento articleMemento) {
        this.title = articleMemento.getTitle();
        this.content = articleMemento.getContent();
        this.imgs = articleMemento.getImgs();
    }
}
