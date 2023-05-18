package drittertermin;

class Uebung_3_5 {
   public static void main(String[] args){
      int i = 0;
      for(System.out.println("Deklaration und Initialisierung");i < 2; i++,System.out.println("Inkrement")) {
         System.out.println(i);
      }
      // Annahme: Kompiliert nicht, da Klammer fehlt --> FALSCH, da Teil der Iteration nicht vollständig zu sehen war!
      // Initialisierung - Bedingung - Iteration
      // (1) System.out.println("Deklaration und Initialisierung")
      // (2) i < 2
      // (3) i < 2; i++,System.out.println("Inkrement")
   }
}

