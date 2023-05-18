package drittertermin;

class Uebung_3_6 {
   public static void main(String[] args){
      int zaehler = 0;
      int n = 6;
      System.out.println("n = " + n);               // Annahme: "n = 6"
      while (n != 1) {
         if (n % 2 == 0) {                          // I1 true -> n=3  I2 false -> n=10  I3 true -> n=5  I4 false -> n=16
            n = n / 2;                                 
         } 
         else {
            n = 3 * n + 1;
         }
         System.out.println("n = " + n);            // I1 "n = 3"  I2 "n = 10"  I3 "n = 5"  I4 "n = 16"
         zaehler = zaehler + 1;                     // I1 zaehler = 1  I2 zaehler = 2  I3 zaehler = 3  I4 zaehler = 16
      }
      System.out.println("Ergebnis: " + zaehler);   // I1 "Ergebnis: 1"  I2 "Ergebnis: 2"  I3 "Ergebnis: 3"  I4 "Ergebnis: 4"
                                                    // FALSCH, weil NICHT Teil der Iteration!!!
   }
}


