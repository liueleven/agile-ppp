package com.agile.dev.code.chapter14.template;

/**
 * @description: 一定要写注释啊
 * @date: 2019-03-31 14:51
 * @author: 十一
 */
public class DoubleBubbleSorter extends BubbleSorter{
    @Override
    protected void swap(int index) {
        // todo
        System.out.println("DoubleBubbleSorter special swap method. index: " + index);
    }

    @Override
    protected boolean outOfOrder(int index) {
        // todo
        System.out.println("DoubleBubbleSorter special outOfOrder method. index: " + index);
        return false;
    }
}