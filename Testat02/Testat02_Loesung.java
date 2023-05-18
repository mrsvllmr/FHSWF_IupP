package Testat02;

public class Testat02_Loesung {
   public static void main(String[] args) {
      printTanne1(5);
      printTanne2(10); 
      printTanne3(15);           
   }
   public static void printTanne1(int n) {
      for (int i = 0; i < n * 2; i += 2) {
         for (int j = n - i / 2 - 1; j > 0; j--)
            System.out.print(" ");
         for (int k = 0; k <= i; k++) 
            System.out.print("*");
         System.out.println();
      }
   }
   public static void printTanne2(int n) {
      int i=-1, j=0;
      while(i++<n){
         for(j=0;j<n-i;j++)
            System.out.print(" ");
         for(j=0;j<2*i-1;j++)
            System.out.print("*");
         System.out.println();
      }
   }

   public static void printTanne3(int... a) {
      if (a == null || a.length < 1)
         return;
      int n = a[0];
      int m = a.length > 1 ? a[1] : 0;
      if (n == 0) return;
      printTanne3(n-1,m+1);
      while (m-- > 0) System.out.print(" "); 
      n = 2*n - 1;
      while (n-- > 0) System.out.print("*"); 
      System.out.println();      
   }         
}
