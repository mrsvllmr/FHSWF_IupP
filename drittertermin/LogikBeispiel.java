package drittertermin;

class LogikBeispiel {
   public static void main(String[] args) {
      int k = 1;
      int i = 1;
      boolean b = false;
      b = (k > i++) && (k++ >= 0); //k wird nicht erh�ht 
      System.out.println(k);
      b = (k > i) || (k++ > 1); //k wird erh�ht 
      System.out.println(k);
   }
}
