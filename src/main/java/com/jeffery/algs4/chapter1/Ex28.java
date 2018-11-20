package com.jeffery.algs4.chapter1;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 《算法》 第一章
 * <p>
 * 课后习题 1.1.28
 * <p>
 * 删除重复元素。 修改 BinarySearch 类中的测试用例来删去排序之后白名单中的所有重复元素。
 *
 * @author Jeffery_Ju@163.com
 * @date 2018-11-19 14:30:22
 */
public class Ex28 {
    public static void main(String[] args) {
        // 假设白名单中有这些数据
        int[] whiteList = {2, 3, 4, 5, 6, 2, 2, 3, 4, 7, 8, 9, 7, 1, 8, 9};
        // 先排序
        Arrays.sort(whiteList);
        // 去重
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < whiteList.length; i++) {
            int ref = rank(whiteList[i], whiteList);
            set.add(ref);
        }
        for (Integer i : set) {
            System.out.println(whiteList[i]);
        }
    }

    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
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
