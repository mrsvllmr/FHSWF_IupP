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
      double x = 5.0/y;                              // Hier Exception aufgrund der Division durch 0 (java.lang.ArithmeticException)
                                                // Wird hier nicht abgefangen und auch nicht geworfen
                                                System.out.print(x);
   }
}
// Exception wird nirgendwo gefangen oder behandelt, daher Abbruch