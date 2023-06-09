
/**
 * Beschreiben Sie hier die Klasse Aufgabe_4_2.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Aufgabe_4_2
{
    public static void main (String[] args) {
        int anzahlEingaben = Integer.parseInt(System.console().readLine("%s", "Wie viele Eingaben möchten Sie vornehmen?")); 
        erfrageEingaben(anzahlEingaben);
    }
    
    static void erfrageEingaben(int anzahlEingaben) {
        if (anzahlEingaben == 0) {
            return;
        } else {
            String eingabe = System.console().readLine("%s","Ihre " + anzahlEingaben + ". Eingabe:");
            erfrageEingaben(anzahlEingaben-1);
            System.out.println("Ausgabe " + anzahlEingaben + ". Zeile: " + eingabe); 
        }
    }
}

/*
import java.io.Console; 
public class Aufgabe_4_2 { 
 final static Console KONSOLE = System.console(); 
 static void rueckWaerts(int i){ 
   if (i == 0) { 
     return; 
   } else { 
     String eingabe = KONSOLE.readLine("Eingabe %d. Zeile: ",i); 
     rueckWaerts(i-1); 
     System.out.println("Ausgabe " + i + ". Zeile: "+eingabe); 
   } 
 } 
 
 public static void main(String[] args) { 
   if (KONSOLE == null) 
     System.out.println("Konsole nicht verfügbar"); 
   else if (args.length == 0) 
     System.out.println("Anzahl Zeilen nicht spezifiziert"); 
   else 
     rueckWaerts(Integer.parseInt(args[0])); 
 } 
} 
 */
