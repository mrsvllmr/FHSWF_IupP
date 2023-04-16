package viertertermin;

class VariableLaenge {
   public static void main(String[] args) {
      int[] a = {1,2,3,4,5};
      System.out.println("Summe a: " + sum(a));
      System.out.println("Summe b: " + sum(6,7,8,9,10));      
   }
   static int sum(int... a) {
      int sum = 0;
      for (int j = 0;j < a.length;j++) sum += a[j]; 
      return sum; 
   }
}