package siebtertermin;

public class Uebung2 {
   public static void main(String[] args) {
      Integer i1 = Integer.valueOf(1000);
      Integer i2 = Integer.valueOf(1000);
      System.out.println( i1 >= i2 );   // true, durch Unboxing und Autoboxing
      System.out.println( i1 <= i2 );   // true, durch Unboxing und Autoboxing
      System.out.println( i1 == i2 );   // false, weil "==" nur auf dem Stack arbeitet, d.h. es vergleicht Referenzen
                                        // in einer gewissen Spanne werden Objekte als Pool vorgehalten, dann wird das sogar auch true
      
      // zeigt, dass es sich hierbei um Objekte handelt
      // Prüfung auf Gleichheit "==" nur bei primitiven Datentypen gegeben!
   }
}
