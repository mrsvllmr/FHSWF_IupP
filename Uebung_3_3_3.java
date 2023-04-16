
/**
 * Beschreiben Sie hier die Klasse Uebung_3_3_3.
 * 
 * @author Marius Vollmer
 * @version 26.02.2023
 * 
 * erste 50 natürliche Zahlen
 * A -> durch 3 teilbar
 * B -> durch 5 teilbar
 * C -> durch 7 teilbar
 * nach jeder Ausgabe Zeilenumbruch
 */
public class Uebung_3_3_3
{
       public static void main(String[] args)
    {
        int a = 3;
        int b = 5;
        int c = 7;
        
        for(int i = 1; i <= 50; i++) {
            if (i % a == 0) {
                System.out.println(i + " A");
            } else if (i % b == 0) {
                System.out.println(i + " B");
            } else if (i % c == 0) {
                System.out.println(i + " C");
            } else {
                System.out.println(i);
            }
        }
    }
}
