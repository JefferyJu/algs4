package com.jeffery.algs4.chapter1;

/**
 * 《算法》 第一章
 * <p>
 * 课后习题 1.1.26
 * <p>
 * 将三个数字排序。 假设 a、 b、 c 和 t 都是同一种原始数字类型的变量。 证明以下代码能够将 a、
 * b、 c 按照升序排列：
 * if (a > b) { t = a; a = b; b = t; }
 * if (a > c) { t = a; a = c; c = t; }
 * if (b > c) { t = b; b = c; c = t; }
 *
 * @author Jeffery_Ju@163.com
 * @date 2018-11-16 14:27:20
 */
public class Ex26 {
    public static void main(String[] args) {
        int a = 6, b = 4, c = 3;
        int t;
        if (a > b) {
            t = a;
            a = b;
            b = t;
        }
        if (a > c) {
            t = a;
            a = c;
            c = t;
        }
        if (b > c) {
            t = b;
            b = c;
            c = t;
        }
        System.out.println(a + " < " + b + " < " + c);
    }
}
