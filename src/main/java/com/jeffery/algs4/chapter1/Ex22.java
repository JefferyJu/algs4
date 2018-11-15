package com.jeffery.algs4.chapter1;

/**
 * 《算法》 第一章
 * <p>
 * 课后习题 1.1.22
 *
 * @author Jeffery_Ju@163.com
 * @date 2018-11-15 11:36:20
 */
public class Ex22 {
    public static void main(String[] args) {
        //使用 1.1.6.4 节中的 rank() 递归方法重新实现 BinarySearch 并跟踪该方法的调用。
        //每当该方法被调用时， 打印出它的参数 lo 和 hi 并按照递归的深度缩进。 提示： 为递归方法添加一个参数来保存递归的深度
        int[] a = {1, 2, 3, 4, 6, 7, 8, 9, 12};
        int key = 2;
        int pos = rank(key, a);
        if (pos == -1) {
            System.out.println("not found!");
        } else {
            System.out.println("position=" + pos);
        }
    }

    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 0);
    }


    public static int rank(int key, int[] a, int lo, int hi, int depth) {
        //如果key存在于a[]中，它的索引不会小于lo且不会大于hi
        for (int i = 0; i < depth; i++) {
            System.out.print(" ");
        }
        System.out.println("hi = " + hi + " lo = " + lo);
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return rank(key, a, lo, mid - 1, ++depth);
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, hi, ++depth);
        } else {
            return mid;
        }
    }
}
