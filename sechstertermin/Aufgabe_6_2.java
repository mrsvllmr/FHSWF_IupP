package sechstertermin;

import java.util.*;
public class Aufgabe_6_2 {
   public final static long LIMIT = 1_000_000_000L;
   public final static int N = 6;
   public static void main(String[] args){
      System.out.println("Erzeuge " + LIMIT + 
         " Zufallszahlen von 0 bis "+(N-1));
      double[] count = new double[N];
      long k = 0;
      while(k++ < LIMIT) {
         count[(int) (N*Math.random())]++;
      }
      double mean = 0.0;
      for (int i=0; i < N; i++) {
         System.out.printf("\n%d wurde %10.0f-mal gewaehlt",i,count[i]); 
         mean += count[i];
      }
      mean /= N; 
      double temp = 0.0;
      for (int i=0; i < N; i++) {
         temp += Math.pow((count[i]-mean),2);
      }      
      double stddev = Math.sqrt(temp/(N-1));
      System.out.printf("\n\nMittelwert: %10.0f",mean);
      System.out.printf("\nStandardabweichung: %10.4f",stddev);      
   }
}