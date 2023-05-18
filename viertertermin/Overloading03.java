package viertertermin;

class Overloading03 {
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
   
   public static void main(String[] args) {
      m1(7,8);                                  // Erwartung: "int, int", weil passende "klassische" Alternative
      m2(7,8);                                  // Erwartung: "int...", weil int besser passt als double, double
                                                // FALSCH - Hier wird "double, double" ausgegeben
                                                // REMINDER: Empfehlung ist, Overloading nicht bei Serien zu nutzen
   }
}