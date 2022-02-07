package test;


import org.junit.Test;

class NumberOfButtonsTest {

    @Test
    void findNumberOfClicks() {
        NumberOfButtons numberOfButtons = new NumberOfButtons();
        int number = numberOfButtons.findNumberOfClicks(9,100, new int[]{34,89},new int[] {1, 10, 34, 56, 78, 89, 99, 200});
        System.out.println(number);
    }
}