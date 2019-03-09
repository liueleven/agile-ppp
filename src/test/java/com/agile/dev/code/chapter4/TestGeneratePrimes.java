package com.agile.dev.code.chapter4;

import com.agile.dev.code.chapter5.GeneratePrimes;
import com.agile.dev.code.chapter5.GeneratePrimesV1;
import com.agile.dev.code.chapter5.GeneratePrimesV2;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * @description: 一定要写注释啊
 * @date: 2019-02-26 23:49
 * @author: 十一
 */
public class TestGeneratePrimes extends TestCase {


    @Test
    public void testTestGeneratePrimes() {
        int[] nullArray = GeneratePrimes.generatePrimes(0);
        Assert.assertEquals(nullArray.length,0);

        int[] miniArray = GeneratePrimes.generatePrimes(2);
        Assert.assertEquals(miniArray[0],2);
        Assert.assertEquals(miniArray.length,1);

        int[] threeArray = GeneratePrimes.generatePrimes(3);
        Assert.assertEquals(threeArray[0],2);
        Assert.assertEquals(threeArray[1],3);
        Assert.assertEquals(threeArray.length,2);

        int[] centArray = GeneratePrimes.generatePrimes(100);
        Assert.assertEquals(centArray[24],97);
        Assert.assertEquals(centArray.length,25);


    }

    @Test
    public void testTestGeneratePrimesV1() {
        int[] nullArray = GeneratePrimesV1.generatePrimes(0);
        Assert.assertEquals(nullArray.length,0);

        int[] miniArray = GeneratePrimesV1.generatePrimes(2);
        Assert.assertEquals(miniArray[0],2);
        Assert.assertEquals(miniArray.length,1);

        int[] threeArray = GeneratePrimesV1.generatePrimes(3);
        Assert.assertEquals(threeArray[0],2);
        Assert.assertEquals(threeArray[1],3);
        Assert.assertEquals(threeArray.length,2);

        int[] centArray = GeneratePrimesV1.generatePrimes(100);
        Assert.assertEquals(centArray[24],97);
        Assert.assertEquals(centArray.length,25);


    }

    @Test
    public void testTestGeneratePrimesV2() {
//        int[] nullArray = GeneratePrimesV2.generatePrimes(0);
//        Assert.assertEquals(nullArray.length,0);
//
//        int[] miniArray = GeneratePrimesV2.generatePrimes(2);
//        Assert.assertEquals(miniArray[0],2);
//        Assert.assertEquals(miniArray.length,1);
//
//        int[] threeArray = GeneratePrimesV2.generatePrimes(3);
//        Assert.assertEquals(threeArray[0],2);
//        Assert.assertEquals(threeArray[1],3);
//        Assert.assertEquals(threeArray.length,2);

        int[] centArray = GeneratePrimesV2.generatePrimes(100);
        Assert.assertEquals(centArray[24],97);
        Assert.assertEquals(centArray.length,25);


    }

}
