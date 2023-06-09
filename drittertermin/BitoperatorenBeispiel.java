package drittertermin;

class BitoperatorenBeispiel { 
   public static void main(String[] args) { 
      int a = -26;                      // 00011010 -> 11100101 --> 11100110 (Zweierkomplement - invertieren und 1 addieren)
      int b = 2;                        //                          00000010
      System.out.println(~a);           // Annahme: 00011001 -> dezimal 25
      System.out.println(a&b);          // Annahme: 00000010 -> dezimal 2
      System.out.println(a|b);          // Annahme: 11100110 -> dezimal negativ --> 00011001 --> 00011010 --> dezimal 26 --> -26 (negativ!)
      System.out.println(a^b);          // Annahme: 11100100 -> dezimal negativ ... -28
      System.out.println(a>>b);         // Annahme: 11111001 -> dezimal negativ ... -7
      System.out.println(a>>>b);        // Annahme: 00111001 -> dezimal 57      ... 1073741817
                                        // FALSCH: a schon verschoben, s.o.; 00111110
      System.out.println(a<<b);         // Annahme: 10011000 -> dezimal negativ ... -104
      
      int c = 1;
      int d = 1;
      System.out.println(c<<0);
      System.out.println(c<<d);
      System.out.println(c<<d);         // Erkenntnis: c wird bei dem ersten Bitshift nicht verändert, d.h. diese Verschiebung hat den gleichen Ausgangswert
      
      System.out.println("\nMV Tests"); // Fazit: Durch die folgenden Verschiebungen wird a also nicht nachhaltig, sondern nur für/während der Ausgabe verändert
      int testVorher = 1;
      System.out.println(testVorher); 
      System.out.println(testVorher>>2); 
      System.out.println(testVorher); 
      System.out.println(testVorher<<2); 
   } 
}
// 00000000 00000000 00000000 00011010 -> +26
// 11111111 11111111 11111111 11100101
// 11111111 11111111 11111111 11100110 -> -26

// 11111111 11111111 11111111 11111001 -> 00000000 00000000 00000000 00000110 -> 00000000 00000000 00000000 00000111 -> -7
// 00111111 11111111 11111111 11111110 -> 11000000 00000000 00000000 00000001 -> 11000000 00000000 00000000 00000010 -> 