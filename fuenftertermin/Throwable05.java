package fuenftertermin;

interface Einfach {
   void macheEtwas() throws java.io.IOException;
}
public class Throwable05 implements Einfach {
   public void macheEtwas() throws Exception {      // nicht i.O., da Exception allgemeiner als IOException ist
   }
   
   public static void main(String[] args) {
      new Throwable05().macheEtwas();     
   }
}