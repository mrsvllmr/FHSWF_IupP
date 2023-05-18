package viertertermin;

public class Random01 {
   public static int nextInt(int n) {
      return (int) (Math.random()*n);               // 0 bis (n-1) (da 1 exkludiert)
   }
   
   public static void main(String[] args) {
      System.out.println("Zufall 0 - 9: " + nextInt(10));
      System.out.println("Zufall 0 - 9: " + nextInt(10));
      System.out.println("Zufall 0 - 9: " + nextInt(10));            
   }
}