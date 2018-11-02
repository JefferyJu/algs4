package com.jeffery.algs4.chapter1;

import edu.princeton.cs.algs4.StdIn;

/**
 * 《算法》 第一章 p33
 * <p>
 * 课后习题 1.1.3
 *
 * @author Jeffery_Ju
 * @date 2018-11-1 17:11:08
 */
public class Ex03 {
    public static void main(String[] args) {

        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int c = StdIn.readInt();

        if (a != b || a != c) {
            System.out.println("not equal");
        } else {
            System.out.println("equal");
        }
    }
}
