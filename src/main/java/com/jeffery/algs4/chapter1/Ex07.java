package com.jeffery.algs4.chapter1;

import edu.princeton.cs.algs4.StdOut;

/**
 * 《算法》 第一章 p33
 * <p>
 * 课后习题 1.1.7
 *
 * @author Jeffery_Ju@163.com
 * @date 2018-11-10 15:28:50
 */
public class Ex07 {
    public static void main(String[] args) {
        a();
        b();
        c();
    }

    /**
     * 1.1.7 a
     */
    private static void a() {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001) {
            t = (9.0 / t + t) / 2.0;
        }
        StdOut.printf("%.5f\n", t);
    }

    /**
     * 1.1.7 b
     */
    private static void b() {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        StdOut.println(sum);
    }

    /**
     * 1.1.7 c
     */
    private static void c() {
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < 1000; j++) {
                System.out.println(i+" "+j);
                sum++;
            }
        }
        StdOut.println(sum);
    }
}
