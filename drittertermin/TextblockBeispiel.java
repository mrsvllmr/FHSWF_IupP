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