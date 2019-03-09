package com.agile.dev.code.chapter6;

import org.junit.Assert;
import org.junit.Test;

/**
 * @description: 一定要写注释啊
 * @date: 2019-03-09 15:54
 * @author: 十一
 */

public class TestThrow{



    @Test
    public void testScoreThrows() {
        Frame frame = new Frame();
        frame.add(5);
        Assert.assertEquals(5,frame.getScore());
    }
}
