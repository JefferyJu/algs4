package com.jeffery.algs4.chapter1;

import java.util.Scanner;

/**
 * 《算法》 第一章
 * <p>
 * 课后习题 1.1.21
 * <p>
 * 编写一段程序， 从标准输入按行读取数据， 其中每行都包含一个名字和两个整数。 然后用
 * printf() 打印一张表格， 每行的若干列数据包括名字、 两个整数和第一个整数除以第二个整数
 * 的结果， 精确到小数点后三位。 可以用这种程序将棒球球手的击球命中率或者学生的考试分数
 * 制成表格
 *
 * @author Jeffery_Ju@163.com
 * @date 2018-11-15 09:28:30
 */
public class Ex21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("您要输入几个同学的信息？");
        int i = input.nextInt();
        input.nextLine();//过滤\n
        System.out.println("请输入所有同学的信息：");
        String[] str = new String[i];
        for (int j = 0; j < i; j++) {
            str[j] = input.nextLine();
        }
        System.out.println("-------------表格-------------");
        for (int j = 0; j < i; j++) {
            String[] s = str[j].split("\\s+");//  \\s表示 空格,回车,换行等空白符
            // split()方法将一个字符串按照空格分割，结果作为字符串数组返回。
            System.out.printf("姓名：%-20s   成绩1：%-10s   成绩二：%-10s   相除：%-13.3f \n", s[0], s[1], s[2],
                    Double.parseDouble(s[1]) / Double.parseDouble(s[2]));
        }
    }
}
