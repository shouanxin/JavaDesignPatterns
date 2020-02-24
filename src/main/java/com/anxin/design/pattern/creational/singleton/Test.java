/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2019/12/29 15:28.
 */

package com.anxin.design.pattern.creational.singleton;

import com.anxin.design.pattern.creational.abstractfactory.SourceCode;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2019/12/29
 */
public class Test {
    public static void main(String[] args) throws Exception{
//        Thread t1 = new Thread(new MyThread());
//        Thread t2 = new Thread(new MyThread());
//
//        t1.start();
//        t2.start();
//        System.out.println("end");
//        testSerializable();
        testReflect();
    }

    private static void testSerializable() throws IOException, ClassNotFoundException {
        SerializableLazyVolatileSingleton instance = SerializableLazyVolatileSingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton"));
        oos.writeObject(instance);

        File file = new File("singleton");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        SerializableLazyVolatileSingleton o = (SerializableLazyVolatileSingleton) ois.readObject();
        System.out.println(instance);
        System.out.println(o);
        System.out.println(instance == o);
    }

    private static void testReflect() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class objectClass = ReflectHungrySingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        // 修改权限
        constructor.setAccessible(true);
        ReflectHungrySingleton instance = ReflectHungrySingleton.getInstance();
        System.out.println(instance);
        ReflectHungrySingleton newInstance = (ReflectHungrySingleton) constructor.newInstance();

        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
