package com.agile.dev.code.chapter5;


import java.util.Arrays;

/**
 * @description: 找到某个数的所有素数
 * @date: 2019-02-26 23:39
 * @author: 十一
 */
public class GeneratePrimes {

    public static void main(String[] args) {
        int[] ints = generatePrimes(8);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] generatePrimes(int maxVal) {
        if(maxVal >= 2) {
            int s = maxVal + 1;
            boolean[] f = new boolean[s];
            int i;

            for (i=0; i<s; i++) {
                f[i] = true;
            }

            f[0] = f[1] = false;

            int j;
            for (i=2; i<Math.sqrt(s) + 1; i++) {
                for (j = 2 * i; j<s; j+=i) {
                    f[j] = false;
                }
            }

            int count = 0;
            for (i=0; i<s; i++) {
                if(f[i]) {
                    count++;
                }
            }

            int[] primes = new int[count];
            for(i=0,j=0; i<s; i++) {
                if(f[i]) {
                    primes[j++] = i;
                }
            }
            return primes;
        }else {
            return new int[0];
        }

    }
}
