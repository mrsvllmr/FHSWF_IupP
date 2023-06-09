package siebtertermin;

public class Uebung1 {
    
   public static void main(String[] args) {
      String test = "0xABC 0x126 0xxa 0abc 0xAaA 0x";
      for (String s : test.split(" "))
         System.out.println(s+" "+isHexIntLiteral(s));
   }
   
   public static boolean isHexIntLiteral(String s) {
       if (s.matches("0x[0-9A-Fa-f]+")) {
           return true;
       }
       return false;
   }
   
}

// return s != null && s.length() <= 10 && s.toLowerCase().matches("0x[0-9a-f]+");
/*
 * Warum?
 * - Übergebener String sollte nie null sein, da dann in jedem Fall kein HexLiteral
 * - Die Länge kann maximal 10 betragen: 0x bzw. 0X --> 2 Stellen + maximal 8 hexadezimale Ziffern (eine hexadezimale Ziffern braucht binär 4 Bits -> 4*8 = 32 Bits -> int-Größe)
 */
