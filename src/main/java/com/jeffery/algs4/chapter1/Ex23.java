package com.jeffery.algs4.chapter1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * 《算法》 第一章
 * <p>
 * 课后习题 1.1.23
 * <p>
 * 为BinarySearch 的测试用例添加一个参数：
 * + 打印出标准输入中不在白名单上的值；
 * -， 则打印出标准输入中在白名单上的值。
 *
 * @author Jeffery_Ju@163.com
 * @date 2018-11-15 13:57:51
 */
public class Ex23 {
    public static void main(String[] args) {
        StdOut.print("Please input sign (+ or -) : ");
        String sign = StdIn.readString();
        int[] whiteList = {2, 3, 4, 5, 6, 7, 1, 8, 9};
        int[] keys = {2, 4, 6, 8, 10};
        Arrays.sort(whiteList);
        for (int i = 0; i < keys.length; i++) {
            int key = keys[i];
            if ("+".equals(sign) && (rank(key, whiteList) == -1)) {
                StdOut.println(key);
            }
            if ("-".equals(sign) && (rank(key, whiteList) != -1)) {
                StdOut.println(key);
            }
        }

    }

    public static int rank(int key, int[] a) { // 数组必须是有序的
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) { // 被查找的键要么不存在， 要么必然存在于 a[lo..hi] 之中
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
