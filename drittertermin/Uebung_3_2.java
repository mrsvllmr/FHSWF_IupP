package drittertermin;

class Uebung_3_2 {
   public static void main(String[] args){
      int a = 3;
      int b = 5;
      System.out.println("b = " + b);           // Annahme: "b = 5"
      System.out.println(false & ++b == 0);     // Annahme: false, weil false & irgendwas false ergeben muss
      System.out.println("b = " + b);           // Annahme: "b = 6"
      System.out.println(a>b ? a : (b>3?1:2));  // Annahme: 1, weil vorab false und true
   }
}

