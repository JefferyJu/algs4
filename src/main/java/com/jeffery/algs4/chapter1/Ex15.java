package com.jeffery.algs4.chapter1;

/**
 * 《算法》 第一章
 * <p>
 * 课后习题 1.1.15
 *
 * @author Jeffery_Ju@163.com
 * @date 2018-11-12 15:02:20
 */
public class Ex15 {

    public static void main(String[] args) {
        //编写一个静态方法 histogram()， 接受一个整型数组 a[] 和一个整数 M 为参数并返回一个大小
        //为M的数组， 其中第i个元素的值为整数i在参数数组中出现的次数。如果a[]中的值均在0到M-1
        //之间， 返回数组中所有元素之和应该和 a.length 相等。
        int[] a = {1, 1, 2, 3, 1, 7, 5, 3, 7, 2, 2};
        int[] res = histogram(a, 8);
        for (int i = 0; i < res.length; i++) {
            System.out.printf("%3d", res[i]);
        }

    }

    /**
     * 接受一个整型数组 a[] 和一个整数 M 为参数并返回一个大小为M的数组，
     * 其中 返回数组 中的第i个元素的值为整数i在 参数数组 中出现的次数
     * 如果a[]中的值均在0到M-1之间， 返回数组中所有元素之和应该和 a.length 相等。
     *
     * @param a 整型数组 a[]
     * @param m 整数 m
     * @return int[m]
     */
    private static int[] histogram(int[] a, int m) {
        int[] res = new int[m];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0 && a[i] < (m - 1)) {
                //返回数组 中的第i个元素的值为整数i在 参数数组 中出现的次数
                res[a[i]]++;
            }
        }
        return res;
    }
}
