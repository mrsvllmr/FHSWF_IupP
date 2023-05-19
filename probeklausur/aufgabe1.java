package probeklausur;

public class aufgabe1
{
    public static void main(String[] args)
    {
        int e = 0, i = 0;
        for(; i < 3; i++) e += (i == 0 ? 1 : (e & ++i));        
        /*
         * for-Schleife ohne Initialisierung
         * Durchlauf 1: 
         * - i ist kleiner als 3, daher Erhöhung von i nach Durchlauf
         * - e wird erhöht um: i ist zu dem Zeitpunkt gleich 0, also wird die 1 "gewählt" -> e=1
         * - i wird um 1 auf 1 erhöht -> i=1
         * Durchlauf 2:
         * - i ist kleiner als 3, daher Erhöhung von i nach Durchlauf 
         * - e wird erhöht: i ist nicht mehr gleich 1, daher e (00000000 00000000 00000000 00000001) & ++i (00000000 00000000 00000000 00000010) -> 00000000 00000000 00000000 00000000 -> e=1+0=1
         * - i wird um 1 auf 3 erhöht -> i=3
         * Durchlauf 3: 
         * - i ist nicht mehr kleiner als 3, daher Abbruch der Schleife
         */
        System.out.println("1. for: " + e); // Ausgabe von "1. for: 1"
        e = 0; i = 0;
        do {e += (i == 0 ? 8 : (e | i++));} while(++i < 3);
        /*
         * Durchlauf 1: e = e + 8 = 8 -> e=8 und i=1; da i=1<3 weiterer Durchlauf
         * Durchlauf 2: e = e + (00000000 00000000 00000000 00001000 | 00000000 00000000 00000000 00000001) = e + 00000000 00000000 00000000 00001001 = e + 9 = 17 -> e=17 und i=i+1+1=3 -> da i=3 nicht mehr kleiner als 3, Abbruch der Schleife
         */
        System.out.println("2. do while: " + e); // Ausgabe von "2. do while: 17"
    }
}
