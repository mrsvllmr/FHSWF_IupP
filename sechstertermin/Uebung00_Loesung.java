package sechstertermin;

interface Printer { 
   void print(String s, String t);
}
public class Uebung00_Loesung {
   public static void main(String[] args) {
      Printer p = (s, t) -> 
            System.out.println(s + " schoene " + t);
      p.print("Hallo", "Welt");    // Hallo schoene Welt
   }
}
