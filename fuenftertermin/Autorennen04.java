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
      starteRennen(Autorennen04::brummen,Autorennen04::tuckern);
   }
}
