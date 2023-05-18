package viertertermin;

public class Uebung03 {
   public static void main(String[] args) {
      int i = 0;
      while (i++ < 10) wuerfel();                   // wird also 10x ausgeführt
   }
   
   public static void wuerfel() {
       int zahl = 1 + (int) (Math.random() * 6);    // kommt immer Zahl zwischen 1 und 6 raus
       System.out.println(zahl);
   }
}
