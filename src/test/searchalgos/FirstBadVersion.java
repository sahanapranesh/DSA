package test.searchalgos;

import java.util.Arrays;

public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(3));
    }

    public static int firstBadVersion(int n) {
        return binarySearch(n, 1, n);
    }

    private static int binarySearch(int n, int left, int right) {
        if(isBadVersion(1)){
            return 1;
        }
        if (left <= right) {
            int mid = left + (right - left) / 2;
            if (!isBadVersion(mid) && isBadVersion(mid + 1)) {
                return mid + 1;
            }
            if (isBadVersion(mid) && !isBadVersion(mid - 1)) {
                return mid;
            }
            if (isBadVersion(mid)) {
                right = mid + 1;
                return binarySearch(n, left, right);
            } else {
                left = mid + 1;
                return binarySearch(n, left, right);
            }
        }
        return -1;
    }

    private static boolean isBadVersion(int version) {
        if (version >= 1240808008 && version <= 1792997410) {
            return true;
        }
        return Arrays.asList(1, 2).contains(version);
    }
}
