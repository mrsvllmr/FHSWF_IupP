package drittertermin;

public class IterationFalle {
   public static void main(String[] args) {
      for (int i = 0; i < 10; i++) {
         if (i == 6) i = 8;
         System.out.println(i);         
      }
   }
}
// Annahme: 0,1,2,3,4,5,8,9