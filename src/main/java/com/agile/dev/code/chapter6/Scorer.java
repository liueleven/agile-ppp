package com.agile.dev.code.chapter6;

/**
 * @description: 一定要写注释啊
 * @date: 2019-03-09 21:48
 * @author: 十一
 */
public class Scorer {


    private int ball;
    private int[] itsThrows = new int[21];
    private int itsCurrentThrow = 0;

    public int scoreForFrame(int frame) {

        int score = 0;
        ball = 0;
        for (int currentFrame = 0; currentFrame < frame; currentFrame++) {
            if(strike()) {
                score += 10 + nexTwoBallForStrike();
                ball++;
            }else if(spare()) {
                score += 10 + nextBallForSpare();
                ball += 2;
            }else {
                score += twoBallsInFrame();
                ball += 2;
            }


        }
        return score;
    }

    private int nexTwoBallForStrike() {
        return itsThrows[ball+1] + itsThrows[ball+2];
    }

    private boolean strike() {
        return itsThrows[ball] == 10;
    }

    private int nextBallForSpare() {
        return itsThrows[ball+2];
    }

    private int twoBallsInFrame() {
        return itsThrows[ball] + itsThrows[ball+1];
    }

    private boolean spare() {
        return (itsThrows[ball] + itsThrows[ball+1]) == 10;
    }

    public void addThrow(int pins) {
        itsThrows[itsCurrentThrow++] = pins;
    }
}
