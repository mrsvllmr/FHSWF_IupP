package fuenftertermin;

interface LagerWare {                                           // Neuerung i.V.g. zur ersten Lager01!
   int getArtikelNummer();  
   int getLagerBestand(); 
   float getPreis();
   void init(int artikelnummer, int anfangsbestand, float preis);
   boolean aendereLagerBestand(int aenderung);
   boolean aenderePreis(float preis);   
   float berechneWarenwert(); 
}

class Artikel implements LagerWare {
   private int artikelnummer;
   private int lagerbestand;
   private float preis;
   
   public void init(int anr){                                   // Auch hier Nutzung der "init-Kaskade"/Setter
      init(anr,0);
   }  
   
   public void init(int anr, int lbt){
      init(anr,lbt,0.0f);
   }  
   
   public void init(int anr, int lbt, float p){
      artikelnummer = anr;
      lagerbestand = Math.max(0,lbt);
      preis = Math.max(0.0f,p);
   }
   
   public int getArtikelNummer(){                               // Getter
      return artikelnummer; 
   }  
   
   public int getLagerBestand(){
      return lagerbestand; 
   }
   
   public float getPreis(){
      return preis;
   } 
   
   public boolean aendereLagerBestand(int x) {                  // Setter (Änderungen)
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

public class Lager02 {
   static float berechneLagerWert(LagerWare... a) {
      float sum = 0.0f;
      //for (int i=0;i<a.length;i++)
      //   sum+=a[i].berechneWarenwert();
      for (LagerWare x: a) sum += x.berechneWarenwert();
      return sum;
   }
   
   public static void main(String[] args) {
      LagerWare eins = new Artikel();                               // Reminder: Schnittstellenname bezeichner = new Klassenname(); !!!
      eins.init(100,5,3.0f);                                        // Dann Weiterarbeit mit Referenzvariable der Schnittstelle
      
      LagerWare zwei = new Artikel();
      zwei.init(200,20,2.0f);
      
      eins.aendereLagerBestand(-3);
      zwei.aendereLagerBestand(10); 
      
      System.out.printf("Lagerwert: %.2f Euro", 
         berechneLagerWert(eins,zwei));    
   }
}