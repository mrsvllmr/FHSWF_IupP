package siebtertermin;

public class Uebung4 {
   public static void main(String[] args) {
      double x = 1.1;
      double y = 1.21;
      System.out.println(Math.pow(x,2) == y);       // 1.1^2 == 1.21 wird hier überprüft
                                                    // ergibt false, ich nehme an aufgrund von Feinheiten in den Nachkommastellen?!
                                                    
    // Mögliche Lösung für Umgang mit solchen Rundungsthematiken
    double tolerance = 0.0001; // Toleranzschwelle für den Vergleich

    boolean isEqual = Math.abs(Math.pow(x, 2) - y) < tolerance;
    System.out.println(isEqual);
   }
}
