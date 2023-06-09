package Testat04;

import java.util.concurrent.*;
public class Testat04_Loesung {

   private final static int MAX = 100_000;

   private volatile static int maxTeilerCount = 0;

   private volatile static int intWithMaxTeilerCount;
   

   public synchronized static void report(int maxCountFromThread, int intWithMaxFromThread) {
      if (maxCountFromThread > maxTeilerCount) {
         maxTeilerCount = maxCountFromThread;
         intWithMaxTeilerCount = intWithMaxFromThread;
      }
   }
   
   private static Runnable createTeilerThread(int min, int max) {
      return 
         () -> {
            int maxTeiler = 0;
            int whichInt = 0;
            for (int i = min; i < max; i++) {
               int divisors = countTeiler(i);
               if (divisors > maxTeiler) {
                  maxTeiler = divisors;
                  whichInt = i;
               }
            }
            report(maxTeiler,whichInt);
         };
   }

   
   private static void countTeilerWithThreads(int numberOfThreads) {
      System.out.println("\nEchte Teiler zaehlen in " + numberOfThreads + " Thread(s)...");
      
      ExecutorService pool = Executors.newFixedThreadPool(numberOfThreads); 
      
      long startTime = System.currentTimeMillis();
      int integersPerThread = MAX/numberOfThreads; 
      int start = 1;  
      int end = start + integersPerThread - 1;   
      
      for (int i = 0; i < numberOfThreads; i++) {
         if (i == numberOfThreads - 1) {
            end = MAX; 
         }
         pool.execute(createTeilerThread(start,end));
         start = end+1;   
         end = start + integersPerThread - 1;
      }
      
      maxTeilerCount = 0;
   
      pool.shutdown(); 
      
      while (!pool.isTerminated()) {
         try {
            Thread.sleep(1);
         } 
         catch(Throwable e){
            System.out.println("\nBearbeitung abgebrochen..."); 
            System.exit(-1);         
         }
      }
      
      long elapsedTime = System.currentTimeMillis() - startTime;
      System.out.println("Die maximale Anzahl echter Teiler " + "der Zahlen zwischen 1 und " + MAX + " ist: " + maxTeilerCount);
      System.out.println("Eine Zahl mit dieser Anzahl echter Teiler ist: " + intWithMaxTeilerCount);
      System.out.printf("Benoetigte Rechenzeit: %.3f Sekunden%n", (elapsedTime/1000.0));
   }
   
   public static void main(String[] args) {
      System.out.println("4 hat " + countTeiler(4));
      System.out.println("83160 hat " + countTeiler(83160));  
      System.out.println("98280 hat " + countTeiler(98280));          
      int numberOfThreads = 4;
      countTeilerWithThreads(numberOfThreads);
   }
   
   /*
   public static int countTeiler(int n) {
      int cnt = 0;
      for (int i = 2; i < n ; i++) {
         if ( n % i == 0 )
            cnt ++;
      }
      return cnt;
   }
   */

   public static int countTeiler(int n)
   {
      int cnt = 0;
      for (int i = 2; i < Math.sqrt(n); i++)
      {
         if (n % i == 0) {
            // wenn geprüfter Teiler der Wurzel von n entspricht, dann erhöhe natürlich nur um eins
            if (n / i == i)
               cnt++;
            // ansonsten erhöhe immer um 2
            else 
               cnt += 2;
         }
      }
      return cnt;
   }  

}