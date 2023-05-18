package drittertermin;

class Signifikanz {
   public static void main(String[] args) {
      float f = 1.3000001f;
      float g = 1.30000001f;     
      float h = 1.300000001f; 
      System.out.println(f); 
      System.out.println(g);   // --> weil mehr als 7 Nachkommastellen, Rundung auf 1.3
      System.out.println(h);   // --> weil mehr als 7 Nachkommastellen, Rundung auf 1.3
   }
}
