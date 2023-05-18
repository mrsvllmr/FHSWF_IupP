package viertertermin;

class Uebung01 {
   public static void main(String[] args) {
      m1(7,8);
      m2(7,8);      
   }
   
   public static void m1(int a, int b) {
      System.out.println("int, int");
   }
   
   public static void m1(int... arr) {
      System.out.println("int...");
   }
   
   public static void m2(double a, double b) {
      System.out.println("double, double");
   }
   
   public static void m2(int... arr) {
      System.out.println("int...");
   }
}

// Annahme: m1 ohne Serie --> "int, int"
// Annahme: m2 ohne Serie --> "double, double"

// -> Erkenntnis/Reminder: Wenn "klassische" Alternative vorhanden, dann wird diese ausgeführt und nicht die Serie!