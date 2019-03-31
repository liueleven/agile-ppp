package com.agile.dev.code.chapter14.strategy;

/**
 * @description: 一定要写注释啊
 * @date: 2019-03-31 15:51
 * @author: 十一
 */
public interface Application {

    void init();

    void idle();

    void cleanup();

    boolean done();
}
