package com.jeffery.algs4.chapter1;

/**
 * 《算法》 第一章
 * <p>
 * 课后习题 1.1.14
 *
 * @author Jeffery_Ju
 * @date 2018-11-12 09:56:17
 */
public class Ex14 {

    public static void main(String[] args) {
        //编写一个静态方法 lg()， 接受一个整型参数 N， 返回不大于 logN 的最大整数。 不要使用 Math 库。
        System.out.println(lg(21));
    }

    /**
     * 接受一个整型参数 N， 返回不大于 logN 的最大整数
     *
     * @return
     */
    private static int lg(int n) {
        int count = 0;
        do {
            //n >>= 1,相当于n等于n除以2(位移运算符,右移一位)
            n >>= 1;
            count++;
        } while (n != 0);
        return count - 1;
    }
}
