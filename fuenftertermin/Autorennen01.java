package fuenftertermin;

interface Auto {
   void fahren();
}
public class Autorennen01 {
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
      Auto trabant =          
         new Auto() {
            public void fahren() {
               System.out.println("Tucker tucker");
            }      
           };
      starteRennen(lamborghini,trabant);
   }
}
