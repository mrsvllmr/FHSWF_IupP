package siebtertermin;

import java.lang.System.*;

public class Uebung3 {
   public static void main(String[] args) {
      System.out.println("Windows? " + isWindows());
   }
   public static boolean isWindows() {
      System.out.println(System.getenv("os"));
       if (System.getenv("os").equals("Windows_NT")){           // WICHTIGER REMINDER: equals() für Vergleiche von Zeichenketteninhalten; "==" vergleicht Referenzen!
          return true;
      }
      return false;
   }
}
