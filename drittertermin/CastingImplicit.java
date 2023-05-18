package drittertermin;

class CastingImplicit {
   public static void main(String[] args) {
      long wertl = 1234567890;          // 1.234.567.890
      System.out.println(wertl);
      float wertf = wertl; //casting       Annahme:         1234567890,00
      System.out.println(wertf);           // 1.234568E9 -> 1234568000 -> d.h. hier wird gerundet (bei Cast von long zu float)
   }
}

