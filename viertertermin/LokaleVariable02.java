package viertertermin;

class LokaleVariable02 {
   public static void main(String[] args) {
      int[] a = {5};
      System.out.println(a[0]);
      aendere(a);
      System.out.println(a[0]);   
   }
   static void aendere(int[] a) {
      a[0] = 10; 
      return; 
   }
} 
