package Testat02;


/**
 * Klasse Tannenbaum, die die geforderte Ausgabe des zweiten Testats erzeugen soll.
 * 
 * @author Marius Vollmer
 * @version 16.04.2023
 */
public class Tannenbaum
{
    public static void main(String[] args) {        
        // Schleife für Bäume
        // Im ersten Durchlauf ist Mitte an 5. Stelle, dann jeweils um 5 erhöhen
        for (int mitte=5; mitte<=15; mitte+=5) {
            // Schleife für Zeilen
            // Anzahl stimmt mit Stelle der Mitte überein
            for(int i=0; i<mitte; i++) {
                // Schleife innerhalb der Zeile
                // Doppelte Anzahl an Stellen im Vergleich zu Zeilen
                for(int j=0; j<mitte*2; j++) {
                    // Wenn Position um max. i von Mitte abweicht, dann "*", sonst " "
                    // Zudem: "-1" um sicherzustellen, dass Baum direkt am linken Rand beginnt
                    if (Math.abs(mitte-j-1)<=i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");    
                    }
                }
                System.out.println("");
            }
            // System.out.println("Ausgabe nur um zu sehen, wo Zeile beginnt.");
        }
    }
}
