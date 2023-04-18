package sechstertermin;

import java.util.*;
public class Aufgabe_6_1 {

   public static boolean istPalindromIter(String p) {
      if (p == null || p.length() < 2)
         return true;
      p = p.toLowerCase();    
      int length = p.length();
      for (int i = 0;i < length/2;i++)
         if (p.charAt(i) != p.charAt(length-i-1)) 
            return false;
      return true;    
   }
   
   public static boolean istPalindromRekur(String p) {
      if (p == null || p.length() < 2)
         return true;
      Character c1 = Character.toLowerCase(p.charAt(0));
      Character c2 = Character.toLowerCase(p.charAt(p.length()-1));      
      return c1 != c2 ? false :
            istPalindromRekur(p.substring(1,p.length()-1));
   }
 
   public static void main(String[] args){
      System.out.println(istPalindromIter("Lagerregal"));
      System.out.println(istPalindromRekur("Lagerregal")); 
   }
}