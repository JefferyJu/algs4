package com.jeffery.algs4.chapter1;

/**
 * 《算法》 第一章 p33
 * <p>
 * 课后习题 1.1.5
 *
 * @author Jeffery_Ju@163.com
 * @date 2018-11-10 15:29:59
 */
public class Ex09 {
    public static void main(String[] args) {
        //100000000
        System.out.println(Integer.toBinaryString(256));
        //100000000
        binaryString(256);
    }

    /**
     * 将一个正整数 param 用二进制表示并转为一个String类型的值 s
     *
     * @param param 正整数
     */
    private static void binaryString(int param) {
        String s = "";
        for (int i = param; i > 0; i /= 2) {
            s = (i % 2) + s;
            System.out.println(s);
        }
        System.out.println(s);
    }
}
