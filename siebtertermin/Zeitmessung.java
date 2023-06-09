package siebtertermin;

public class Zeitmessung {
   public static void main(String... args) 
                                    throws InterruptedException {
      long startNanos = System.nanoTime();
      long startMillis = System.currentTimeMillis();
      Thread.sleep(100);
      long timeInNanos = System.nanoTime() - startNanos;
      long timeInMillis = System.currentTimeMillis() - startMillis;
      System.out.println("Nanosekunden: " + timeInNanos);
      System.out.println("Millisekunden: " + timeInMillis);
   }
}