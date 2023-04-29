package viertertermin;

public class Random03 {
   public static void shuffle(int... a) {
      if (a == null || a.length < 2)
         return;
      for(int i=a.length; i>1; i--) {
         int j = (int) (Math.random()*i);
         int temp = a[j];
         a[j] = a[i-1];
         a[i-1] = temp;
      } 
      return;
   }
   public static void main(String[] args) {
      int[] a = new int[20];
      for(int i=0; i<a.length; i++)
         a[i] = i;
      shuffle(a);
      for(int i=0; i<a.length; i++)
         System.out.print(a[i] + " ");         
   }
}