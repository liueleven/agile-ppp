package com.agile.dev.code.chapter14.strategy;

import org.springframework.http.converter.xml.SourceHttpMessageConverter;

/**
 * @description: 一定要写注释啊
 * @date: 2019-03-31 15:55
 * @author: 十一
 */
public class FtocStrategy implements Application {
    @Override
    public void init() {
        System.out.println("init...");
    }

    @Override
    public void idle() {
        System.out.println("idle...");
    }

    @Override
    public void cleanup() {
        System.out.println("cleanup...");
    }

    @Override
    public boolean done() {
        System.out.println("done...");
        return false;
    }
}
