package viertertermin;

class LokaleVariable02 {
   public static void main(String[] args) {
      int[] a = {5};
      System.out.println(a[0]);     // Annahme: 5
      aendere(a);
      System.out.println(a[0]);     // Annahme: 10, weil dieses Mal Referenzdatentyp übergeben wurde (und damit Einfluss auf Aufrufer gegeben)
   }
   static void aendere(int[] a) {
      a[0] = 10; 
      return; 
   }
} 
