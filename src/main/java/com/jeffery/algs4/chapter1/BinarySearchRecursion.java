package com.jeffery.algs4.chapter1;

/**
 * 《算法》 第一章 p15
 * <p>
 * 二分查找法之递归写法
 *
 * @author Jeffery_Ju
 * @date 2018-11-1 14:10:09
 */
public class BinarySearchRecursion {

    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

    public static int rank(int key, int[] a, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return rank(key, a, lo, mid - 1);
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, hi);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(rank(2, a));
    }

}
