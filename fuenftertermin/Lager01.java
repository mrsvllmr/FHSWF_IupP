package fuenftertermin;

class Artikel {
   private int artikelnummer;
   private int lagerbestand;
   private float preis;
   public void init(int anr){
      init(anr,0);                                          // ruft zweite init-Methode auf         
   }  
   
   public void init(int anr, int lbt){
      init(anr,lbt,0.0f);                                   // ruft dritte init-Methode auf
   }  
   
   public void init(int anr, int lbt, float p){             // dritte/finale init-Methode, die letztlich die Instanzvariablen setzt (WICHTIG)
      artikelnummer = anr;
      lagerbestand = Math.max(0,lbt);                       // BEACHTE: Hier werden negative Eingaben direkt "abgefangen"s
      preis = Math.max(0.0f,p);                             // s.o.
   }
   
   public int getArtikelNummer(){
      return artikelnummer; 
   } 
   
   public int getLagerBestand(){
      return lagerbestand; 
   }
   
   public float getPreis(){
      return preis;
   }
   
   public boolean aendereLagerBestand(int x) {
      if (lagerbestand + x < 0) {
         return false;
      } else {
         lagerbestand += x;
         return true;
      }
   } 
   
   public boolean aenderePreis(float p) {
      if (p < 0.0f) {
         return false;
      } else {
         preis = p;
         return true;
      }
   } 
   
   public float berechneWarenwert() {
      return lagerbestand*preis; 
   }   
}

public class Lager01 {
   static float berechneLagerWert(Artikel... a) {
      float sum = 0.0f;
      for (int i=0;i<a.length;i++)
         sum+=a[i].berechneWarenwert();
      return sum;
   }
   
   public static void main(String[] args) {
      Artikel eins = new Artikel();                 // Erste Artikel-Instanz
      eins.init(100,5,3.0f);
      
      Artikel zwei = new Artikel();                 // Zweite Artikel-Instanz
      zwei.init(200,20,2.0f);
      
      eins.aendereLagerBestand(-3);                 // Änderung des LB von eins
      zwei.aendereLagerBestand(10);                 // s.o. von zwei
      
      System.out.printf("Lagerwert: %.2f Euro", 
         berechneLagerWert(eins,zwei));             // Erwartung: 2*3.0 + 30*2.0 = 66.0
   }
}