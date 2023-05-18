package viertertermin;

class GenerischeMethoden01 {
  public static <T> T werfeMuenze(T m, T n) {
    return Math.random() < 0.5 ? m : n;
  }
  
  public static void main(String[] args) {
    String s = werfeMuenze("BVB","S04");            // hier Aufruf mit Strings
    System.out.println(s);   
    
    int i = werfeMuenze(12,4711);                   // hier Aufruf mit Integern
    System.out.println(i);  
    
    double d = werfeMuenze(12.0,3.14);              // hier Aufruf mit Doubles
    System.out.println(d);      
  }
}

