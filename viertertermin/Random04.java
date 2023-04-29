package viertertermin;

public class Random04 {
   public static void shuffle(int... a) {
      if (a == null || a.length < 2)
         return;
      for(int i=a.length; i>1; i--) {
         int j = (int) (Math.random()*i);
         int temp = a[j];
         a[j] = a[i-1];
         a[i-1] = temp;
         print(a);
      } 
      return;
   }
   public static void print(int... a) {
      System.out.println();
      for (int k=0;k < a.length; k++)
         System.out.printf("%02d ",a[k]); 
   }
   public static void main(String[] args) {
      int[] a = new int[20];
      for(int i=0; i<a.length; i++)
         a[i] = i;
      print(a);
      shuffle(a);
      System.out.println();
      for(int i=0; i<a.length; i++)
         System.out.print(a[i] + " ");         
   }
}