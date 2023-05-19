package probeklausur;

public class aufgabe3
{
    public static void main(String[] args)
    {
        /*
         * Welche Ausgabe bewirken die folgende Anweisungen?
         * int e = 0, i = 0;
         * for(; i < 3; ++i) e += (i == 0 ? 8 : (e | i++));
         * System.out.println("2. for: " + e); 
         * e = 0; i = 0; 
         * while(i++ < 3) e += (i == 0 ? 1 : (e & ++i));
         * System.out.println("1. while: " + e); 
         */
        int e = 0, i = 0;
        for(; i < 3; ++i) e += (i == 0 ? 8 : (e | i++));    // WICHTIG: AKTUALISIERUNG IMMER AM ENDE DER ITERATION
        /*
         * Durchlauf 1: 
         * - Beginn: e=0, i=0
         * - e = e + 8 = 8
         * - Erhöhung von i = i + 1 = 1
         * Durchlauf 2:
         * - Beginn: e=8, i=1
         * - e = e + (00000000 00000000 00000000 00001000 | 00000000 00000000 00000000 00000001) = e + 00000000 00000000 00000000 00001001 = e + 9 = 17 sowie i = i + 1 = 2
         * - Erhöhung von i = i + 1 = 3 --> Abbruch der Schleife
         */
        System.out.println("2. for: " + e); // Ausgabe von "2. for: 17"
        e = 0; i = 0; 
        while(i++ < 3) e += (i == 0 ? 1 : (e & ++i));       // WICHTIG: i WIRD DURCH DAS POST-INKREMENT VOR SPRUNG IN DEN SCHLEIFENBLOCK BEREITS ERHÖHT (ANDERS ALS BEI DER FOR-SCHLEIFE!!!)
        /*
         * Durchlauf 1:
         * - Beginn: e=0, i=0
         * - e = e + 1 = 1 FEHLER, stattdessen: e = 00000000 00000000 00000000 00000000 & 00000000 00000000 00000000 00000010 = 00000000 00000000 00000000 00000000 = 0
         * - i = i + 1 + 1 = 2
         * Durchlauf 2:
         * - Beginn: e=0, i=2
         * - e = e + (00000000 00000000 00000000 00000000 & 00000000 00000000 00000000 00000100) = e + 0 = 0
         * - i = i + 1 + 1 = 4 --> Abbruch der Schleife
         */
        System.out.println("1. while: " + e); // Ausgabe von "1. while: 0"
    }
}
