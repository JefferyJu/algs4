package com.jeffery.algs4.chapter1;

/**
 * 《算法》 第一章
 * <p>
 * 课后习题 1.1.13
 * <p>
 * 编写一段代码， 打印出一个 M 行 N 列的二维数组的转置（ 交换行和列）
 *
 * @author Jeffery_Ju@163.com
 * @date 2018-11-12 09:54:57
 */
public class Ex13 {
    public static void main(String[] args) {
        //编写一段代码， 打印出一个 M 行 N 列的二维数组的转置（ 交换行和列）
        boolean[][] a = {
                {true, true, true, true, true},
                {false, true, true, true, true},
                {false, false, true, true, true},
                {false, false, false, true, true},
                {false, false, false, false, true}
        };
        //行数
        int m = a.length;
        //列数
        int n = a[0].length;
        boolean[][] b = new boolean[n][m];
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                b[i][j] = a[j][i];
            }
        }
        Ex11.soutStar(a);
        Ex11.soutStar(b);
    }
}
