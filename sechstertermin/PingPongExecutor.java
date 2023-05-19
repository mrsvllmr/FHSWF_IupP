package sechstertermin;

import java.util.concurrent.*;
public class PingPongExecutor implements Runnable {
   String word;  int delay;
   public static PingPongExecutor create(String word, int delay) {
      PingPongExecutor p = new PingPongExecutor();
      p.word = word;  
      p.delay = delay;
      return p;
   }
   public void run() {
      try {
         while (true) {
            System.out.println(word);
            Thread.sleep(delay);  // warten
         }
      } catch (InterruptedException exc) {
         System.err.println("Interrupt: " + exc); 
         return;
      } 
   }
   public static void main(String[] args) {
      ExecutorService pool = Executors.newCachedThreadPool();
      pool.execute(PingPongExecutor.create("ping", 33));  // 1/30 Sek.
      pool.execute(PingPongExecutor.create("PONG", 100)); // 1/10 Sek.
   }
}
