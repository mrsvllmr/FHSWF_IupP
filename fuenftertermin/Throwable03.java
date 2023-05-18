package fuenftertermin;

interface Einfach {
   void macheEtwas() throws java.io.IOException;
}

public class Throwable03 implements Einfach {
   public void macheEtwas() throws java.io.IOException {
   }
   
   public static void main(String[] args) {
      new Throwable03().macheEtwas();                       // Aufrufer MUSS behandeln, wenn Methode Ausnahme in exceptionList ausweist (siehe folgend)
      /*try {
         new Throwable03().macheEtwas();  
      }    
      catch (java.io.IOException e) {
          System.out.print("Jetzt i.O.");
      }*/
   }
}