package drittertermin;

class Uebung_3_4 {
   public static void main(String[] args){
      int i = 1973;
      i += 30.2;                    // Annahme: i = 2003.2, weil impliziter Cast auf float 
                                    // FALSCH, weil += zudem implizit castet! --> Erst Addition, dann Cast auf ersten Datentyp
                                    // -> 2003
      System.out.println(i);        // Annahme: s.o.
      System.out.println(i---i);    // Annahme: 1, weil Wert - (sich selbst - 1)
      System.out.println((i=8)+1);  // Annahme: 9, weil erst Zuweisung und dann Addition
      System.out.println("A"+4+3);  // Annahme: "A43"
      System.out.println(4+3+"A");  // Annahme: "7A"         
   }
}
