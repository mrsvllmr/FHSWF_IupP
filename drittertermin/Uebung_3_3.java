package drittertermin;

class Uebung_3_3 {
   public static void main(String[] args){
      int x = 10; 
      int y = -1; 
      System.out.println("x >> 1 = " + (x >> 1));    // 10 hat Bitmuster 00001010, >> 1 ergibt 00000101 und damit dezimal 5 (Vorzeichenbit auffüllen)
      System.out.println("x >>> 1 = " + (x >>> 1));  // s.o., >>> 1 ergibt gleiches Ergebnis, weil hier Nullen aufgefüllt werden
      System.out.println("y >> 2 = " + (y >> 2));    // -1 hat Bitmuster 11111111, >> 2 ergibt unverändert 11111111
      System.out.println("y >> 15 = " + (y >> 15));  // s.o., >> 15 ergibt weiterhin das gleiche Ergebnis, da weiterhin immer Vorzeichenbit
      System.out.println("y >>> 2 = " + (y >>> 2));  // s.o., >>> 2 ergibt 00111111
   }
}
