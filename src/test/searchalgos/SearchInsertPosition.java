package test.searchalgos;

import java.beans.PropertyEditorSupport;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        return binarySearch(nums, left, right, target);
    }

    public static int binarySearch(int[] nums, int left, int right, int target) {
        int mid = left + (right - left) / 2;
        int result;
        if (nums[mid] == target || mid ==0) {
            return mid;
        }
        if (left == right) {
            if (target < nums[right]) {
                return right;
            } else {
                return right + 1;
            }
        }
        if (target < nums[mid]) {
            result = binarySearch(nums, left, mid - 1, target);
        } else {
            result = binarySearch(nums, mid + 1, right, target);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6}, 2));
    }
}
