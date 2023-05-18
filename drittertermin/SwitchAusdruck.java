package drittertermin;

class SwitchAusdruck { //ab Java 12 als Preview
   public static void main(String[] args) { 
      int zahl = 1; 
      String s = switch(zahl) { 
         case 1: yield "Fall 1";                // REMINDER: yield gibt Wert danach zurück
         case 2, 3: yield "F�lle 2 und 3"; 
         default: yield "Andere F�lle"; 
      }; 
      System.out.println(s);                    // Annahme: "Fall 1"
   } 
}