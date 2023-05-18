package zweitertermin;

class StringBeispiele {
   public static void main(String[] args){
      String s = "Hallo";
      String t = "Ha"; 
      t = t + "llo"; 
      System.out.println(s == t); // false
                                  // weil String-Variable beteiligt und String-Objekte unveränderlich Neuanlage eines String-Objektes auf dem Heap 
                                  // -> keine Beteiligung des String-Pools
   }
}
