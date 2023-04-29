package drittertermin;

class Scope {
   public static void main(String[] args) {
      int w1 = 1;
      System.out.println("Wert 1 = " + w1);
      {
         int w2 = 2;
         System.out.println("Wert 2 = " + w2);
      }
      System.out.println("Wert 2 = " + w2);
   }
}
