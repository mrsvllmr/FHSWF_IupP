package probeklausur;

public class aufgabe7
{
    public static void main(String[] args)
    {
        /*
         * Welchen Wert hat x nach Ausführung folgender Anweisungen?
         * boolean x; 
         * boolean y = false; 
         * int a = 10;
         * x = y || ((a % 2 == 0) && (! (a < 0)));
         */
        boolean x;                              // Initialisierung ist false
        boolean y = false; 
        int a = 10;
        x = y || ((a % 2 == 0) && (! (a < 0))); // x wird hier false zugewiesen || ( true && true ) -> true ... durch ODER letztlich true
        
        System.out.println(x);
    }
}
