package zweitertermin;

class GoodCharacterLiterals {
   char a = 'a';
   char b = '�';       
   char letterN = '\u004E';
   char h = 0x3B;
   char i = 2589;
   char newLine = '\n';
   int N = 111;
   String s = "\u004E";
   
   void gibAus() {
       System.out.println(a);
       System.out.println(b);
       System.out.println(letterN);         // "N"
       System.out.println(h);               // ";"
       System.out.println(i);               // "?"
       System.out.println(newLine);         // Zeilenumbruch (2x)
       System.out.println('\u004E');          // referenziert die oben deklarierte Variable N -> Unicode-Escape-Sequenzen außerhalb von Strings sind also normale Bezeichner etc.
       System.out.println("Dies ist \u004E ein Test am Rande");
       System.out.println(s);
       System.out.println("funktio\u004Eiert");
       System.out.println("funktio"+letterN+"iert");
   }
   
   public static void main(String[] args) {
       GoodCharacterLiterals obj = new GoodCharacterLiterals();
       obj.gibAus();
   }
}
