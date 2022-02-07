package com.test.dsa.practice;

import java.util.*;

public class SubsetSums {
   Map<Integer, List> sumWithList = new HashMap<>();

   public static void
   findSubsets(List<List<Integer>> subset, ArrayList<Integer> nums, ArrayList<Integer> output, int index) {
      // Base Condition
      if (index == nums.size()) {
         if (!output.isEmpty()) {
            Integer subsetSum = output.stream().reduce(Integer::sum).get();
            if (subsetSum < 200) {
               subset.add(output);
            }
         }
         return;
      }
      findSubsets(subset, nums, new ArrayList<>(output), index + 1);
      output.add(nums.get(index));
      findSubsets(subset, nums, new ArrayList<>(output), index + 1);
}

   public static void main(String[] args) {

      List<List<Integer>> subset = new ArrayList<>();

      ArrayList<Integer> input = new ArrayList<>();
      input.add(50);
      input.add(75);
      input.add(110);
      input.add(175);
      input.add(155);

      findSubsets(subset, input, new ArrayList<>(), 0);
      Collections.sort(subset, (o1, o2) -> {
         int n = Math.min(o1.size(), o2.size());
         for (int i = 0; i < n; i++) {
            if (o1.get(i) == o2.get(i)) {
               continue;
            } else {
               return o1.get(i) - o2.get(i);
            }
         }
         return 1;
      });
      // Printing Subset
      for (List<Integer> integers : subset) {
         for (Integer integer : integers) {
            System.out.print(integer + " ");
         }
         System.out.println();
      }

   }
}
