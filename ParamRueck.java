
/**
 * Beschreiben Sie hier die Klasse ParamRueck.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ParamRueck
{
    public static void main(String[] args) {
        short s = 5;
        int t = ichBekommeWasZuKleines(s);
    }
    
    public static int ichBekommeWasZuKleines(int a) {
        short b = (short) a;
        return b;
    }
}
