package com.jeffery.algs4.temp;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 《算法》 第一章
 * <p>
 * 课后习题 1.1.
 *
 * @author Jeffery_Ju@163.com
 * @date 2018-12-12 11:22:05
 */
public class CalBigDecimal {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(3);
        BigDecimal b = new BigDecimal(9);
        System.out.print(a.divide(b,2, RoundingMode.HALF_UP).multiply(new BigDecimal(100)));
    }
}
