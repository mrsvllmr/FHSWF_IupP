package probeklausur;

public class aufgabe12
{
    public static void main(String[] args)
    {
        /*
         * Welche Ausgabe bewirken die folgende Anweisungen?
        
        int[] ia = {1,3,5,7,9};
        for(int x : ia) {
            for(int j = 0; j < 3; j++) {
                if(x > 4 && x < 8) 
                    continue;
                System.out.print(" " + x);
                if(j == 1) 
                    break;
                continue;
            }
            continue;
        }
        
        */

        int[] ia = {1,3,5,7,9};
        for(int x : ia) {
            for(int j = 0; j < 3; j++) {
                if(x > 4 && x < 8) 
                    continue;
                System.out.print(" " + x);
                if(j == 1) 
                    break;
                continue;
            }
            continue;
        }
        /*
         * Ausgabe von " 1"
         * Ausgabe von " 1"
         * Ausgabe von " 3"
         * Ausgabe von " 3"
         * Ausgabe von " 9"
         * Ausgabe von " 9"
         * 
         * FALSCH; BEACHTE: AUCH HIER KEIN ZEILENUMBRUCH!!!
         */
    }
}
