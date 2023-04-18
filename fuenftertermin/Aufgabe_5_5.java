package fuenftertermin;

enum Farbe {KARO, HERZ, PIK, KREUZ}

enum Werte {SIEBEN, ACHT, NEUN, ZEHN, BUBE, DAME, KOENIG, ASS}

class Spielkarte {
   private Farbe farbe;
   private Werte wert;
   public Spielkarte init(Farbe farbe, Werte wert) {
      this.farbe = farbe;
      this.wert = wert;
      return this;
   }
   public String toString() { 
      return farbe + "_" + wert; 
   }
}

public class Aufgabe_5_5 {  
   public static <T> void shuffle(T[] a) {
      if (a == null || a.length < 2)
         return;
      for(int i=a.length; i>1; i--) {
         int j = (int) (Math.random()*i);
         T temp = a[j];
         a[j] = a[i-1];
         a[i-1] = temp;
      } 
      return;
   } 
   public static void main(String[] args) {
      final int anzahl = Farbe.values().length*Werte.values().length;
      Spielkarte[] skatblatt = new Spielkarte[anzahl];
      int i = 0;
      for (Farbe farbe : Farbe.values()) {
         for (Werte wert : Werte.values()) {
            skatblatt[i++] = new Spielkarte().init(farbe, wert);
         }
      }
      
      shuffle(skatblatt);
      
      for (Spielkarte k : skatblatt)
         System.out.print(k.toString()+" ");
   }
}

