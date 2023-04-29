package sechstertermin;

import java.util.stream.*;
public class String02 {

   public static final String LOREMIPSUM = "Lorem ipsum dolor sit amet, " +
   "consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt " +
   "ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero " +
   "eos et accusam et justo duo dolores et ea rebum. Stet clita kasd " + 
   "gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.";
   
   public static void main(String[] args) {
      int count = 0;
      int i = 0;
      String s = LOREMIPSUM.toLowerCase();
      while (i < s.length()) {
         char c = s.charAt(i++);
         if (c >= 'a' && c <= 'z') count++;         
      }
      System.out.println("Anzahl Buchstaben A-Z: " + count);
      
      System.out.println("Anzahl Worte: " +
         Stream
         .of(s.replace(",","").replace(".","").split(" "))
         .filter(wort -> wort.length() > 0)
         .count()
         );
   }
}