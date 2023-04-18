package fuenftertermin;

import java.util.concurrent.*;
public class Thread04 {
   public static int x = 0;
   public static void incrementX() {
      for(int i = 0;i < 1000000;i++)
         incX();   
   }
   public static synchronized void incX() {
         x++;   
   }   
   public static void main(String[] args) throws InterruptedException {
      Runnable a = Thread04::incrementX;
      Runnable b = Thread04::incrementX;
      ExecutorService executor = Executors.newFixedThreadPool(2);
      executor.execute(a);
      executor.execute(b);
      executor.shutdown();
      while (!executor.isTerminated()) {
         Thread.sleep(100);
      }
      System.out.println("Erwartet x = 2000000, aber x = " + x);
   }
}
