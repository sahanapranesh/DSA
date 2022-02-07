package test.searchalgos;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{5};
        System.out.println(binarySearch(array, 5, 0, 0));
    }

    public static int binarySearch(int[] array, int x, int l, int r) {
        if (l >= 0 && l < array.length && r >= 0 && r < array.length && l<=r) {
            int mid = l + (r - l) / 2;
            if (x == array[mid]) {
                return mid;
            }
            if (x < array[mid]) {
                return binarySearch(array, x, l, mid - 1);
            } else if (x > array[mid]) {
                return binarySearch(array, x, mid + 1, r);
            }
        }
        return -1;
    }
}
