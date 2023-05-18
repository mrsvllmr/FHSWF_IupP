package fuenftertermin;

public class Beispiel00 {
   public static void main (String[] args) {
      doStuff();
   }
   
   static void doStuff() { 
      doMoreStuff();
   }
   
   static void doMoreStuff() {
      int y = 0;
      int x = 5/y;                              // Hier Exception aufgrund der Division durch 0 (java.lang.ArithmeticException)
                                                // Wird hier nicht abgefangen und auch nicht geworfen
   }
}
// Exception wird nirgendwo gefangen oder behandelt, daher Abbruch