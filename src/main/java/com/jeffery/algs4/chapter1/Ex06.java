package com.jeffery.algs4.chapter1;

import edu.princeton.cs.algs4.StdOut;

/**
 * 《算法》 第一章 p33
 * <p>
 * 课后习题 1.1.6
 * <p>
 * 下面这段程序会打印出什么？
 *
 * @author Jeffery_Ju@163.com
 * @date 2018-11-7 10:28:27
 */
public class Ex06 {

    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            // f为f与g之和，g为原来的f
            f = f + g;
            g = f - g;
        }
    }
}
