package viertertermin;

class LokaleVariable01 {
   public static void main(String[] args) {
      int a = 5;
      System.out.println(a);    // Annahme: 5
      aendere(a);
      System.out.println(a);    // Annahme: 5, weil sich Originalwert von a nicht ändert (call by value, Übergabe von Kopie)
   }
   static void aendere(int a) {
      a = 10; 
      return; 
   }
} 
