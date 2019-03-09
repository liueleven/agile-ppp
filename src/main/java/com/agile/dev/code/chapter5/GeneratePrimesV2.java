package com.agile.dev.code.chapter5;

/**
 * @description: 重构v2
 * @date: 2019-02-27 18:38
 * @author: 十一
 */
public class GeneratePrimesV2 {
    
    private static boolean[] crossedOut;

    private static int[] result;
    
    public static int[] generatePrimes(int maxValue) {
        if (maxValue < 2) {
            return new int[0];
        }else {
            uncrossIntegersUpTo(maxValue);
            crossOutMultiples();
            putUncrossedIntegersIntoResult();
            return result;
        }
    }
    
    private static void uncrossIntegersUpTo(int maxValue) {
        crossedOut = new boolean[maxValue + 1];
        for (int i=2; i<crossedOut.length; i++) {
            crossedOut[i] = false;
        }
    }
    
    private static void crossOutMultiples() {
        int limit = determineIterationLimit();
        for (int i=2; i<limit; i++) {
            if(notCrossed(i)) {
                crossOutMultiplesOf(i);
            }
        }
    }
    
    private static int determineIterationLimit() {
        double iterationLimit = Math.sqrt(crossedOut.length);
        System.out.println(iterationLimit);
        return (int) iterationLimit;
    }

    /**
     * 什么是素数？大于1的数且能对其它数整除，4，6，8，9...
     * 这是核心算法
     * @param i
     */
    private static void crossOutMultiplesOf(int i) {
        for (int multiple = 2*i; multiple < crossedOut.length; multiple += i) {
            crossedOut[multiple] = true;
        }
    }
    private static boolean notCrossed(int i) {
        return crossedOut[i] == false;
    }
    private static void putUncrossedIntegersIntoResult() {
        result = new int[numberOfUncrossedIntegers()];
        for (int j=0,i=2; i<crossedOut.length; i++) {
            if(notCrossed(i)) {
                result[j++] = i;
            }
        }
    }
    private static int numberOfUncrossedIntegers() {
        int count = 0;
        for (int i=2; i<crossedOut.length; i++) {
            if(notCrossed(i)) {
                count ++;
            }
        }
        return count;
    }
}
