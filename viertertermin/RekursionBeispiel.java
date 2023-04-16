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
