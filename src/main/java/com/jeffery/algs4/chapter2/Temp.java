package com.jeffery.algs4.chapter2;

/**
 * 《算法》：第一章
 *
 * @author Jeffery_Ju@163.com
 * @date 2018-11-1 10:44:15
 */
public class Temp {

    public static void main(String[] args) {
        //revertArray();
        System.out.println(sqrt(1));
    }

    /**
     * 牛顿迭代法求平方根
     * @param c
     * @return
     */
    private static double sqrt(double c) {
        if (c < 0) {
            return Double.NaN;
        }
        double err = 1e-15;
        double t = c;
        while (Math.abs(t - c / t) > err * t) {
            t = (c / t + t) / 2.0;
        }
        return t;
    }

    /**
     * 颠覆数组
     */
    private static void revertArray() {
        int[] a = {1, 2, 3, 4, 5};
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temp;
        }

        for (int i : a) {
            System.out.println(i);
        }
    }
}
