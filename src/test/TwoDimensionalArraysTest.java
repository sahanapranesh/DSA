package test;

import java.util.ArrayList;
import java.util.List;

public class TwoDimensionalArraysTest {

    public static int hourglassSum(List<List<Integer>> arrayList) {
        List<List<Integer>> subList = new ArrayList<>();
        List<Integer> listOfSums;
        for (int i = 0; i < 6; i++) {
            List<Integer> row = arrayList.get(i);
            subList.add(row.subList(0, 3));
        }
        return 0;
    }

    public static int findHourGlassSum(List<List<Integer>> threeDArray) {
        int hourGlassSum = 0;
        for (int i = 0; i < 3; i++) {
            if (i == 0 || i == 2) {
                hourGlassSum = hourGlassSum + threeDArray.get(i).stream().reduce(Integer::sum).get();
            }
            if (i == 1) {
                hourGlassSum = hourGlassSum + threeDArray.get(i).get(1);
            }
        }
        return hourGlassSum;
    }
}
