package viertertermin;

public class Uebung03_Loesung {
   public static void main(String[] args) {
      int i = 0;
      while (i++ < 10) wuerfel();
   }
   public static void wuerfel() {
   	//???
      System.out.println("Ihr Wurf ist eine " + 
         (int)((Math.random()*6)+1) );
   }
}
