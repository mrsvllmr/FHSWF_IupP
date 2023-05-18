
/**
 * Beschreiben Sie hier die Klasse Uebung_3_3_3.
 * 
 * @author Marius Vollmer
 * @version 26.02.2023
 * 
 * Konstante PI wiederholt mit verschiedener Genauigkeit linksbündig ausgeben (immer eine Nachkommastelle mehr)
 */

import java.lang.Math;

public class Uebung_3_3_1
{
       public static void main(String[] args)
    {
        System.out.println(6/4*2.0);          // 2.0 (weil 1 x 2.0)
        System.out.println((int) 6/4.0*3);    // 4.5 (weil 6.0/4.0=1.5 .. x3=4.5)
        System.out.println((int) (6/4.0*3));  // 4   (weil (int)4.5=4)
        System.out.println(3*5+8/3%4*5);      // 25  (weil 3x5=15 .. 8/3=2 .. 2%4=2 .. 2x5=10 -> 15+10)
    }
}
