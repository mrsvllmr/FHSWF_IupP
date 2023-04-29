package fuenftertermin;

interface Einfach {
   void macheEtwas() throws java.io.IOException;
}
public class Throwable04 implements Einfach {
   public void macheEtwas() throws NullPointerException {
   }
   public static void main(String[] args) {
      new Throwable04().macheEtwas();     
   }
}