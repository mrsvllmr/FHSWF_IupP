package fuenftertermin;

interface Fahrzeug {
   void fahren();
}
class Auto implements Fahrzeug {                        // Auto, ist ein Fahrzeug
   public void fahren() {
      System.out.println("Brumm brumm");
   }
   public void hupen() {
      System.out.println("Hup hup");
   }   
}

class Fahrrad implements Fahrzeug {                     // Fahrrad, ist ein Fahrzeug
   public void fahren() {
      System.out.println("Strampel strampel");
   }
   public void klingeln() {
      System.out.println("Klingel klingel");
   }   
}

class Schubkarre implements Fahrzeug {                  // Schubkarre, ist ein Fahrzeug
   public void fahren() {
      System.out.println("Rumpel rumpel");
   }
}

public class Rennen {                                   // Rennen
   public static void starteRennen(Fahrzeug... fahrzeuge) {
      for(int i = 0;i < fahrzeuge.length;i++) {         // Wird für jedes übergebene Objekt ausgeführt
         fahrzeuge[i].fahren();                         // fahren() kann einfach so aufgerufen werden, da jede Klasse diese Methode hat -> passende Klasse/Methode wird aus Typ abgeleitet
         if (fahrzeuge[i] instanceof Fahrrad)           // hier Prüfung, da die Methoden unterschiedlich heißen
            ((Fahrrad) fahrzeuge[i]).klingeln();        // BEACHTE ZUDEM: Cast auf ursprüngliche Klasse, da dort Implementation
         if (fahrzeuge[i] instanceof Auto)              // s.o.
            ((Auto) fahrzeuge[i]).hupen();              // s.o.
      }       
   }
   public static void main(String[] args) {
      starteRennen(new Auto(),new Fahrrad(),new Schubkarre());
   }
}
