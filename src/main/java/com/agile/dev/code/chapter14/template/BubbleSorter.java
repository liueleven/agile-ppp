package com.agile.dev.code.chapter14.template;

/**
 * @description: 一定要写注释啊
 * @date: 2019-03-31 14:46
 * @author: 十一
 */
public abstract class BubbleSorter {

    protected int doSort() {
        // todo
        System.out.println("common doSort method...");
        return 0;
    }

    protected abstract void swap(int index);

    protected abstract boolean outOfOrder(int index);
}
