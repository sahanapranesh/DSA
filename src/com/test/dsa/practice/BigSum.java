package com.test.dsa.practice;

import java.util.Arrays;
import java.util.List;

public class BigSum {
    public static long aVeryBigSum(List<Long> ar) {
        Long result = Long.parseLong("0");
        for(int i=0; i< ar.size(); i++){
            result = Long.sum(result, ar.get(i));
        }
        int[] array =  new int[]{};
        return result;
    }

    public static void main(String[] args) {
        System.out.println(BigSum.aVeryBigSum(Arrays.asList(4543543545L, 76767676676L)));
    }

}
