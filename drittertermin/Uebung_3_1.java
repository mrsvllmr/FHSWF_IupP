package drittertermin;

class Uebung_3_1 {
   public static void main(String[] args){
      int x = 500;
      int y = 500;
      System.out.println(x == y);   // Annahme: true, weil primitiver Datentyp -> Prüfung auf inhaltliche Gleichheit
      int[] xa = {500};
      int[] ya = {500};
      System.out.println(xa == ya); // Annahme: false, weil Referenzdatentyp -> Prüfung, ob Objekte im Heap identisch
   }
}


