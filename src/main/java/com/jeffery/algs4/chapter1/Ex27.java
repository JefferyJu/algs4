package com.jeffery.algs4.chapter1;

/**
 * 《算法》 第一章
 * <p>
 * 课后习题 1.1.27
 * <p>
 * 二项分布。 估计用以下代码计算 binomial(100, 50) 将会产生的递归调用次数：
 * 将已经计算过的值保存在数组中并给出一个更好的实现。
 *
 * @author Jeffery_Ju@163.com
 * @date 2018-11-16 14:33:36
 */
public class Ex27 {
    private static long COUNT = 0;
    private static long COUNT2 = 0;
    private static double[][] MATRIX;

    public static void main(String[] args) {
        System.out.println("result: " + binomial(20, 10, 0.25) + ", count: " + COUNT);
        System.out.println("result: " + betterBinomial(20, 10, 0.25) + ", count: " + COUNT2);
    }

    /**
     * 二项分布
     *
     * @param n
     * @param k
     * @param p
     * @return
     */
    public static double binomial(int n, int k, double p) {
        COUNT++;
        if (n == 0 && k == 0) {
            return 1.0;
        }
        if (n < 0 || k < 0) {
            return 0.0;
        }
        return (1.0 - p) * binomial(n - 1, k, p) + p * binomial(n - 1, k - 1, p);
    }

    private static double bin(int N, int k, double p) {
        COUNT2++;
        if (N == 0 && k == 0) {
            return 1.0;
        }
        if (N < 0 || k < 0) {
            return 0.0;
        }
        if (MATRIX[N][k] == -1) {
            MATRIX[N][k] = (1.0 - p) * bin(N - 1, k, p) + p * bin(N - 1, k - 1, p);
        }
        return MATRIX[N][k];
    }

    public static double betterBinomial(int N, int k, double p) {
        MATRIX = new double[N + 1][k + 1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= k; j++) {
                MATRIX[i][j] = -1;
            }
        }
        return bin(N, k, p);
    }


}
