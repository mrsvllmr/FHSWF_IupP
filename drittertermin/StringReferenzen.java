package drittertermin;

class StringReferenzen {
   public static void main(String[] args){
      String s1 = "Rainald";
      String s2 = "Rainald";
      String s3 = "Schöneberg";
      String s4 = "Rainald Schöneberg";
      System.out.println(s1 == s2);                     // Annahme: true, weil identisch (gleiche String-Pool-Referenz)
      System.out.println((s2 + " " + s3) == s4);        // Annahme: false, weil andere Referenzen in den Heap
   }
}
