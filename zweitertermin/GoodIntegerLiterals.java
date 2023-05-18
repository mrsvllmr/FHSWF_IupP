package zweitertermin;

class GoodIntegerLiterals {
   //Dezimal
   static int elf_d = 11;                  // 11
   static long gross = 1_111_000_000;      // 1111000000
   //Binaer
   static byte elf_b = 0b00001011;         // 11
   //Oktal
   static int acht = 010;                  // 8
   //Hexadezimal
   static int x = 0X0001;                  // 1
   static int y = 0xffF;                   // 15*16^0 + 15*16^1 + 15*16^2
   static long z = 0xFFFFFFFFFFL;          // ...
   static void gibAus() {
       System.out.println(elf_d);
       System.out.println(gross);
       System.out.println(elf_b);
       System.out.println(acht);
       System.out.println(x);
       System.out.println(y);
       System.out.println(z);
   }
   public static void main(String[] args) {
       gibAus();
   }
}
