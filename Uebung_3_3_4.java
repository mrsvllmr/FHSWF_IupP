
/**
 * Beschreiben Sie hier die Klasse Uebung_3_3_3.
 * 
 * @author Marius Vollmer
 * @version 26.02.2023
 * 
 * Konstante PI wiederholt mit verschiedener Genauigkeit linksbündig ausgeben (immer eine Nachkommastelle mehr)
 */

import java.lang.Math;

public class Uebung_3_3_4
{
       public static void main(String[] args)
    {
        double PI = Math.PI;

        System.console().printf("%.1f%n",PI);
        System.console().printf("%.2f%n",PI);
        System.console().printf("%.3f%n",PI);
        System.console().printf("%.4f%n",PI);
        System.console().printf("%.5f%n",PI);
        System.console().printf("%.6f%n",PI);
        System.console().printf("%.7f%n",PI);
        System.console().printf("%.8f%n",PI);
    }
}
