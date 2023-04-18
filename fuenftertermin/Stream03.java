package fuenftertermin;

import java.util.stream.*;
public class Stream03 {
   static long fak(long n) {
      return Stream.iterate(1L,i -> i+1)
         .limit(n)
         .reduce(1L,(x,y) -> x*y);
   }
   public static void main(String[] args) {
      long zeit; 
      long ergebnis;
      int j; 
      for (int i = 0; i < 5; i++) { 
         zeit = System.nanoTime(); 
         j = 10 + i;
         ergebnis = fak(j);
         System.out.printf("\nLaufzeit [ns]: %10d (%d! = %d)", 
            System.nanoTime()-zeit, j, ergebnis); 
      }    
   }
}