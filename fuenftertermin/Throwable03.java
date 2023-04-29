package fuenftertermin;

interface Einfach {
   void macheEtwas() throws java.io.IOException;
}
public class Throwable03 implements Einfach {
   public void macheEtwas() throws java.io.IOException {
   }
   public static void main(String[] args) {
      new Throwable03().macheEtwas();     
   }
}