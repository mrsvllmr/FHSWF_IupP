package sechstertermin;

public class Wrapperklasse04 {
   public static void main(String[] args) {
      int i = 0x24b62;
      System.out.println(Character.isLetter(i));        // true                                     -> ist also Buchstabe
      System.out.println(Character.getName(i));         // CJK UNIFIED IDEOGRAPHS EXTENSION B 24B62 -> interner Name des Zeichens
      char high = Character.highSurrogate(i);               // 0xd852
      char low = Character.lowSurrogate(i);                 // 0xdf62
      String s = String.valueOf(Character.toChars(i));      
      System.out.println(s);                            // ?
      String s1 = "\ud852\udf62";
      String s2 = String.valueOf(new char[]{high,low});  
      System.out.println(s.equals(s1));                 // true
      System.out.println(s.equals(s2));                 // true 
      System.out.println(s1.equals(s2));                // true
   }
}