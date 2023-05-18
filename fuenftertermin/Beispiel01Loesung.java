package fuenftertermin;

public class Beispiel01Loesung {
   public static void main(String[] args) throws ClassNotFoundException {
      try {
         Class.forName("xxx");  //Die Klasse xxx existiert nicht
      }
      catch (ClassNotFoundException e) {                    // hier wird nun ebenfalls die auftretende Exception gefangen
         System.out.println("Klasse nicht gefunden");
      }      
   }
}
