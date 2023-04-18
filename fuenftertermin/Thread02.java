package fuenftertermin;

import java.util.concurrent.*;
public class Thread02 {
   public static void main(String[] args) throws InterruptedException {
      Runnable a = 
         () -> System.out.println("A " + Thread.currentThread().getName());
      Runnable b = 
         () -> System.out.println("B " + Thread.currentThread().getName());
      Runnable c = 
         () -> System.out.println("C " + Thread.currentThread().getName());           
      ExecutorService executor = Executors.newFixedThreadPool(2);
      executor.execute(a);
      executor.execute(b);
      executor.execute(c);      
      Thread.sleep(500);
      executor.execute(a);
      executor.execute(b);
      executor.execute(c);       
      executor.shutdown();
   }
}