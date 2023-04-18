package fuenftertermin;

interface Auto {
   void fahren();
}
public class Autorennen03 {
   public static void starteRennen(Auto... autos) {
      for(Auto auto : autos) auto.fahren();
   }
   public static void main(String[] args) {
      Auto lamborghini = () -> System.out.println("Brumm brumm");
      Auto trabant = () -> System.out.println("Tucker tucker");      
      starteRennen(lamborghini,trabant);
   }
}
