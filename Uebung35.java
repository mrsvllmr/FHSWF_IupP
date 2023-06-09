
/**
 * Beschreiben Sie hier die Klasse Uebung35.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Uebung35
{
    public static void main(String[] args) {
        System.out.println(hoechsteN());
    }
    
    public static long hoechsteN() {
        long fak = 1;
        long fakNeu = 1;
        int zaehler = 1;
        do {
            fak = fakNeu;
            fakNeu *= (zaehler+1);
            zaehler += 1;
            System.out.println(zaehler+"     Fak = "+fak+"     FakNeu = "+fakNeu);
        } while (fakNeu > fak);
        
        return zaehler-1;
    }
}
