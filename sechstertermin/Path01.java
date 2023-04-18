package sechstertermin;

import java.nio.file.*;
public class Path01 {
   public static void main(String[] args) {
      Path p = Paths.get("C:","Users","Rainald","Documents","ausgabe.txt");
      System.out.println(p.getFileName().toString());
      System.out.println(p.getParent().toString());
      System.out.println(p.getNameCount());
      System.out.println(p.isAbsolute());
      System.out.println(p.normalize().toString());
      System.out.println(p.toString());      
   }
}