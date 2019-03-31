package com.agile.dev.code.chapter14.strategy;

/**
 * @description: 一定要写注释啊
 * @date: 2019-03-31 15:51
 * @author: 十一
 */
public class ApplicationRunner {

    public Application application;

    public ApplicationRunner(Application application) {
        this.application = application;
    }

    public void run () {
        application.init();
        application.idle();
        application.cleanup();
        application.done();
        System.out.println("ApplicationRunner.run()...finished");
    }
}
