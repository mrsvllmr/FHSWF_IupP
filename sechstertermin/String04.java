package sechstertermin;

import java.util.regex.*;
public class String04 {
   public static void main(String[] args) {
      String[] r = "1x2x3x4x5".split("x");   
      String[] s = "1\\2\\3\\4\\5".split("\\\\");   
      String[] t = "1.2.3.4.5".split("\\.");
   }
}