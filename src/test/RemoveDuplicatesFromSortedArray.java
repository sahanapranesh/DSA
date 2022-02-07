package test;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {

    }

    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> numCounter = new HashMap<>();
        for(int z=0; z< nums.length; z++){
            int currentElement = nums[z];
            if(numCounter.containsKey(currentElement)){
                int counter = numCounter.get(currentElement);
                counter++;
                numCounter.put(currentElement, counter);
            }
            numCounter.put(currentElement,1);
        }
        return 1;
    }
}
