package com.jeffery.algs4.chapter1;

/**
 * 《算法》 第一章
 * <p>
 * 课后习题 1.1.5
 * <p>
 * 下面这段代码有什么问题？
 *
 * @author Jeffery_Ju@163.com
 * @date 2018-11-12 09:34:02
 */
public class Ex10 {

    public static void main(String[] args) {
        //Variable 'a' might not have been initialized
        //变量'a'可能尚未初始化
        //int[] a;
        //正确做法如下:
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i * i;
            System.out.println(a[i]);
        }
    }


}
