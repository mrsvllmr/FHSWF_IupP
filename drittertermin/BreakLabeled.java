package drittertermin;

class BreakLabeled {
   public static void main(String[] args) {
      aussen:
      for(int i = 0;i < 5;i++) {
         for(int j = 0;j < 5;j++) {
            System.out.println("Schleife j");
            break aussen;
         }
         System.out.println("Schleife i");
      }
      System.out.println("Schluss");
   
   }
} 
// Annahme: "Schleife j" und "Schluss" werden je 1x erreicht