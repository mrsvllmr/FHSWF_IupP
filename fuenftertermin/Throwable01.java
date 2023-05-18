package fuenftertermin;

class Throwable01 {
   public static void main (String[] args) {
      doStuff();
   }
   
   static void doStuff() { 
      doMoreStuff();
   }
   
   static void doMoreStuff() {
      int i = 1;
      int j = 0;
      int k = i/j; //Division durch Null
   }
}
// ArithmeticException tritt auf und wird nirgendwo gefangen oder behandelt, daher Programmabbruch