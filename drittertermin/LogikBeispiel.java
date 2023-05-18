package drittertermin;

class LogikBeispiel {
   public static void main(String[] args) {
      int k = 1;                                                // k=1
      int i = 1;                                                // i=1
      boolean b = false;
      b = (k > i++) && (k++ >= 0); //k wird nicht erhöht        // k=1, weil zweiter Ausdruck durch && erst gar nicht ausgewertet wird!!! .. i=2
      System.out.println(k);                                    // Annahme: "1"
      b = (k > i) || (k++ > 1); //k wird erhöht                 // Annahme: k=2, weil || nun ausgewertet wird, da der zweite Ausdruck ja noch true liefern kann
      System.out.println(k);                                    // Annahme: "2"
   }
}
