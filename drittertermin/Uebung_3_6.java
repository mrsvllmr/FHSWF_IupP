package drittertermin;

class Uebung_3_6 {
   public static void main(String[] args){
      int zaehler = 0;
      int n = 6;
      System.out.println("n = " + n);      
      while (n != 1) {
         if (n % 2 == 0) {
            n = n / 2;
         } 
         else {
            n = 3 * n + 1;
         }
         System.out.println("n = " + n);
         zaehler = zaehler + 1;
      }
      System.out.println("Ergebnis: " + zaehler);       
   }
}


