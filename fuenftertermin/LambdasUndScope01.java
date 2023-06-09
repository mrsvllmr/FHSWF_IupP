package fuenftertermin;

interface Executable {
   void exec();
}

public class LambdasUndScope01 {
   public static void main(String[] args) {
      int i = 10;
      int j = 20;
      Executable p = 
         () -> {
            int e = 20; //Kompilierfehler                       // weil schon deklariert!
            while(j > 0) j--; //Kompilierfehler                 // weil nicht final! (lokale Variablen müssen final sein!)
         };
      p.exec();
   }
}

/* Lambda-Ausdrücke
 * - nur nutzbar, wenn Schnittstelle nur eine einzige Deklaration einer abstrakten Methode enthält
 * - so eine Schnittstelle heißt dann "funktionale Schnittstelle"
 * - Implementierung der abstrakten Methode einer funktionalen Schnittstelle über Lambda-Ausdruck möglich
 * - Syntax: (parameterList) -> Anweisung oder Block von Anweisungen 
 * - Datentypen bei Parametern können weggelassen werden, wenn aber alle! (return ggf. auch, aber einfach drin lassen ^^)
 * - Vorteil: Deutlich kompakter
 */