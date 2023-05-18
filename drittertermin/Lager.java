package drittertermin;

class Artikel {
   final static int VERSION = 4711;
   int artikelnummer;
   int lagerbestand;
   Artikel alternative;
}
public class Lager {
   public static void main(String[] args) {
      System.out.println(Artikel.VERSION);                      // 4711
      
      Artikel eins = new Artikel();
      eins.artikelnummer = 100;                                 // Instanzvariable                                     
      eins.lagerbestand = 5;                                    // s.o.
      eins.alternative = eins;                                  // s.o., nur vom Typ der Klasse selbst
      System.out.println(eins.alternative.artikelnummer);       // Annahme: 100, weil von referenzierter Instanz übernommen
      
      Artikel zwei = new Artikel();
      zwei.artikelnummer = 200;
      zwei.lagerbestand = 10;  
      zwei.alternative = eins;
      eins = null;
      System.out.println(zwei.alternative.artikelnummer);       // Annahme: 100, weil s.o.
                                                                // Erkenntnis: zwei-Instanz immer noch aufrufbar, obwohl Basis-Instanz eins nicht mehr zugewiesen
      
      try {
          System.out.println(eins.alternative.artikelnummer);   // Annahme: Laufzeitfehler, weil eins nicht mehr zur Verfügung steht
      }
      catch (Throwable e) {
          System.out.println("eins nicht mehr zur Verfügung");
      }
      System.out.println(zwei.alternative.lagerbestand);        // Annahme: Steht weiter zur Verfügung, obwohl eins selbst schon nicht mehr zur Verfügung steht
   }
}