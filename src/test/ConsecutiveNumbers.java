package test;

public class ConsecutiveNumbers {
    public static void main(String[] args) {
        System.out.println(test("6565009"));
        System.out.println(test("1234"));
    }

    public static String test(String number) {
        char[] array = number.toCharArray();
        for (int i = 0; i < array.length -1 ; i++) {
            int chars = array[i];
            if ((int)array[++i] != ++chars) {
                return "Non-consecutive string";
            } else {
                i--;
            }
        }
        return "Consecutive string";
    }
}
