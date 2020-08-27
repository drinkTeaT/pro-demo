package com.tacbin.pro.fragment;

/**
 * @author EDZ
 * @description
 * @date 2020/8/14 16:40
 */
public class SubString {
    public static void main(String[] args) {
        String nums = "1234567890";
        // 从a开始包括a取(b-a)个
        System.out.println(nums.substring(0, 1));
        System.out.println(nums.substring(1, 2));
        System.out.println(nums.substring(2, 4));
        System.out.println(nums.substring(5, 6));
        String s = "";
        System.out.println(s.substring(0,0));
    }
}
