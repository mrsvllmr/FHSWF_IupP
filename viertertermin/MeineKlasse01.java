package viertertermin;

public class MeineKlasse01 {
   public static void main(String[] args) {
      int[] a = {1,2,3,4,5};
      int suma = 0;
      for (int j = 0;j < a.length;j++) suma += a[j];
      System.out.println("Summe a: " + suma);           // Annahme: 1+2+3+4+5=15
      int[] b = {6,7,8,9,10};
      int sumb = 0;
      for (int j = 0;j < b.length;j++) sumb += b[j];
      System.out.println("Summe b: " + sumb);           // Annahme: Analog mit anderem Array
   }
}