package com.agile.dev.code.chapter6;

/**
 * @description: 一定要写注释啊
 * @date: 2019-03-09 15:55
 * @author: 十一
 */
public class Frame {

    private int itsScore = 0;

    public int getScore() {
        return itsScore;
    }

    public void add(int pins) {
        itsScore += pins;
    }
}
