package viertertermin;

public class Uebung02_Loesung {
   public static void main(String[] args) {
      int n1=1;
      int n2=2;
      int n3=3;
      int n4=4;
      int n5=5;
      int n6=6;
      add();
      add(n1);
      add(n1,n2);
      add(n1,n2,n3);
      add(n1,n2,n3,n4,n5);	
      add(n1,n2,n3,n4,n5,n6);
   }
   public static void add(int... a) {
      if (a == null || a.length == 0) return;
      int sum = 0;
      for (int i=0;i<a.length;i++) {
         System.out.print(a[i]+(i<a.length-1?"+":"="));
         sum += a[i];
      }
      System.out.println(sum);
   }
}