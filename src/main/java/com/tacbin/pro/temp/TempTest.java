package com.tacbin.pro.temp;

import java.math.BigDecimal;

/**
 * @author EDZ
 * @description
 * @date 2020/8/11 10:06
 */
public class TempTest {
    public static void main(String[] args) {
        BigDecimal fail = new BigDecimal(0.9);
        for (int i = 0; i < 9; i++) {
            fail = fail.multiply(new BigDecimal(0.9));
        }
        System.out.println(1 - fail.doubleValue());
    }
}
