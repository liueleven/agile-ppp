package com.agile.dev.code.chapter6;



/**
 * @description: 一定要写注释啊
 * @date: 2019-03-09 19:30
 * @author: 十一
 */
public class GameV3 {

    private int[] itsThrows = new int[21];
    private int itsCurrentThrow = 0;
    private int itsScore = 0;
    private int itsCurrentFrame = 1;
    private int firstThrow;
    private int ball;
    private boolean firstFrameInFrame = true;

    public int score() {

        return scoreForFrame(getCurrentFrame());
    }

    public int getCurrentFrame() {
        return itsCurrentFrame;
    }

    public void add(int pins) {
        itsThrows[itsCurrentThrow++] = pins;
        itsScore += pins;
        adjustCurrentFrame(pins);
    }

    private void adjustCurrentFrame(int pins) {
        if (firstFrameInFrame == true) {
            if (pins == 10) {
                itsCurrentFrame++;
            }else {
                firstFrameInFrame = false;
            }
        }else {
            firstFrameInFrame = true;
            itsCurrentFrame++;
        }
        itsCurrentFrame = Math.min(10,itsCurrentFrame);
    }

    public int scoreForFrame(int frame) {
        int score = 0;
        ball = 0;
        for (int currentFrame = 0; currentFrame < frame; currentFrame++) {
            firstThrow = itsThrows[ball];
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




}
