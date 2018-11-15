package com.jeffery.algs4.chapter1;

/**
 * 《算法》 第一章
 * <p>
 * 课后习题 1.1.11
 *
 * @author Jeffery_Ju@163.com
 * @date 2018-11-12 09:34:02
 */
public class Ex11 {
    public static void main(String[] args) {
        //编写一段代码， 打印出一个二维布尔数组的内容。 其中， 使用 * 表示真， 空格表示假。 打印出行号和列号
        boolean[][] a = {{true, true, true, true, true}, {false, true, true, true, true},
                {false, false, true, true, true}, {false, false, false, true, true}, {false, false, false, false, true}};
        soutStar(a);
    }

    public static void soutStar(boolean[][] a) {
        System.out.print("+ ");
        int max = a[0].length;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length > max) {
                max = a[i].length;
            }
        }
        for (int i = 0; i < max; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(i);
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] ? " *" : "  ");
            }
            System.out.println();
        }
    }
}
