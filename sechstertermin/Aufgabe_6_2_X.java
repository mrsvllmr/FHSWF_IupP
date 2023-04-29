package sechstertermin;

import java.util.*;
import java.util.stream.*;
public class Aufgabe_6_2_X {
   public final static long LIMIT = 1_000_000_000L;
   public final static int N = 6;
   public static void main(String[] args){
      System.out.println("Erzeuge " + LIMIT + 
         " Zufallszahlen von 0 bis "+(N-1));
      double[] count = new double[N];
      IntStream
         .generate(() -> (int) (N*Math.random()))
         .limit(LIMIT)
         .forEach(i -> count[i]++);
      for (int i=0; i < N; i++)
         System.out.printf("\n%d wurde %10.0f-mal gewaehlt",i,count[i]); 
      double mean = Arrays.stream(count).average().getAsDouble(); 
      double temp =
         Arrays.stream(count)
         .map(v -> Math.pow((v-mean),2))
         .sum();
      double stddev = Math.sqrt(temp/(N-1));
      System.out.printf("\n\nMittelwert: %10.0f",mean);
      System.out.printf("\nStandardabweichung: %10.4f",stddev);      
   }
}