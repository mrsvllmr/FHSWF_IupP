package viertertermin;

public class Random03 {
   public static void shuffle(int... a) {
      if (a == null || a.length < 2)
         return;
      for(int i=a.length; i>1; i--) {               // Durchgehen des Arrays vom Ende zum Anfang
         int j = (int) (Math.random()*i);           // kann maximal 19 werden, daher i.O.
         int temp = a[j];                           // Wert an Random-Position wird temp zugewiesen
         a[j] = a[i-1];                             // Random-Position bekommt Wert der letzten/(aktuellen) Position
         a[i-1] = temp;                             // Letzte/Aktuelle Position bekommt Wert an Random-Position
                                                    // -> Hier findet also ein Tausch zwischen zwei Indizes statt
                                                    // Tausch-Index wird via Random bestimmt und tauscht dann mit aktueller Position
      } 
      return;
   }
   
   public static void main(String[] args) {
      int[] a = new int[20];                        // Array mit 20 Indizes
      for(int i=0; i<a.length; i++)
         a[i] = i;                                  // Wert an jedem Index = Index
      shuffle(a);                                   // Aufruf mit Übergabe des Arrays
      for(int i=0; i<a.length; i++)                 // Ausgabe des überarbeiteten Arrays
         System.out.print(a[i] + " ");         
   }
}