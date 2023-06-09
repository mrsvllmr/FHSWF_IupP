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
   
   
   static int testint = elf_b;              // -> man kann problemlos einer int-Variable einen byte-Wert zuordnen
   static int testint2 = 0b00001011;        // siehe Zeile zuvor, nur hier durch direkten Wert (statt über Bezeichner)
   static byte testbyte = (byte)-256;       // ergibt wieder 0 --> result = (value % (upperBound + 1))
   
   static int testhex = 0x000F;                // man darf auch nur eine Hex-Ziffer angeben; diese entspricht dann 16^0
   static int testhex2 = (int)0xFFFFFFFFFL;           // man darf NATÜRLICH auch mehr als 4 Hex-Ziffern angeben (so viele, wie in die 32 int Bits passen; ODER AUCH MEHR, WENN BSPW. ZUNÄCHST LONG)
   
   static int testbin = 0b100001011;        // man darf NATÜRLICH auch mehr als 8 Bin-Ziffern angeben
   static int testbin2 = (int)0b1_11111111_11111111_11111111_11111111L;        // man darf NATÜRLICH auch mehr als 8 Bin-Ziffern angeben
                                                                               // ohne L funktioniert das hier nicht, weil dann zunächst als int interpretiert wird und für int sind es zu viele Bits!
   static byte data = (byte)0b1_1111_1111_1111;
   
   static void gibAus() {
       System.out.println(elf_d);
       System.out.println(gross);
       System.out.println(elf_b);
       System.out.println(acht);
       System.out.println(x);
       System.out.println(y);
       System.out.println(z);
       
       System.out.println("Letzte Tests");
       System.out.println(testint==testint2);
       System.out.println(testbyte);
       System.out.println(testhex);
       System.out.println(testhex2);
       System.out.println(testbin);
       System.out.println(testbin2);
       System.out.println(data);
   }
   public static void main(String[] args) {
       gibAus();
   }
}
