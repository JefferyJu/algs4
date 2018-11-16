package com.jeffery.algs4.chapter1;

/**
 * 《算法》 第一章 p33
 * <p>
 * 课后习题 1.1.5
 * <p>
 * 下列语句会打印出什么结果？ 给出解释。
 * a. System.out.println('b');
 * b. System.out.println('b' + 'c');
 * c. System.out.println((char) ('a' + 4));
 *
 * @author Jeffery_Ju@163.com
 * @date 2018-11-10 15:29:11
 */
public class Ex08 {
    public static void main(String[] args) {
        // A 65 a 97
        System.out.println('b');
        // 转int 再计算
        System.out.println('b' + 'c');
        // 101 e
        System.out.println((char) ('a' + 4));
    }
}
