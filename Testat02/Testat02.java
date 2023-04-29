package Testat02;

public class Testat02 {
   public static void main(String[] args) {
      System.out.println("For-Loop-Variante");
      printTanneWithForLoop(5);
      printTanneWithForLoop(10);
      printTanneWithForLoop(15);
      
      System.out.println("While-Loop-Variante");
      printTanneWithWhileLoop(5);
      printTanneWithWhileLoop(10);
      printTanneWithWhileLoop(15);
      
      System.out.println("Rekursion-Variante");
      printTanneWithRecursion(5,0,0);
      printTanneWithRecursion(10,0,0);
      printTanneWithRecursion(15,0,0);
   }
   
   public static void printTanneWithForLoop(int n) {
       // Schleife für Zeilen
       // Anzahl stimmt mit Stelle der Mitte überein
       for(int zeile=0; zeile<n; zeile++) {
           // Schleife innerhalb der Zeile
           // Doppelte Anzahl an Stellen im Vergleich zu Zeilen
           for(int position=0; position<n*2; position++) {
               // Wenn Position um max. i von Mitte abweicht, dann "*", sonst " "
               // Zudem: "-1" um sicherzustellen, dass Baum direkt am linken Rand beginnt
               if (Math.abs(n-position-1)<=zeile) {
                   System.out.print("*");
               } else {
                   System.out.print(" ");    
               }
           }
           // Zeilenumbruch
           System.out.println("");
       }
       // System.out.println("Temporäre Ausgabe nur um zu sehen, wo Zeile beginnt.");
   }
   
   public static void printTanneWithWhileLoop(int n) {
       // Schleife für Zeilen
       // Anzahl stimmt mit Stelle der Mitte überein
       int zeile = 0;
       while(zeile<n) {
           // Schleife innerhalb der Zeile
           // Doppelte Anzahl an Stellen im Vergleich zu Zeilen
           int position = 0;
           while(position<n*2) {
               // Wenn Position um max. i von Mitte abweicht, dann "*", sonst " "
               // Zudem: "-1" um sicherzustellen, dass Baum direkt am linken Rand beginnt
               if (Math.abs(n-position-1)<=zeile) {
                   System.out.print("*");
               } else {
                   System.out.print(" ");    
               }
               position++;
           }
           // Zeilenumbruch
           System.out.println("");
           zeile++;
       }
       // System.out.println("Temporäre Ausgabe nur um zu sehen, wo Zeile beginnt.");
   }
   
   public static void printTanneWithRecursion(int hoehe, int zeile, int position) {
       // Abbruchbedingung der Rekursion für die Zeilen
       if (zeile >= hoehe) return;
       
       // Loop durch Positionen
       for (position=0; position<hoehe*2; position++) {
           // Wenn Position um max. i von Mitte abweicht, dann "*", sonst " "
           // Zudem: "-1" um sicherzustellen, dass Baum direkt am linken Rand beginnt
           char c = Math.abs(hoehe-position-1)<=zeile ? '*':' ';
           System.out.print(c);
       }
       // Zeilenumbruch
       System.out.println("");
       
       // Rekursiver Aufruf für nächste Zeile
       printTanneWithRecursion(hoehe, zeile+1, position);
   }
   // war die rekursive Lösung so angedacht oder besteht das Ziel darin, alle anderen Loops zu umgehen?
}
