package viertertermin;

class GenerischeMethoden02 {
   static <T> T werfeMuenze(T m, T n) {
      System.out.print("Generisch: ");
      return Math.random() < 0.5 ? m : n;
   }
   
   static int werfeMuenze(int m, int n) {
      System.out.print("Primitiv: ");
      return Math.random() < 0.5 ? m : n;
   }  
   
   public static void main(String[] args) {
    String s = werfeMuenze("BVB","S04");
    System.out.println(s);
    
    int i = werfeMuenze(12,4711);               // Hier primitiv, da "klassische" Alternative vorhanden
    System.out.println(i); 
    
    double d = werfeMuenze(12.0,3.14);  
    System.out.println(d);         
   }
}


