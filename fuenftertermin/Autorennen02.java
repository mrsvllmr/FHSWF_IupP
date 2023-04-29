package fuenftertermin;

interface Auto {
   void fahren();
}
interface Fahrrad {
   void fahren();
}
public class Autorennen02 {
   public static void starteRennen(Auto... autos) {
      for(Auto auto : autos) auto.fahren();
   }
   public static void main(String[] args) {
      Auto lamborghini = 
         new Auto() {
            public void fahren() {
               System.out.println("Brumm brumm");
            }
         };
      Fahrrad diamant =          
         new Fahrrad() {
            public void fahren() {
               System.out.println("Strampel strampel");
            }      
           };
      starteRennen(lamborghini,diamant);
   }
}
