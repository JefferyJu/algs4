package com.jeffery.algs4.chapter1;

/**
 * 《算法》 第一章
 * <p>
 * 课后习题 1.1.30
 * <p>
 * 数组练习。 编写一段程序， 创建一个 N × N 的布尔数组 a[][]。 其中当 i 和 j 互质时（ 没有相同
 * 因子） ， a[i][j] 为 true， 否则为 false。
 *
 * @author Jeffery_Ju@163.com
 * @date 2018-11-20 10:36:51
 */
public class Ex30 {
    public static void main(String[] args) {
        int n = 10;
        boolean[][] bs = new boolean[n][n];
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (euclid(i, j) == 1) {
                    bs[i][j] = true;
                } else {
                    bs[i][j] = false;
                }
                //System.out.println(bs[i][j]);
            }
        }
        soutStar(bs);
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
        //System.out.print("a = " + a + ", b = " + b);
        if (a == 0 || b == 0) {
            return 1;
        }
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        int r = a % b;
        if (r != 0) {
            return euclid(b, r);
        }
        return b;
    }

    /**
     *  打印数组
     * @param a 数组
     */
    public static void soutStar(boolean[][] a) {
        System.out.print("+ ");
        int max = a[0].length;
        for (int i = 1; i < a.length; i++) {
            if (a[i].length > max) {
                max = a[i].length;
            }
        }
        for (int i = 1; i < max; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i < a.length; i++) {
            System.out.print(i);
            for (int j = 1; j < a[i].length; j++) {
                System.out.print(a[i][j] ? " *" : "  ");
            }
            System.out.println();
        }
    }
}
