package fuenftertermin;

interface Auto {
   void fahren();
   void hupen();
}

public class Autorennen01 {
   public static void starteRennen(Auto... autos) {
      for(Auto auto : autos) auto.fahren();             // for-each-Schleife (siehe Seite 117)
   }
   
   public static void main(String[] args) {
      Auto lamborghini =                                // Anonyme Klasse
         new Auto() {
            public void fahren() {
               System.out.println("Brumm brumm");
            }
            public void hupen() {
                System.out.println("Möööööööööööööööp");
            }
         };
      Auto trabant =                                    // Anonyme Klasse
         new Auto() {
            public void fahren() {
               System.out.println("Tucker tucker");
            }   
            public void hupen() {
                System.out.println("Möööööööööööööööp");
            }
           };
      starteRennen(lamborghini,trabant);
   }
}
// Spart Deklaration einer konkreten äußeren Klasse