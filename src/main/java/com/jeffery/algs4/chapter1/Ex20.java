package com.jeffery.algs4.chapter1;

/**
 * 《算法》 第一章
 * <p>
 * 课后习题 1.1.20
 * <p>
 * 编写一个递归的静态方法计算 ln(N!) 的值
 *
 * @author Jeffery_Ju@163.com
 * @date 2018-11-13 16:10:22
 */
public class Ex20 {
    public static void main(String[] args) {
        System.out.println(ln(1));
    }

    /**
     * 计算 ln(N!)
     *
     * @param i
     * @return
     */
    private static double ln(int i) {
        if (i == 0) {
            return 0.0;
        } else {
            return Math.log(i) + ln(i - 1);
        }
    }
}
