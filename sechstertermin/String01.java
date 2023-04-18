package sechstertermin;

import java.util.stream.*;
public class String01 {
   public static void main(String[] args) {
      Stream
         .of("a1 c1 b2 b1 a2 d1 c2 d2".split(" "))
         .filter(s -> s.startsWith("c") || s.endsWith("2"))
         .map(String::toUpperCase)
         .sorted()
         .forEach(System.out::println); 
   }
}