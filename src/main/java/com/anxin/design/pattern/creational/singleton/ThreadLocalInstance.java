/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2019/12/29 17:57.
 */

package com.anxin.design.pattern.creational.singleton;

/**
 * 〈threadlocal 线程单例〉.
 * 每个线程提供一个对象
 * @author: shouanxin
 * @date: 2019/12/29
 */
public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> THREAD_LOCAL = new ThreadLocal<ThreadLocalInstance>(){
        /**
         * Returns the current thread's "initial value" for this
         * thread-local variable.  This method will be invoked the first
         * time a thread accesses the variable with the {@link #get}
         * method, unless the thread previously invoked the {@link #set}
         * method, in which case the {@code initialValue} method will not
         * be invoked for the thread.  Normally, this method is invoked at
         * most once per thread, but it may be invoked again in case of
         * subsequent invocations of {@link #remove} followed by {@link #get}.
         *
         * <p>This implementation simply returns {@code null}; if the
         * programmer desires thread-local variables to have an initial
         * value other than {@code null}, {@code ThreadLocal} must be
         * subclassed, and this method overridden.  Typically, an
         * anonymous inner class will be used.
         *
         * @return the initial value for this thread-local
         */
        @Override
        protected ThreadLocalInstance initialValue() {
            return super.initialValue();
        }
    };

    private ThreadLocalInstance() {}

    public static ThreadLocalInstance getInstance() {
        return THREAD_LOCAL.get();
    }
}
