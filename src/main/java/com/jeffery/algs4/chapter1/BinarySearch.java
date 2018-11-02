package com.jeffery.algs4.chapter1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * 《算法》：第一章 p10
 * <p>
 * 二分查找法
 *
 * @author Jeffery_Ju
 * @date 2018-10-24 22：40
 */
public class BinarySearch {

    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid + 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] whiteList = In.readInts(args[0]);
        Arrays.sort(whiteList);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whiteList) == -1) {
                StdOut.print(key);
            }
        }

    }
}
