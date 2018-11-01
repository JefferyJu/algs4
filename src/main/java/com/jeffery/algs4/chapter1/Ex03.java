package com.jeffery.algs4.chapter1;

/**
 * 《算法》 第一章 p33 1.1.3
 *
 * @author Jeffery_Ju
 * @date 2018-11-1 17:11:08
 */
public class Ex03 {
    public static void main(String[] args) {
        if (Integer.parseInt(args[0]) != Integer.parseInt(args[1])
                || Integer.parseInt(args[0]) != Integer.parseInt(args[2])) {
            System.out.println("not equal");
        } else {
            System.out.println("equal");
        }
    }
}
