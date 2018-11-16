package com.jeffery.algs4.chapter1;

/**
 * 《算法》 第一章 p33
 * <p>
 * 课后习题 1.1.2
 * <p>
 * 给出以下表达式的类型和值：
 * a. (1 + 2.236)/2
 * b. 1 + 2 + 3 + 4.0
 * c. 4.1 >= 4
 * d. 1 + 2 + "3"
 *
 * @author Jeffery_Ju@163.com
 * @date 2018-11-1 17:33:24
 */
public class Ex02 {
    public static void main(String[] args) {
        double v = (1 + 2.236) / 2;
        System.out.println(v);
        double v1 = 1 + 2 + 3 + 4.0;
        System.out.println(v1);
        boolean b = 4.1 >= 4;
        System.out.println(b);
        String s = 1 + 2 + "3";
        System.out.println(s);
    }
}
