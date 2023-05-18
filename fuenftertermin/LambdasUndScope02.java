package fuenftertermin;

interface Executable {
   void exec();
}

public class LambdasUndScope02 {
   private void action() {
      Executable p =                                                // HIER Anonyme Klasse
         new Executable() {
            public void exec() {
               System.out.println(this instanceof Executable);      // Erwartung: true 
            }
         };
      p.exec();
      Executable q =                                                // HIER Lambda-Ausdruck
         () -> System.out.println(this instanceof Executable);      // Erwartung: false (weil kein "new Executable()"!!!)
      q.exec();
   }  
   
   public static void main(String[] args) {
      new LambdasUndScope02().action();
   }
}

