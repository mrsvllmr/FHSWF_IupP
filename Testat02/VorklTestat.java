package Testat02;


/**
 * Beschreiben Sie hier die Klasse VorklTestat.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class VorklTestat
{
    public static void printTanne(int n) {
        
        for(int zeile=0; zeile<n; zeile++) {
            for(int leerzeichen=0; leerzeichen<n-zeile-1; leerzeichen++) {  // 5-0-1=4 --> <4 --> 0,1,2,3 (ohne "-1" also ein Leerzeichen zu viel!)
                System.out.print(" ");
            }
            for(int stern=1; stern <= 1+zeile*2; stern++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        for(int i=0; i<args.length; i++) {
            int n = Integer.parseInt(args[i]);
            printTanne(n);    
        }
    }
}
