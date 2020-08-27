package com.tacbin.pro.temp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author EDZ
 * @description
 * @date 2020/8/26 14:25
 */
class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().binaryGap(6));
    }
    public int binaryGap(int N) {
        int i = 0;
        int k = N;
        int j = N % 2;
        int max = 0;
        int r = -1;
        while(k != 0){
            if(j == 1){
                if (r != -1) {
                    max = Math.max(max, i - r);
                }
                r = i;
            }
            k = k / 2;
            j = k % 2;
            i++;
        }
        return max;
    }
}