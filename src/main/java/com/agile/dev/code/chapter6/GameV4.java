package com.agile.dev.code.chapter6;



/**
 * @description: 一定要写注释啊
 * @date: 2019-03-09 19:30
 * @author: 十一
 */
public class GameV4 {

    private int itsCurrentFrame = 0;
    private boolean firstThrowInFrame = true;
    private Scorer itsScorer = new Scorer();

    public int score() {

        return scoreForFrame(itsCurrentFrame);
    }


    public void add(int pins) {
        itsScorer.addThrow(pins);
        adjustCurrentFrame(pins);
    }

    private void adjustCurrentFrame(int pins) {
        if (lastBallInFrame(pins)) {
                advanceFrame();

        }else {
            firstThrowInFrame = false;
        }
    }

    private boolean lastBallInFrame(int pins) {
        return strike(pins) || !firstThrowInFrame;
    }

    private boolean strike(int pins) {
        return (firstThrowInFrame && pins == 10);
    }


    private void advanceFrame() {
        itsCurrentFrame = Math.min(10,itsCurrentFrame + 1);
    }

    public int scoreForFrame(int frame) {

        return itsScorer.scoreForFrame(frame);
    }






}
