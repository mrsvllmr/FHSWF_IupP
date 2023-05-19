package sechstertermin;

import java.util.concurrent.*;
public class Uebung02_Loesung { 
   private static void methodA() {
      while(true) {System.out.println("A");}
   }
   public static void methodB() {
      while(true) {System.out.println("B");}
   }
   public static void main(String[] args) throws Exception{    	
      ExecutorService pool = Executors.newCachedThreadPool();
      pool.execute(Uebung02_Loesung::methodA);  
      pool.execute(Uebung02_Loesung::methodB);  
   }       
}
