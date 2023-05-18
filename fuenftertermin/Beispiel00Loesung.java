package fuenftertermin;

public class Beispiel00Loesung {
   public static void main (String[] args) {
      doStuff();
   }
   
   static void doStuff() { 
      doMoreStuff();
   }
   
   static void doMoreStuff() {
      int y = 0;
      try {                                     // hier wird nun die Exception gefangen
         int x = 5/y;
      }
      catch(ArithmeticException e) {
         //...
      }
   }
}
