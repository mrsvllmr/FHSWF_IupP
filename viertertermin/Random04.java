package viertertermin;

public class Random04 {
   public static void shuffle(int... a) {
      if (a == null || a.length < 2)
         return;
      for(int i=a.length; i>1; i--) {
         int j = (int) (Math.random()*i);
         int temp = a[j];
         a[j] = a[i-1];
         a[i-1] = temp;
         print(a);                              // ACHTUNG: Hier jetzt Ausgabe von a nach jedem Tausch
      } 
      return;
   }
   
   public static void print(int... a) {
      System.out.println();
      for (int k=0;k < a.length; k++)
         System.out.printf("%02d ",a[k]);       // Ausgabe des Arrays mit füllenden Nullen, Breite von 2 und Ganzzahl dezimal
   }
   
   public static void main(String[] args) {
      int[] a = new int[20];                    // Array mit 20 Indizes
      for(int i=0; i<a.length; i++)
         a[i] = i;                              // Wert an jeweiligem Index = Index
      print(a);
      // Bis hierher Vorbelegung und erstmalige Ausgabe
      
      shuffle(a);
      System.out.println();
      for(int i=0; i<a.length; i++)
         System.out.print(a[i] + " ");          // ACHTUNG: Hier keine Formatierung mehr, lediglich Trennzeichen " "    
   }
}