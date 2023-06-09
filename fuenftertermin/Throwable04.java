package fuenftertermin;

interface Einfach {
   void macheEtwas() throws java.io.IOException;
}

public class Throwable04 implements Einfach {
    // public void macheEtwas() {
       // System.out.println("Keine ist auch ok!");              // i.O.  
   
   //public void macheEtwas() throws NullPointerException {   // NullPointerException ist unchecked, weswegen unten kein Fehler auftritt, obwohl nicht behandelt wird
   public void macheEtwas() throws java.io.IOException {    // gleiche Ausnahme wie in Schnittstelle -> i.O., dann muss Aufrufer aber behandeln oder selber weiterwerfen!
                                                              // in diesem Fall ritt unten Fehler auf, weil(!!!) diese Ausnahme behandelt werden muss
                                                              // in Implementierung dürfen nur Ausnahmen ausgewiesen werden, die schon in Schnittstelle-throws enthalten
                                                              // (oder eben weniger kontrollierte oder unkontrolliert Ausnahmen) -> siehe folgende Beispiele
   //public void macheEtwas() throws java.io.FileNotFoundException {    // i.O., weil spezifischer, muss aber natürlcih auch unten behandelt werden
   //public void macheEtwas() throws java.lang.Exception {              // nicht i.O., weil allgemeiner
   }
   
   public static void main(String[] args) {
      try {
          new Throwable04().macheEtwas();
      } catch (java.io.IOException e) {
          System.out.println("Behandelt!");
      }
   }
}