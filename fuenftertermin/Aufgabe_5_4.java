package fuenftertermin;

import java.util.concurrent.*;
public class Aufgabe_5_4 {
   public static void parallel(int n, Runnable... r)throws InterruptedException {
      if (r == null || r.length == 0 || n < 1)
         return;
      ExecutorService executor = Executors.newFixedThreadPool(n);
      for (Runnable x : r)
         executor.execute(x);
      executor.shutdown();
      while (!executor.isTerminated()) {
         Thread.sleep(100);
      }
   }
   public static void main(String[] args) {
   }   
}