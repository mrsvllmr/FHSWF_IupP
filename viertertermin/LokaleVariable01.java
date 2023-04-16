package viertertermin;

class LokaleVariable01 {
   public static void main(String[] args) {
      int a = 5;
      System.out.println(a);
      aendere(a);
      System.out.println(a);   
   }
   static void aendere(int a) {
      a = 10; 
      return; 
   }
} 
