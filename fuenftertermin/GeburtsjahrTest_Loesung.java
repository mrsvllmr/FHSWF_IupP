package fuenftertermin;

class Geburtsjahr {  
   /*Speichert Geburtsjahr, aber nur, wenn >= 1900 und <= 2021*/
   private int geburtsJahr;
   public boolean setGeburtsJahr(int geburtsJahr) {
      boolean valid = geburtsJahr>= 1900 && geburtsJahr<=2021;
      if (valid)
         this.geburtsJahr = geburtsJahr;
      return valid;                                         // EMPFEHLUNG: return valid, um Feedback zu geben, dass es geklappt hat
   }
   
   /*
   public void setGeburtsJahr(int geburtsJahr) {
      boolean valid = geburtsJahr>= 1900 && geburtsJahr<=2021;
      if (valid)
         this.geburtsJahr = geburtsJahr;
      else
         throw new IllegalArgumentException();              // Mögliche Rückmeldung bei fehlerhafter Eingabe!
   }
   */
  
   public int getGeburtsJahr() {
      return geburtsJahr;
   }
}

public class GeburtsjahrTest_Loesung {    
   public static void main (String[] args) {
      Geburtsjahr jahr = new Geburtsjahr();
      jahr.setGeburtsJahr(1952);
      System.out.println(jahr.getGeburtsJahr());
      
      jahr.setGeburtsJahr(2052);
      System.out.println(jahr.getGeburtsJahr());      
   }
}

