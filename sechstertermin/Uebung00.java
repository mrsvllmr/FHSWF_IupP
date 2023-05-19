package sechstertermin;

interface Printer { 
   void print(String s, String t);
}
public class Uebung00 {
   public static void main(String[] args) {
      Printer p = null;
      p.print("Hallo", "Welt");    // Hallo schoene Welt
   }
}
