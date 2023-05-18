package drittertermin;

public class IterationBeispiel {
   public static void main(String... args) {
      final int DIM = 1000;
      final int ITERATIONEN = 10;  
      long[][] matrix = new long[DIM][DIM];
      int iter = 0;
      long start = System.nanoTime();
      while (iter++ < ITERATIONEN) {            // 0-9
         for (int i = 0;i < DIM;i++) {          // 0-999
            for (int j = 0;j < DIM;j++) {       // 0-999
               matrix[i][j] = 1;
            }
         }
      }
      long end = System.nanoTime() - start;
      System.out.println("Durchschnittszeit in Nanosekunden: " + end/ITERATIONEN);
   }
}
// Erstellt eine 1000 x 1000 Matrix und füllt diese an jeder Stelle mit einer 1
// Wiederholt das Ganze 10x
// Ermittelt die Gesamtdauer und teilt diese durch die Anzahl an Iterationen (10)