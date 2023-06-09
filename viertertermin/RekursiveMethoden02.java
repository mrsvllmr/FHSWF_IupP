package viertertermin;

class RekursiveMethoden02 {
   static long fak(long n) {
      return n < 1 ? 1 : fak(n-1)*n;                    // Selbstaufruf -> rekursive Methode (solange, bis n < 1, weil Ergebnis mit 1 dann klar)
   }
   
   public static void main(String[] args) {
      long zeit; 
      long ergebnis;
      int j; 
      
      for (int i = 0; i < 5; i++) {                     // 5 Durchläufe
         zeit = System.nanoTime();                      // Startzeit Beginn erster Durchlauf
         j = 10 + i;                                    // setzt Startwert auf 10 (statt i mit 0 zu nutzen)
         ergebnis = fak(j);                             // Methodenaufruf -> hier erfolgen jetzt nacheinander erst alle Aufrufe und letztlich die "Rückabwicklung", bei der alle Teilergebnisse kombiniert werden
         System.out.println("Laufzeit [ns]: " +         // Bestimmung Zeit nach Bearbeitung und Ausgabe
            (System.nanoTime()-zeit) + "\t(" +
            j + "! = " + ergebnis + ")"); 
      }    
   }        
   
}


class RekursiveMethoden03 {
   static long ggT_Iteration(long a, long b){
      long r;
      while (b != 0) {
         r = a % b;             // Divisionsrest
         a = b;                 // a wird auf b gesetzt
         b = r;                 // b wird auf Divisionsrest gesetzt
                                // Nachvollziehen des Algo: 24, 9
                                // r = 24 % 9 = 6, a = 9, b = 6
                                // r = 9 % 6 = 3, a = 6, b = 3
                                // r = 6 % 3 = 0, a = 3, b = 0
      }
      return a;
   }
   
   static long ggT_Rekursion(long a, long b){
      long r = a % b;
      if (r == 0)
         return b;
      else
         return ggT_Rekursion(b, r);
   }
   
   public static void main(String[] args) {
      final int ITERATIONEN = 1_000;
      long[] a = new long[ITERATIONEN];                     // Array mit 1000 Positionen
      long[] b = new long[ITERATIONEN];                     // s.o.
      
      for (int i=0; i < ITERATIONEN; i++){
         a[i] = Math.round(Math.random()*1_000_000);        // Feld wird mit Zahlen zwischen 0 und 1.000.000 gefüllt
         b[i] = Math.round(Math.random()*1_000_000);        // s.o.
      }         
      
      long start;
      start = System.nanoTime();     
      
      // Startzeit
      for (int i=0; i < ITERATIONEN; i++)
         ggT_Iteration(a[i],b[i]);                          // Aufruf ggT_Iteration für beide Arrays
      System.out.println("Iteration in Nanosekunden: " 
         + (System.nanoTime() - start)/ITERATIONEN);  
      start = System.nanoTime();
      
      for (int i=0; i < ITERATIONEN; i++)
         ggT_Rekursion(a[i],b[i]);                          // Aufruf ggT_Rekursion für beide Arrays
      System.out.println("Rekursion in Nanosekunden: " 
         + (System.nanoTime() - start)/ITERATIONEN);         
   }
}