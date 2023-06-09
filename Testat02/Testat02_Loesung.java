package Testat02;

public class Testat02_Loesung {
   public static void main(String[] args) {
      printTanne1(5);
      printTanne2(10); 
      printTanne3(15);           
   }
   
   public static void printTanne1(int n) {
      // solange i kleiner als maximale Spaltenanzahl (wird immer um zwei erhöht)
      // passiert 5x -> Zeilen
      for (int i = 0; i < n * 2; i += 2) {
         // Leerzeichen
         // in erstem Durchgang vier Leerzeichen, im zweiten drei, in dritten zwei, im vierten eins, im fünften keins
         for (int j = n - i / 2 - 1; j > 0; j--)
            System.out.print(" ");
         // Sterne
         // werden mit jeder Zeile zwei mehr, weil mit i verglichen wird (Variable für die Spalten, die immer um zwei wächst)
         for (int k = 0; k <= i; k++) 
            System.out.print("*");
         // Zeilenumbruch
         // am Ende jeder Zeile
         System.out.println();
      }
   }
   
   public static void printTanne2(int n) {
      int i=-1, j=0;
      // solange i < n, wobei n der Anzahl an Zeilen entspricht
      // 0,1,2,3,4,5,6,7,8,9 -> 10x
      // Zeilenschleife
      while(i++<n){
         // solange j kleiner als Anzahl Zeilen - aktuelle Zeile
         // 0,1,2,3,4,5,6,7,8,9
         for(j=0;j<n-i;j++)
            System.out.print(" ");
         // solange j kleiner als 2xaktuelle Zeile-1
         // 
         for(j=0;j<2*i-1;j++)
            System.out.print("*");
         System.out.println();
      }
   }

   public static void printTanne3(int... a) {
      if (a == null || a.length < 1)
         return;
      int n = a[0];
      int m = a.length > 1 ? a[1] : 0;
      if (n == 0) return;
      printTanne3(n-1,m+1);
      while (m-- > 0) System.out.print(" "); 
      n = 2*n - 1;
      while (n-- > 0) System.out.print("*"); 
      System.out.println();      
   }         
}
