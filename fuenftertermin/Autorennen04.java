package fuenftertermin;

interface Auto {
   void fahren();
}

public class Autorennen04 {
   public static void brummen() {
      System.out.println("Brumm brumm");
   }
   
   public static void tuckern() {
      System.out.println("Tucker tucker");
   }  
   
   public static void starteRennen(Auto... autos) {
      for(Auto auto : autos) auto.fahren();
   }
   
   public static void main(String[] args) {
      starteRennen(Autorennen04::brummen,Autorennen04::tuckern);        // THEMA METHODENREFERENZ (siehe Seite 138f. unten)
                                                                        // dadurch Nutzung der vorhandenen Methoden, da sie gleiche Parameterliste/Rückgabetyp haben!
      // Alternative mit Lambda-Asudrücken wäre: starteRennen(() -> brummen(), () -> tuckern());
   }
}
/*
 * Methodenreferenz
 * - kann genutzt werden, wenn es zu einem geplanten Lambda-Ausdruck eine Methode mit passender Parameterliste + Rückgabetyp gibt
 * - Syntax: Klassenname.methodName() oder Referenzvariable.methodName()
 */