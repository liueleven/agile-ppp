package com.agile.dev.code.chapter6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @description: 一定要写注释啊
 * @date: 2019-03-09 16:16
 * @author: 十一
 */
public class TestGameV4 {

    private GameV4 g;

    @Before
    public void setUp() {
        g = new GameV4();
    }

    @Test
    public void testTwoThrowsNoMark() {
        g.add(4);
        g.add(5);
        Assert.assertEquals(9,g.score());
    }

    @Test
    public void testFourThrowsNoMark() {
        g.add(4);
        g.add(5);
        g.add(7);
        g.add(2);

        Assert.assertEquals(18,g.score());
        Assert.assertEquals(9,g.scoreForFrame(1));
        Assert.assertEquals(18,g.scoreForFrame(2));
    }


    @Test
    public void testSimpleSpare() {
        g.add(3);
        g.add(7);
        g.add(3);
        Assert.assertEquals(13,g.scoreForFrame(1));
    }

    @Test
    public void testSimpleFrameAfterSpare() {
        g.add(3);
        g.add(7);
        g.add(3);
        g.add(2);
        Assert.assertEquals(13,g.scoreForFrame(1));
        Assert.assertEquals(18,g.scoreForFrame(2));
        Assert.assertEquals(18,g.score());
    }

    @Test
    public void testSimpleStrike() {
        g.add(10);
        g.add(3);
        g.add(6);
        Assert.assertEquals(19,g.scoreForFrame(1));
        Assert.assertEquals(28,g.score());
    }

    @Test
    public void testPerfectGame() {
        for (int i=0; i<12; i++) {
            g.add(10);
        }
        Assert.assertEquals(300,g.score());
    }

    @Test
    public void testEndOfArray() {
        for (int i=0; i<9; i++) {
            g.add(0);
            g.add(0);
        }
        g.add(2);
        g.add(8);
        g.add(10);
        Assert.assertEquals(20,g.score());
    }

    @Test
    public void testSapleGame() {
        g.add(1);
        g.add(4);
        g.add(4);
        g.add(5);
        g.add(6);
        g.add(4);
        g.add(4+1);
        g.add(4+1);
        g.add(4+1+5);
        g.add(0);
        g.add(1);
        g.add(1+6);
        g.add(1+6-4);
        g.add(6);
        g.add(6-2);
        g.add(6-2+6);
        g.add(2);
        g.add(8);
        g.add(6);
        Assert.assertEquals(133,g.score());
    }

    @Test
    public void testHeartBreak() {
        for (int i=0; i<11; i++) {
            g.add(10);
        }
        g.add(9);
        Assert.assertEquals(299,g.score());
    }

    @Test
    public void testTenthFrameSpare() {
        for (int i=0; i<9; i++) {
            g.add(10);
        }
        g.add(9);
        g.add(1);
        g.add(1);
        Assert.assertEquals(270,g.score());
    }
}
