package viertertermin;

public class RekursionBeispiel{
   public static void main(String[] args){
      rekursion(5);
   }
   
   private static void rekursion(int a){
      a--;
      System.out.println("["+a+"]");
      if (a > 0) rekursion(a);
      System.out.println("["+a+"]");
   }
}

// Annahme: [4], [3], [2], [1], [1], [2], [3], [4]
// FALSCH, da [0] auch 2x ausgegeben wird!!!