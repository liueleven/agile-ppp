package com.agile.dev.code.chapter14.template;

/**
 * @description: 一定要写注释啊
 * @date: 2019-03-31 14:49
 * @author: 十一
 */
public class BubbleSorterTest {

    public static void main(String[] args) {
        BubbleSorter bs = new IntBubbleSorter();
        bs.doSort();
        bs.outOfOrder(0);
        bs.swap(0);

        System.out.println("\n-----------------\n");

        bs = new DoubleBubbleSorter();
        bs.doSort();
        bs.outOfOrder(1);
        bs.swap(1);
    }
}
