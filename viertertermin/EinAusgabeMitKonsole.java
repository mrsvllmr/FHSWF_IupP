package viertertermin;

public class EinAusgabeMitKonsole {
   public static void main(String[] args) {
      int a, b;
      if (System.console() == null) {
         System.out.println("Konsolenfenster nicht verfügbar.");
      } else {
         a = Integer.parseInt(
            System.console().readLine("%s: ","Erste Zahl")
            );
         b = Integer.parseInt(
            System.console().readLine("%s: ","Zweite Zahl")
            ); 
         System.console().printf("%d + %d = %d",a,b,a+b); 
      }
   }
}