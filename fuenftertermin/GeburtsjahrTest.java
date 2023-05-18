package fuenftertermin;

class Geburtsjahr {  
   /*Speichert Geburtsjahr, aber nur, wenn >= 1900 und <= 2021*/
   private int geburtsJahr;
   
   public void setGeburtsJahr(int geburtsJahr) {
      this.geburtsJahr = geburtsJahr;
   }
   
   public int getGeburtsJahr() {
      return geburtsJahr;
   }
}

public class GeburtsjahrTest {    
   public static void main (String[] args) {
      Geburtsjahr jahr = new Geburtsjahr();
      jahr.setGeburtsJahr(1952);
      System.out.println(jahr.getGeburtsJahr());        // Erwartung: 1952
      
      jahr.setGeburtsJahr(2052);
      System.out.println(jahr.getGeburtsJahr());        // 2052
   }
}

