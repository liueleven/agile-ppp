package com.agile.dev.code.chapter6;

import org.junit.Assert;
import org.junit.Test;

/**
 * @description: 一定要写注释啊
 * @date: 2019-03-09 16:04
 * @author: 十一
 */
public class TestFrame {

    @Test
    public void testOneThrows() {
        Game game = new Game();
        game.add(5);
        Assert.assertEquals(5,game.score());
    }
}
