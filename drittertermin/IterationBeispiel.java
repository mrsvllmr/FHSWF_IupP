package drittertermin;

public class IterationBeispiel {
   public static void main(String... args) {
      final int DIM = 1000;
      final int ITERATIONEN = 10;  
      long[][] matrix = new long[DIM][DIM];
      int iter = 0;
      long start = System.nanoTime();
      while (iter++ < ITERATIONEN) {
         for (int i = 0;i < DIM;i++) {
            for (int j = 0;j < DIM;j++) {
               matrix[i][j] = 1;
            }
         }
      }
      long end = System.nanoTime() - start;
      System.out.println("Durchschnittszeit in Nanosekunden: " + end/ITERATIONEN);
   }
}