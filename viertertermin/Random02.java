package viertertermin;

public class Random02 {
   public static int selectRandom(int... a) {
      return a[(int) (Math.random()*a.length)];
   }
   public static void main(String[] args) {
      for(int i=0; i<10; i++)
         System.out.print(selectRandom(1,7,12,18,99)+" ");
   }
}