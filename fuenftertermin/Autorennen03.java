package fuenftertermin;

interface Auto {
   void fahren();                                                       // Voraussetzung für untenstehenden Lambda-Ausdruck: Nur eine abstrakte Methode in Schnittstelle
}

public class Autorennen03 {
   public static void starteRennen(Auto... autos) {
      for(Auto auto : autos) auto.fahren();                             // for-each-Schleife mit Serie
   }
   
   public static void main(String[] args) {
      Auto lamborghini = () -> System.out.println("Brumm brumm");       // THEMA LAMBDA-AUSDRÜCKE (ab S. 135!)
      Auto trabant = () -> System.out.println("Tucker tucker");      
      starteRennen(lamborghini,trabant);
   }
}
