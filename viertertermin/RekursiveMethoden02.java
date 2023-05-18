package viertertermin;

class RekursiveMethoden02 {
   static long fak(long n) {
      return n < 1 ? 1 : fak(n-1)*n;
   }
   
   public static void main(String[] args) {
      long zeit; 
      long ergebnis;
      int j; 
      for (int i = 0; i < 5; i++) { 
         zeit = System.nanoTime(); 
         j = 10 + i;
         ergebnis = fak(j);
         System.out.println("Laufzeit [ns]: " + 
            (System.nanoTime()-zeit) + "\t(" +
            j + "! = " + ergebnis + ")"); 
      }    
   }          
}

//Annahme: Programm berechnet Fakultäten beginnend mit 10 (bis 15) und berechnet dabei noch den Zeitaufwand