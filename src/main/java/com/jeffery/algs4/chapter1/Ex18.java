package com.jeffery.algs4.chapter1;

/**
 * 《算法》 第一章
 * <p>
 * 课后习题 1.1.18
 * <p>
 * mystery(2, 25) 和 mystery(3, 11) 的返回值是多少？
 * 给定正整数 a 和 b， mystery(a,b)计算的结果是什么？
 * 将代码中的 + 替换为 * 并将 return 0 改为 return 1， 然后回答相同的问题。
 *
 * @author Jeffery_Ju@163.com
 * @date 2018-11-12 17:20:40
 */
public class Ex18 {
    public static void main(String[] args) {
        System.out.println(mystery(2, 2));
        //System.out.println(mystery(3, 11));
        //System.out.println(mystery(10, 20));

    }

    /**
     * @param a
     * @param b
     * @return
     */
    public static int mystery(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b % 2 == 0) {
            System.out.println(mystery(a + a, b / 2));
            return mystery(a + a, b / 2);
        }
        System.out.println(mystery(a + a, b / 2));
        return mystery(a + a, b / 2) + a;
    }
}
