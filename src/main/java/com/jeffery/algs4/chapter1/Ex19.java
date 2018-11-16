package com.jeffery.algs4.chapter1;

/**
 * 《算法》 第一章
 * <p>
 * 课后习题 1.1.19
 * <p>
 * 计算机用这段程序在一个小时之内能够得到 F(N) 结果的最大 N 值是多少？ 开发 F(N) 的一
 * 个更好的实现， 用数组保存已经计算过的值。
 *
 * @author Jeffery_Ju@163.com
 * @date 2018-11-13 14:13:13
 */
public class Ex19 {

    public static void main(String[] args) {
        long[] fibonacci = F(3);
        for (long o : fibonacci) {
            System.out.println(o);
        }
    }

    /**
     * 菲波那切数列
     *
     * @param N
     * @return
     */
    public static long[] F(int N) {
        long[] fibonacci = new long[N + 1];
        if (N == 0) {
            return fibonacci;
        }
        fibonacci[1] = 1;
        if (N == 1) {
            return fibonacci;
        }
        for (int i = 2; i <= N; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci;
    }

}
