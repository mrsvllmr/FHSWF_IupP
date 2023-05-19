package sechstertermin;

import java.util.concurrent.*;
public class Uebung01_Loesung { 
   public static void main(String[] args) {  
      ExecutorService pool = Executors.newCachedThreadPool();     	
      int cores = Runtime.getRuntime().availableProcessors();   
      System.out.println("Verfuegbare logische Prozessoren fuer die JVM: " + cores);
      for (int i=0;i<cores;i++)
         pool.execute(()-> {while(true){Math.random();}}); 
   }       
}
