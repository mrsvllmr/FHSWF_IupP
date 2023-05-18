package drittertermin;

class InkrementBeispiel {
   public static void main(String[] args) {
      int [][] intArr = {{1},{1,2},{1,2,3}};
      int i = 1, j = 0;
      System.out.println(intArr[i++][++j]); // Annahme: "2" (zweite Zeile, zweite Spalte)
   }
}
