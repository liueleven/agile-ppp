package com.agile.dev.code.chapter4;

/**
 * @description: 重构1
 * @date: 2019-02-27 16:10
 * @author: 十一
 */
public class GeneratePrimesV1 {

    private static int s;
    private static boolean[] f;
    private static int[] primes;

    public static int[] generatePrimes(int maxValue) {
        if(maxValue < 2) {
            return new int[0];
        }else {
            initializeSieve(maxValue);
            sieve();
            // 返回结果
            loadPrimes();
        }
        return primes;
    }

    private static void initializeSieve(int maxValue) {
        s = maxValue + 1;
        f = new boolean[s];
        int i;

        for (i=0; i<s; i++) {
            f[i] = true;
        }

        f[0] = f[1] = false;
    }

    private static void loadPrimes() {
        int i;
        int j;
        int count = 0;

        for (i = 0; i < s; i++) {
            if(f[i]) {
                count ++;
            }
        }

        primes = new int[count];

        for(i=0,j=0; i<s; i++) {
            if(f[i]) {
                primes[j++] = i;
            }
        }
    }

    private static void sieve() {
        int i;
        int j;
        for (i=2; i<Math.sqrt(s) + 1; i++) {
            if(f[i]) {
                for (j=2*i; j<s; j+=i) {
                    f[j] = false;
                }
            }
        }
    }
}
