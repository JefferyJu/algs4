package com.jeffery.algs4.chapter1;

/**
 * 《算法》 第一章
 * <p>
 * 课后习题 1.1.16
 *
 * @author Jeffery_Ju@163.com
 * @date 2018-11-12 15:42:33
 */
public class Ex16 {
    public static void main(String[] args) {
        //给出 exR1(6) 的返回值：311361142246
        System.out.println(exR1(6));
    }

    public static String exR1(int n) {
        if (n <= 0) {
            return "";
        }
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }
}
