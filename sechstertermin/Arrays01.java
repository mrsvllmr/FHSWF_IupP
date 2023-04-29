package sechstertermin;

import java.util.*;
public class Arrays01 {

   public static final String KODIERUNGEN = 
   "US-ASCII UTF-8 UTF-16 UTF-32 " +
   "windows-1251 windows-1252 windows-1253 windows-1254 " +
   "ISO-8859-1 ISO-8859-2 ISO-8859-15 ISO-8859-16";
 
   public static void main(String[] args){
      String[] kodierungen = KODIERUNGEN.toUpperCase().split("\\s+");
      System.out.println(Arrays.toString(kodierungen));
      Arrays.sort(kodierungen);
      System.out.println(Arrays.toString(kodierungen));
      Arrays.stream(kodierungen)
         .filter(s -> s.matches("ISO-8859-[1-9]")) 
         .forEach(System.out::println);  
   }
}