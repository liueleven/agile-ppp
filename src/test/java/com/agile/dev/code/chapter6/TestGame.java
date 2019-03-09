package com.agile.dev.code.chapter6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @description: 一定要写注释啊
 * @date: 2019-03-09 16:16
 * @author: 十一
 */
public class TestGame {

    private Game g;

    @Before
    public void setUp() {
        g = new Game();
    }
    @Test
    public void testTwoThrowsNoMark() {
        g.add(5);
        g.add(4);
        Assert.assertEquals(9,g.score());
        Assert.assertEquals(2,g.getCurrentFrame());
    }


    @Test
    public void testFourThrowsNoMark() {
        g.add(5);
        g.add(4);
        g.add(7);
        g.add(2);
        Assert.assertEquals(18,g.score());
        Assert.assertEquals(9,g.scoreForFrame(1));
        Assert.assertEquals(18,g.scoreForFrame(2));
        Assert.assertEquals(3,g.getCurrentFrame());
    }

    @Test
    public void testSimpleSpare() {
        g.add(3);
        g.add(7);
        g.add(3);
        g.add(2);
        Assert.assertEquals(13,g.scoreForFrame(1));
    }

    @Test
    public void testCurrentFrame() {
        g.add(5);
        Assert.assertEquals(5,g.score());
        Assert.assertEquals(1,g.getCurrentFrame());
    }

    @Test
    public void testOneThrows() {
        g.add(5);
        Assert.assertEquals(5,g.score());
        Assert.assertEquals(1,g.getCurrentFrame());
    }

    @Test
    public void testPerfectGame() {
        for (int i=0; i<12; i++) {
            g.add(10);
        }
        Assert.assertEquals(300,g.score());
        Assert.assertEquals(10,g.getCurrentFrame());
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
