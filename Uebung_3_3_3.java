
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
            System.out.print(i);
            if (i % a == 0) {
                System.out.print(" A");
            }
            if (i % b == 0) {
                System.out.print(" B");
            }
            if (i % c == 0) {
                System.out.print(" C");
            }
            System.out.println();
        }
    }
}
//Nachträglicher Hinweis: So wird nicht gewünschte Ausgabe erzielt!
//Erst nur Zahl ausgeben, dann die ggf. passenden Divisoren, dann den Zeilenumbruch separat
