package fuenftertermin;

class Auto {
    String marke = "";
    String modell = "";
    int ps = 0;
    double preis = 0.0;
}

public class AutoTest {
   public static void main (String[] args) {
      Auto r4 = new Auto();                     // Erstellen einer neuen Auto-Instanz
      r4.marke = "Renault";                     // Initialisierung von Instanz-Variablen (direkt, ohne Setter)
      r4.modell = "R4";
      r4.ps = 34;
      r4.preis = 8000.0;
   }
}
