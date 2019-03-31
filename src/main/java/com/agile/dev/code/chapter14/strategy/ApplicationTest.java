package com.agile.dev.code.chapter14.strategy;

/**
 * @description: 策略模式
 * @date: 2019-03-31 15:58
 * @author: 十一
 */
public class ApplicationTest {


    public static void main(String[] args) {
        ApplicationRunner ar = new ApplicationRunner(new FtocStrategy());
        ar.run();
    }
}
