package com.test.dsa.practice;

import java.util.List;

public class Shipment {
   private Double totalWeight;
   private List<Double> packages;

   public Double getTotalWeight() {
      return totalWeight;
   }

   public void setTotalWeight(Double totalWeight) {
      this.totalWeight = totalWeight;
   }

   public List<Double> getPackages() {
      return packages;
   }

   public void setPackages(List<Double> packages) {
      this.packages = packages;
   }

   @Override
   public String toString() {
      return "Shipment{" +
         "totalWeight=" + totalWeight +
         ", packages=" + packages +
         '}';
   }
}
