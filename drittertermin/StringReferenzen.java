package drittertermin;

class StringReferenzen {
   public static void main(String[] args){
      String s1 = "Rainald";
      String s2 = "Rainald";
      String s3 = "Sch�neberg";
      String s4 = "Rainald Sch�neberg";
      System.out.println(s1 == s2); 
      System.out.println((s2 + " " + s3) == s4);   
   }
}
