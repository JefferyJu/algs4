package com.jeffery.algs4.chapter1;

import edu.princeton.cs.algs4.StdIn;

/**
 * 《算法》 第一章 p33
 * <p>
 * 课后习题 1.1.3
 * <p>
 * 编写一个程序， 从命令行得到三个整数参数。 如果它们都相等则打印 equal， 否则打印 not equal。
 *
 * @author Jeffery_Ju@163.com
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
