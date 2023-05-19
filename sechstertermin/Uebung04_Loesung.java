package sechstertermin;

import java.util.stream.*;
public class Uebung04_Loesung { 
   public static void main(String[] args) {
      System.out.println(count(4,"Rudolf","Emma","Otto",
         "Agnes","Kurt","Emma","Otto"));
   }
   private static long count(int length, String... namen) {
      return Stream.of(namen)
         .distinct()
         .filter(s -> s.length() == length)
         .count();
   }
}