package com.tacbin.pro.fragment;

/**
 * @author EDZ
 * @description Long类型直接用 ==
 * @date 2020/8/13 10:51
 */
public class LongCompare128 {
    public static void main(String[] args) {
        equals();
        bigger();
    }

    private static void equals() {
        System.out.println("-- equals begin --");
        Long a = 10l;
        Long b = 10l;
        System.out.println(a == b); // true

        Long c = 128l;
        Long d = 128l;
        System.out.println(c == d); // false

        Long e = Long.valueOf("129");
        Long f = Long.valueOf("129");
        System.out.println(e == f); // false
        System.out.println("-- equals end --");
    }

    private static void bigger() {
        System.out.println("-- bigger begin --");
        Long a = 11l;
        Long b = 10l;
        System.out.println(a > b); // true

        Long c = 129l;
        Long d = 128l;
        System.out.println(c > d); // true

        Long e = Long.valueOf("130");
        Long f = Long.valueOf("129");
        System.out.println(e > f); // true

    }
}
