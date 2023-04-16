package Testat01;


/**
 * Bei einem float-Wert sind in Java nur etwa 7 signifikante Dezimalstellen 
 * garantiert. Folglich kann ein Java-Programm den float-Wert 1.0f bei 
 * fortgesetzter Halbierung (1.0f, 0.5f, 0.25f, …) irgendwann nicht mehr 
 * von 0.0f unterscheiden. 

 * Bestimmen Sie mit einem Testprogramm die Anzahl der fortgesetzten Halbierungen 
 * bei der dies zum ersten Mal auftritt.
 * 
 * @author Marius Vollmer
 * @version 11.04.2023
 */
public class floatSignifikanz
{
    public static void main(String[] args) {
        float startwert = 1.0f;
        int iterationen = 0;

        while (startwert > 0.0f) {
            startwert /= 2.0f;
            iterationen++;

            if (startwert == 0.0f) {
                System.out.println("Nach " + iterationen + " Halbierungen wurde der Startwert zu 0.0f");
            }
        }

        System.out.println("Der Wert konnte nach " + iterationen + " Halbierungen nicht mehr von 0.0f unterschieden werden");
        
    }
}
