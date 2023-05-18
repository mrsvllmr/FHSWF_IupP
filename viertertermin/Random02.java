package viertertermin;

public class Random02 {
   public static int selectRandom(int... a) {
      return a[(int) (Math.random()*a.length)];             // Werte von 0 bis (a.length-1) -> 0 bis 4
                                                            // Hier WICHTIG/GRUNDLAGE: Interne Behandlung als Array
   }
   
   public static void main(String[] args) {
      for(int i=0; i<10; i++)
         System.out.print(selectRandom(1,7,12,18,99)+" ");
   }
}

// Erwartung: 10 Ausgaben der Werte der Serie (zufällig gewählt), Ausgabe in einer Zeile getrennt durch " "