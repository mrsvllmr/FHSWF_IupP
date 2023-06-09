
/**
 * Beschreiben Sie hier die Klasse Aufgabe41.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Aufgabe41
{
    public static double average(double... numbers) { 
        if (numbers == null || numbers.length == 0) 
        //Spaeter sinnvoller zu behandeln 
            throw new IllegalArgumentException(); 
            //return 0.0; 
        double total = 0.0; 
        for (int i = 0;i < numbers.length;i++) 
            total += numbers[i]; 
        return total / numbers.length; 
    } 
    
    public static void main(String[] args) { 
        double d1 = 10.0; 
        double d2 = 20.0; 
        double d3 = 30.0; 
        double d4 = 40.0; 
        System.out.println(average(d1, d2)); 
        System.out.println(average(d1, d2, d3));
        try {
            System.out.println(average());
        } catch (IllegalArgumentException e) {
            System.out.println("Sie haben keinen Wert eingegeben!");
        }
        System.out.println(average(d1, d2, d3, d4)); 
    }
}
