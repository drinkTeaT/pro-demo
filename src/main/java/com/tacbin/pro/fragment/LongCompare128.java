package com.tacbin.pro.fragment;

/**
 * @author EDZ
 * @description Long类型直接用 == -128~127可以直接比较，< >会自动拆箱
 * @date 2020/8/13 10:51
 */
public class LongCompare128 {
    public static void main(String[] args) {
        equals();
        bigger();
    }

    private static void equals() {
        System.out.println("-- equals begin --");
        Long a = 10L;
        Long b = 10L;
        // true
        System.out.println(a == b);

        Long c = 128L;
        Long d = 128L;
        // false
        System.out.println(c == d);

        Long e = Long.valueOf("129");
        Long f = Long.valueOf("129");
        // false
        System.out.println(e == f);
        System.out.println("-- equals end --");
    }

    private static void bigger() {
        System.out.println("-- bigger begin --");
        Long a = 11L;
        Long b = 10L;
        // true
        System.out.println(a > b);

        Long c = 129L;
        Long d = 128L;
        // true
        System.out.println(c > d);

        Long e = Long.valueOf("130");
        Long f = Long.valueOf("129");
        // true
        System.out.println(e > f);

    }
}
