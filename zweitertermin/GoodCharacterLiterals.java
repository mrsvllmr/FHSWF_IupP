package zweitertermin;

class GoodCharacterLiterals {
   char a = 'a';
   char b = '�';       
   char letterN = '\u004E';
   char h = 0x3B;
   char i = 2589;
   char newLine = '\n'; 
   
   void gibAus() {
       System.out.println(a);
       System.out.println(b);
       System.out.println(letterN);
       System.out.println(h);
       System.out.println(i);
       System.out.println(newLine);
   }
   
   public static void main(String[] args) {
       GoodCharacterLiterals obj = new GoodCharacterLiterals();
       obj.gibAus();
   }
}
