package viertertermin;

public class Uebung04 {
   public static void main(String[] args) {
      double[][] a =
      {{1.0,2.0,3.0},{4.0,5.0},{7.0,8.0,9.0}};
      drucke(a);
   }
   
   public static void drucke(double[][] a) {
       //???
       int anzahlArrays = a.length;
       int position = 0;
       // Loop für Arrays
       for(int array=0; array<anzahlArrays; array++) {                      // Zeilen
           // Loop für Positionen innerhalb der Arrays
           for(position=0; position<a[array].length; position++) {          // Spalten - WICHTIG/REMINDER: a[array].length gibt Länge der Zeile zurück
               System.out.print(a[array][position]+" ");
           }
           System.out.println();                                            // Zeilenumbruch nach Zeilenende
       }
   }
}

// Programm druckt die gesamten Werte des zweidimensionalen Arrays
// Zeilen werden zeilenweise, Spalten spaltenweise ausgegeben