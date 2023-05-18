package fuenftertermin;

public class Throwable06 {
   public void macheEtwas01(String s) {
      if (s == null)
       throw new NullPointerException();
   }
   
   public void macheEtwas02(String s) {
      if (s != null && s.length() > 6)
       throw new IllegalArgumentException();      
   }
   
   public void macheEtwas03(String s) {
      throw new UnsupportedOperationException();
   }      
}
// THEMA: Mitteilen von eigenen Ausnahme- und Fehlersituationen (siehe Seite 134f. unten)
// Generiert und wirft Instanzen der o.g. Klassen