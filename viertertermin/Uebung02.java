package viertertermin;

public class Uebung02 {
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
   public static void add(int... summanden) {
       if(summanden==null || summanden.length==0) return;
       int ergebnis = 0;
       for (int i=0; i<summanden.length;i++) {
           System.out.print(summanden[i]+(i<summanden.length-1?"+":"="));   // wenn noch nicht Ende der Liste, dann "+", sonst "="; wichtig: nur print
           ergebnis += summanden[i];
       }
       System.out.println(ergebnis);
   }
}