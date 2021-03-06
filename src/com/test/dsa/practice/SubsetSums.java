package com.test.dsa.practice;


import java.util.*;
import java.util.stream.Collectors;

public class SubsetSums {
   private static List<Shipment> possibleShipments = new ArrayList<>();
   private static Double maxSoFar = Double.MIN_VALUE;

   static boolean findSubsets(List<List<Double>> shipments, List<Double> weights, List<Double> output, int index) {
      if (index == weights.size()) {
         return findPossibleShipments(shipments, output);
      }
      boolean foundShipments = findSubsets(shipments, weights, new ArrayList<>(output), index + 1);
      if(foundShipments){
         weights.removeAll(output);
         //index = index - output.size();
         output.clear();
      }
      output.add(weights.get(index));
      foundShipments = findSubsets(shipments, weights, new ArrayList<>(output), index + 1);
      if(foundShipments){
         weights.removeAll(output);
         output.clear();
      }
      return foundShipments;
   }

   private static boolean findPossibleShipments(List<List<Double>> shipments, List<Double> output) {
      if (!output.isEmpty()) {
         Double subsetSum = output.stream().reduce(Double::sum).get();
         if (subsetSum <= 200) {
            if (maxSoFar.compareTo(subsetSum) < 0) {
               maxSoFar = subsetSum;
               prepareShipment(output, subsetSum);
               shipments.add(output);
               return true;
            }
         }
      }
      return false;
   }

   private static void prepareShipment(List<Double> output, Double subsetSum) {
      Shipment shipment = new Shipment();
      shipment.setTotalWeight(subsetSum);
      shipment.setPackages(output);
      possibleShipments.add(shipment);
   }

   public static void main(String[] args) {

      List<List<Double>> subset = new ArrayList<>();

      ArrayList<Double> input = new ArrayList<>();
      input.add(175.0);
      input.add(155.0);
      input.add(110.0);
      input.add(75.0);
      input.add(50.0);
      input.add(100.0);
      input.add(200.0);

      findSubsets(subset, input.stream().sorted().collect(Collectors.toList()), new ArrayList<>(), 0);
      possibleShipments.sort(Comparator.comparingDouble(Shipment::getTotalWeight));
      possibleShipments.forEach(System.out::println);
   }
}
