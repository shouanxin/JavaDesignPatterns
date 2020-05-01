/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2020/4/23 09:53.
 */

package com.anxin.design.pattern.behavioral.memento;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2020/4/23
 */
public class Test {
    public static void main(String[] args){
        ArticleMementoManager articleMementoManager = new ArticleMementoManager();
        Article article = new Article("java", "java", "javaimgs");
        ArticleMemento articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);
        System.out.println("保存" + article);

        article.setTitle("javaB");
        article.setContent("JavaB");
        article.setImgs("JavaBimags");
        articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);
        System.out.println("保存" + article);

        article.setTitle("javaC");
        article.setContent("JavaC");
        article.setImgs("JavaCimags");
        System.out.println("修改 " + article);

        System.out.println("开始回退1");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);
        System.out.println(article);
    }
}
