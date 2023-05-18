package viertertermin;

public class PrintfBeispiele {
   public static void main(String[] args) {
      if (System.console() == null) {
         System.out.println("Konsolenfenster nicht verfügbar.");
      } else {
         int i = 123; 
         double d = 123.456; 
         char c = 'a';
         String str = "abcdefg";
         System.console().printf("%d,%f,%c%n",i,d,c);       // Ganzzahl dezimal, Gleitkommazahl dezimal, Unicode char, newLine
                                                            // Erkenntnisse: 
                                                            // - Geht für mehrere Variablen gleichzeitig
                                                            // - 6 Nachkommastellen sind default bei f(loat)
         System.console().printf("<%10s>%n",str);           // "<", 10 Zeichen, String, ">", newLine
                                                            // Erkenntnis:
                                                            // - default ist rechtsbündig
         System.console().printf("<%f>%n",d);               // "<", Gleitkommazahl dezimal, ">", newLine
         System.console().printf("<%.2f>%n",d);             // "<", 2 Nachkommastellen, Gleitkommazahl dezimal, ">", newLine
         System.console().printf("<%10.0f>%n",d);           // "<", 10 Zeichen, keine Nachkommastelle, Gleitkommazahl dezimal, ">", newLine
         System.console().printf("<%10.4f>%n",d);           // "<", 10 Zeichen, 4 Nachkommastellen, Gleitkommazahl dezimal, ">", newLine
         System.console().printf("<%010.0f>%n",d);          // "<", 0 als Füllzeichen, 10 Zeichen, keine Nachkommastelle, Gleitkommazahl dezimal, ">", newLine
         System.console().printf("<%010.4f>%n",d);          
         System.console().printf("<%-10.0f>%n",d);          // "-" --> linksbündig
         System.console().printf("<%-10.4f>%n",d); 
         System.console().printf("<%10.0e>%n",d);           // "e" --> Gleitkommazahl wissenschaftlich
         System.console().printf("<%10.4e>%n",d);   
      }
   }
}