package com.jeffery.algs4.chapter1;

/**
 * 《算法》 第一章
 * <p>
 * 课后习题 1.1.12
 *
 * @author Jeffery_Ju@163.com
 * @date 2018-11-12 09:50:56
 */
public class Ex12 {
    public static void main(String[] args) {
        //以下代码段会打印出什么结果？
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i; //反序
        }
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];//再正序
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        //答: 0-9
    }
}
