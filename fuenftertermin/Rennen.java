package fuenftertermin;

interface Fahrzeug {
   void fahren();
}
class Auto implements Fahrzeug {
   public void fahren() {
      System.out.println("Brumm brumm");
   }
   public void hupen() {
      System.out.println("Hup hup");
   }   
}
class Fahrrad implements Fahrzeug {
   public void fahren() {
      System.out.println("Strampel strampel");
   }
   public void klingeln() {
      System.out.println("Klingel klingel");
   }   
}
class Schubkarre implements Fahrzeug {
   public void fahren() {
      System.out.println("Rumpel rumpel");
   }
}
public class Rennen {
   public static void starteRennen(Fahrzeug... fahrzeuge) {
      for(int i = 0;i < fahrzeuge.length;i++) {
         fahrzeuge[i].fahren();
         if (fahrzeuge[i] instanceof Fahrrad)
            ((Fahrrad) fahrzeuge[i]).klingeln();
         if (fahrzeuge[i] instanceof Auto)
            ((Auto) fahrzeuge[i]).hupen();  
      }       
   }
   public static void main(String[] args) {
      starteRennen(new Auto(),new Fahrrad(),new Schubkarre());
   }
}
