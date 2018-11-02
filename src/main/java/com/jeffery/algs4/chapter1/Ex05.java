package com.jeffery.algs4.chapter1;

import edu.princeton.cs.algs4.StdIn;

/**
 * 《算法》 第一章 课后习题 1.1.5
 *
 * @author Jeffery_Ju
 * @date 2018-11-1 17:13:08
 */
public class Ex05 {
    public static void main(String[] args) {
        double x = StdIn.readDouble();
        double y = StdIn.readDouble();
        System.out.println(x > 0 && x < 1 && y > 0 && y < 1);
    }
}
