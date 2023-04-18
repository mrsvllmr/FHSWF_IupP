package sechstertermin;

import java.io.*;
import java.nio.file.*;
import java.nio.charset.Charset;
public class Files01 {

   public static String KODIERUNGEN = 
   "US-ASCII UTF-8 UTF-16 UTF-32 " +
   "windows-1251 windows-1252 windows-1253 windows-1254 " +
   "ISO-8859-1 ISO-8859-2 ISO-8859-15 ISO-8859-16";
 
   public static void main(String[] args) throws IOException {
   
      System.out.println("Standardkodierung: " + 
         System.getProperty("file.encoding"));
   
      for (String name : KODIERUNGEN.split(" ")) {
         System.out.println("\nKodierung: " + name + "\n");      
         try {
            Files.lines(Paths.get("test.txt"),Charset.forName(name))
               .forEach(System.out::println);
         } catch (Throwable e) {
            System.out.println("-> Funktioniert nicht");        
         }
      } 
      
   }
}