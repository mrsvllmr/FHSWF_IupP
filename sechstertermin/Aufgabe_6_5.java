package sechstertermin;

import java.nio.file.*;
import java.nio.charset.*;
import java.util.stream.*;
public class Aufgabe_6_5 {
   public static void toHex(String path) {
      try {
         Files.lines(Paths.get(path),Charset.forName("Cp1252"))
            .limit(1)
            .forEach(
            first -> {
               for (int i : first.substring(0,2).toCharArray())
                  System.out.print(Integer.toHexString(i));
            });
      }
      catch (Exception e) {
         e.printStackTrace();
      }
   }
   public static void main(String[] args){	
      toHex("Aufgabe_6_5.class");
   } 
}
