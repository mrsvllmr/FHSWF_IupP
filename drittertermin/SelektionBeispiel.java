package drittertermin;

class SelektionBeispiel {
   public static void main(String[] args) {
      int result = 0;
      int divisor = 7;
      int number = 0;
      number = Integer.parseInt(args[0]); //Zahl aus dem Aufruf übernehmen --> Bei Eingabe 8:
      if (number > 0) {
         result = number % divisor; //ganzzahligen Divisionsrest berechnen --> 1
         switch(result) {
            case 0:
               System.out.println("Die Zahl ist durch 7 teilbar.");
               break;
            case 1:
               System.out.println("Der Divisionsrest betraegt 1.");             // s.o., weil 1
               break;
            case 2:
               System.out.println("Der Divisionsrest betraegt 2.");
               break;
            default:
               System.out.println("Der Divisionsrest ist groesser als 2.");     // Erkenntnis: Wird nur ausgeführt, wenn kein case zutrifft!
         }
      }
   }
}
