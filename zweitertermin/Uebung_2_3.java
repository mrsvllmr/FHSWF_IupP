package zweitertermin;

class Reifen {
   String marke;
   int reifenQuerschnittsbreite;
   int felgenDurchmesser; 
}

class Fahrzeug {
   String marke;
   int kw;
   Reifen[] reifen;
}

public class Uebung_2_3 {
   public static void main(String[] args){
      Fahrzeug audi = new Fahrzeug();
      audi.marke = "Audi";
      audi.kw = 120;
      audi.reifen = new Reifen[4];              // MERKEN
      audi.reifen[0].marke = "Continental";     // BEACHTE: Array vom Typ der Klasse Reifen, daher die Variablen im Zugriff
      
   }
}
