package fuenftertermin;

interface Executable {
   void exec();
}
public class LambdasUndScope02 {
   private void action() {
      Executable p = 
         new Executable() {
            public void exec() {
               System.out.println(this instanceof Executable);      
            }
         };
      p.exec();
      Executable q = 
         () -> System.out.println(this instanceof Executable);
      q.exec();
   }  
   public static void main(String[] args) {
      new LambdasUndScope02().action();
   }
}

