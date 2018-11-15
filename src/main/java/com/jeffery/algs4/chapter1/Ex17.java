package com.jeffery.algs4.chapter1;

/**
 * 《算法》 第一章
 * <p>
 * 课后习题 1.1.17
 *
 * @author Jeffery_Ju@163.com
 * @date 2018-11-12 17:06:25
 */
public class Ex17 {

    public static void main(String[] args) {
        //
    }

    /**
     * 这段代码中的基础情况永远不会被访问。
     * 调用 exR2(3) 会产生调用 exR2(0)、 exR2(-3) 和 exR2(-6)， 循环往复直到发生 StackOverflowError。
     * @param n
     * @return
     */
    public static String exR2(int n)
    {
        String s = exR2(n-3) + n + exR2(n-2) + n;
        if (n <= 0) {
            return "";
        }
        return s;
    }
}
