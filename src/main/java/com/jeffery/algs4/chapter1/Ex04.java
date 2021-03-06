package com.jeffery.algs4.chapter1;

/**
 * 《算法》 第一章 p33
 * <p>
 * 课后习题 1.1.4
 * <p>
 * 下列语句各有什么问题（ 如果有的话） ？
 * a. if (a > b) then c = 0;
 * b. if a > b { c = 0; }
 * c. if (a > b) c = 0;
 * d. if (a > b) c = 0 else b = 0;
 *
 * @author Jeffery_Ju@163.com
 * @date 2018-11-1 17:12:08
 */
public class Ex04 {
    public static void main(String[] args) {

        System.out.println("if (a > b) then c = 0;" + "-->答案：没有then");
        System.out.println("if a > b {c = 0;}" + "-->答案：(a > b)");
        System.out.println("if (a > b) c = 0;" + "-->答案：正确");
        System.out.println("if (a > b) c = 0 else b = 0;" + "-->答案：c = 0;");
    }
}
