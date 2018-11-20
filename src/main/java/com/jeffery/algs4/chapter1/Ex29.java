package com.jeffery.algs4.chapter1;

import java.util.Arrays;

/**
 * 《算法》 第一章
 * <p>
 * 课后习题 1.1.29
 * <p>
 * 等值键。 为 BinarySearch 类添加一个静态方法 rank()， 它接受一个键和一个整型有序数组（ 可
 * 能存在重复键） 作为参数并返回数组中小于该键的元素数量， 以及一个类似的方法 count() 来
 * 返回数组中等于该键的元素的数量。 注意： 如果 i 和 j 分别是 rank(key,a) 和 count(key,a)
 * 的返回值， 那么 a[i..i+j-1] 就是数组中所有和 key 相等的元素
 *
 * @author Jeffery_Ju@163.com
 * @date 2018-11-20 09:26:37
 */
public class Ex29 {
    public static void main(String[] args) {
        int key = 9;
        int[] a = {0, 1, 2, 3, 2, 4, 6, 7, 8, 9, 5, 5};
        Arrays.sort(a);
        int i = rank(key, a);
        int j = count(key, a);
        int end = i + j - 1;
        if (i == end) {
            System.out.println(a[i] == key ? "true" : "false");
        } else {
            int[] ints = Arrays.copyOfRange(a, i, end);
            boolean flag = true;
            for (int in : ints) {
                if (key != in) {
                    flag = false;
                }
            }
            System.out.println(flag);
        }
    }

    /**
     * 查找数组a中小于key的元素数量
     *
     * @param key 键值
     * @param a   排序后的数组
     * @return 小于key的元素数量
     */
    private static int rank(int key, int[] a) {
        int count = 0;
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                if (mid - 1 < 0) {
                    break;
                }
                if (a[mid - 1] < key) {
                    return mid;
                }
            }
        }
        return 0;
    }

    /**
     * 查找数组a中等于key的元素个数
     *
     * @param key 键值
     * @param a   排序后的数组
     * @return 等于key的元素数量
     */
    private static int count(int key, int[] a) {
        int count = 0;
        for (int i : a) {
            if (i == key) {
                count++;
            }
        }
        return count;
    }
}
