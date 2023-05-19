package sechstertermin;

import java.util.stream.*;
public class Uebung03_Loesung { 
   public static double average(int... a) {
      return IntStream.of(a)
         .average()
         .getAsDouble();
   }
   public static void main(String[] args) throws Exception{    	
      int[] a = {1,7,4,8,2,9,20,3};
      System.out.println(average(a)); 
   }       
}
