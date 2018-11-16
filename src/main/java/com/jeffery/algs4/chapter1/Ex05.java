package com.jeffery.algs4.chapter1;

import edu.princeton.cs.algs4.StdIn;

/**
 * 《算法》 第一章 p33
 * <p>
 * 课后习题 1.1.5
 * <p>
 * 编写一段程序， 如果 double 类型的变量 x 和 y 都严格位于 0 和 1 之间则打印 true， 否则打印 false
 *
 * @author Jeffery_Ju@163.com
 * @date 2018-11-1 17:13:08
 */
public class Ex05 {
    public static void main(String[] args) {
        double x = StdIn.readDouble();
        double y = StdIn.readDouble();
        System.out.println(x > 0 && x < 1 && y > 0 && y < 1);
    }
}
