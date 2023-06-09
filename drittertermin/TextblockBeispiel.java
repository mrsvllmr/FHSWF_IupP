package drittertermin;

class TextblockBeispiel { 
   public static void main(String[] args) { 
      String s = "A\n  B\nC\n"; 
      String t = """
      A
        B
      C
      """; 
      System.out.println(s == t);
   } 
}
/*
 * Annahme:
 * A
 *   B
 * C
 * 
 * true, da die Zeichenketten identisch sind 
 * --> FALSCH, aber nur weil die Buchstaben im Textblock noch zusätzlich anders eingerückt waren
 * --> wenn Einrückung herausgenommen, dann sind s und t identisch
 */