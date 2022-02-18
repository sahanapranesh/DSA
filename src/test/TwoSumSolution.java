package test;

import java.util.Arrays;

public class TwoSumSolution {
    public static void main(String[] args) {
        int[] array = new int[]{3, 2, 3};
        System.out.println(Arrays.toString(twoSum(array, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        boolean found = false;
        for (int z = 0; z < nums.length - 1; z++) {
            for (int g = z + 1; g <= nums.length - 1; g++) {
                int currentSum = nums[g] + nums[z];
                if (currentSum == target) {
                    output[0] = z;
                    output[1] = g;
                    found = true;
                    break;
                }
            }
            if(found) {
                break;
            }
        }
        return output;
    }
}
