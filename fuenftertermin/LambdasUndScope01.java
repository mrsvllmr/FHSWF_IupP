package fuenftertermin;

interface Executable {
   void exec();
}
public class LambdasUndScope01 {
   public static void main(String[] args) {
      int i = 10;
      int j = 20;
      Executable p = 
         () -> {
            int i = 20; //Kompilierfehler
            while(j > 0) j--; //Kompilierfehler
         };
      p.exec();
   }
}
