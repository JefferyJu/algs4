package com.jeffery.algs4.chapter1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

import java.awt.*;

/**
 * 《算法》 第一章
 * <p>
 * 课后习题 1.1.31
 * <p>
 * 随机连接。 编写一段程序， 从命令行接受一个整数 N 和 double 值 p（ 0 到 1 之间） 作为参数，
 * 在一个圆上画出大小为 0.05 且间距相等的 N 个点， 然后将每对点按照概率 p 用绿线连接。
 *
 * @author Jeffery_Ju@163.com
 * @date 2018-11-20 11:28:40
 */
public class Ex31 {

    static class Point {
        double x;
        double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        System.out.println("请输入整数 n ：");
        int n = StdIn.readInt();
        System.out.println("请输入double 值 p（ 0 到 1 之间）：");
        double p = StdIn.readDouble();
        if (p < 0 || p > 1) {
            System.out.println("ERROE! p的取值范围在0到1之间");
            return;
        }
        Point[] points = new Point[n];
        double angle = 360.0 / n;
        // 设置笔的颜色
        StdDraw.setPenColor(Color.BLUE);
        StdDraw.circle(0.5, 0.5, 0.5);
        StdDraw.setPenColor(Color.RED);
        // 设置笔的宽度
        StdDraw.setPenRadius(0.05);
        for (int i = 0; i < n; i++) {
            points[i] = new Point(0.5 + 0.5 * Math.cos(angle * i * Math.PI / 180), 0.5 + 0.5 * Math.sin(angle * i * Math.PI / 180));
            StdDraw.point(points[i].x, points[i].y);
        }
        StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(Color.GREEN);
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (StdRandom.bernoulli(p)) {
                    StdDraw.line(points[i].x, points[i].y, points[j].x, points[j].y);
                }
            }
        }
    }

}
