package fuenftertermin;

public class Aufgabe_5_3 {
   public static void main(String[] args) {
      for (int i=1; i<=2; i++) {
         try {
            System.out.println("XXX" + i);
            machWas(i);
         } catch (NumberFormatException ex) {
            System.out.println("YYY");
         } finally {
            System.out.println("ZZZ");
         }
      }
   }
   public static void machWas(int n) {
      try {
         switch (n) {
            case 1: throw new NumberFormatException();
            case 2: throw new ArithmeticException();
         }
      } catch (ArithmeticException ex) {
         System.out.println("AAA");
      } finally {
         System.out.println("BBB");
      }
   }
}
