package com.jeffery.algs4.chapter1;

/**
 * 《算法》 第一章
 * <p>
 * 课后习题 1.1.24
 * <p>
 * 给出使用欧几里德算法计算 105 和 24 的最大公约数的过程中得到的一系列 a 和 b 的值。 扩展该
 * 算法中的代码得到一个程序 Euclid， 从命令行接受两个参数， 计算它们的最大公约数并打印出每
 * 次调用递归方法时的两个参数。 使用你的程序计算 1 111 111 和 1 234 567 的最大公约数
 *
 * @author Jeffery_Ju@163.com
 * @date 2018-11-16 11:08:08
 */
public class Ex24 {

    public static void main(String[] args) {
        System.out.println(euclid(60, 24));
        System.out.println(euclid(1997, 615));
        System.out.println(euclid(1111111, 1234567));
    }

    /**
     * 计算它们的最大公约数并打印出每次调用递归方法时的两个参数
     * <p>
     * 两个整数的最大公约数等于其中较小的那个数和两数相除余数的最大公约数
     * <p>
     * ⒈ 若 r 是 a ÷ b 的余数，且r不为0， 则 gcd(a,b) = gcd(b,r)
     * ⒉ a 和其倍数之最大公因子为 a。
     *
     * @param a
     * @param b
     */
    private static int euclid(int a, int b) {
        System.out.println("a = " + a + ", b = " + b);
        if (a == 0 || b == 0) {
            return 1;
        }
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a % b == 0) {
            return b;
        } else {
            return euclid(b, a % b);
        }
    }
}
