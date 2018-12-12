package com.jeffery.algs4.chapter1;

import edu.princeton.cs.algs4.StdDraw;

/**
 * 《算法》 第一章
 * <p>
 * 课后习题 1.1.32
 * <p>
 * 直方图。 假设标准输入流中含有一系列 double 值。 编写一段程序， 从命令行接受一个整数 N 和
 * 两个 double 值 l 和 r。 将 (l， r) 分为 N 段并使用 StdDraw 画出输入流中的值落入每段的数量的
 * 直方图。
 *
 * @author Jeffery_Ju@163.com
 * @date 2018-11-20 14:42:44
 */
public class Ex32 {
    public static void main(String[] args) {
        //double[] doubles = {0.1, 0.2, 0.2, 0.3, 0.4, 0.5, 0.6, 0.8, 0.8, 0.8, 0.9};
        //List<Integer> integers = new ArrayList<>();
        //for (double d : doubles) {
        //    integers.add(count(d, doubles));
        //}
        //int n = 10;
        //double l = 0.0;
        //double r = 1;
        //for (int i = 0; i < 10; i = i + 2) {
        //    StdDraw.filledRectangle(0 + i * (r - l) / n, 0, (r - l) / n, integers.get(i));
        //}
        StdDraw.setXscale(0.0, 10.0);
        StdDraw.setYscale(0.0, 10.0);
        StdDraw.filledRectangle(1, 0, 1, 10);
        StdDraw.filledRectangle(3, 0, 1, 3);
        StdDraw.filledRectangle(6, 0, 1, 2);
        StdDraw.filledRectangle(9, 0, 1, 1);
        StdDraw.filledRectangle(10, 0,1, 2);
    }


    /**
     * 查找数组a中等于key的元素个数
     *
     * @param key 键值
     * @param a   排序后的数组
     * @return 等于key的元素数量
     */
    public static int count(double key, double[] a) {
        int count = 0;
        for (double i : a) {
            if (i == key) {
                count++;
            }
        }
        return count;
    }
}
