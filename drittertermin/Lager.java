package drittertermin;

class Artikel {
   final static int VERSION = 4711;
   int artikelnummer;
   int lagerbestand;
   Artikel alternative;
}
public class Lager {
   public static void main(String[] args) {
      System.out.println(Artikel.VERSION);    
      Artikel eins = new Artikel();
      eins.artikelnummer = 100;
      eins.lagerbestand = 5;
      eins.alternative = eins;
      System.out.println(eins.alternative.artikelnummer);      
      Artikel zwei = new Artikel();
      zwei.artikelnummer = 200;
      zwei.lagerbestand = 10;  
      zwei.alternative = eins;
      eins = null;
      System.out.println(zwei.alternative.artikelnummer);    
   }
}