package sechstertermin;

import java.util.concurrent.*;
public class Uebung01 { 
   public static void main(String[] args) {  
      int cores = Runtime.getRuntime().availableProcessors();   
      System.out.println("Verfuegbare logische Prozessoren fuer die JVM: " + cores);
      while(true){Math.random();} 
   }       
}
