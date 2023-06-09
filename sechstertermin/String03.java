package sechstertermin;

import java.util.regex.*;
public class String03 {
   public static void main(String[] args) {
      System.out.print("\"aaaab\".matches(\"a*b\") ist ");
      System.out.println("aaaab".matches("a*b"));               // true, weil kein oder mehrere a gefolgt von b
   
      System.out.print("\"b\".matches(\"a*b\") ist ");
      System.out.println("b".matches("a*b"));                   // true, weil kein oder mehrere a gefolgt von b
   
      System.out.print("\"a\".matches(\".\") ist ");
      System.out.println("a".matches("."));                     // true, weil einzelnes Zeichen
   
      System.out.print("\"abc\".matches(\".\") ist ");
      System.out.println("abc".matches("."));                   // false, weil kein einzelnes Zeichen
   
      System.out.print("\"abc\".matches(\".*\") ist ");
      System.out.println("abc".matches(".*"));                  // true, weil keins oder mehrere beliebige Zeichen
      
      System.out.print("\"2nnp\".matches(\".n{1,3}\") ist ");
      System.out.println("2nnp".matches(".n{1,3}"));            // false, weil mindestens 1 und höchstens 3 Zeichen
   
      System.out.print("\"2ybcd\".matches(\"2[xyz].+\") ist ");
      System.out.println("2ybcd".matches("2[xyz].+"));          // true, weil 2 gefolgt von (x oder y oder z) gefolgt von mindestens irgendeinem Zeichen
   
      System.out.print("\"2bkbv\".matches(\".+[abc][zv].*\") ist ");
      System.out.println("2bkbv".matches(".+[abc][zv].*"));     // true, weil mindestens ein beliebiges Zeichen gefolgt von (a oder b oder c) gefolgt von (z oder v) gefolgt von keinem oder mehreren beliebigen Zeichen
                                                                // "2kb" hier von .+ abgedeckt!
      
      System.out.print("\"1+1\".matches(\"1+1\") ist ");
      System.out.println("1+1".matches("1+1"));                 // false, weil mindestens eine 1 gefolgt von 1
      
      System.out.print("\"1+1\".matches(\"1\\\\+1\") ist ");
      System.out.println("1+1".matches("1\\+1"));               // true, weil 1+1 
                                                                // durch \\ ist das "+" ohne Bedeutung
   }
}