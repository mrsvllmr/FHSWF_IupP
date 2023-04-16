package viertertermin;

class MeineKlasse02 {
   public static void main(String[] args) {
      int[] a = {1,2,3,4,5};
      System.out.println("Summe a: " + sum(a));
      int[] b = {6,7,8,9,10};
      System.out.println("Summe b: " + sum(b));      
   }
   static int sum(int[] a) { //DIES IST EINE METHODE
      int sum = 0;
      for (int j = 0;j < a.length;j++) sum += a[j]; 
      return sum; 
   }
}