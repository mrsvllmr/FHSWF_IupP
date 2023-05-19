package Testat04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*
 * 
Jede natürliche Zahl n > 0 hat eine gewisse Anzahl echter Teiler, also Zahlen m > 1 und m < n für die n%m den Wert 0 ergibt.

Eine naive Art und Weise, die Anzahl der echten Teiler zu ermitteln, ist beispielsweise:

   public static int countTeiler(int n) {
      int cnt = 0;
      for (int i = 2; i < n ; i++) {
         if ( n % i == 0 )
            cnt ++;
      }
      return cnt;
   }
   
Schreiben Sie eine Java-Applikation, die ermittelt, welche maximale Anzahl von echten Teilern die Zahlen zwischen 1 und 100000 haben. 
Messen Sie dabei die Zeit, die ihr Programm für diese Berechnungen benötigt. Eine einfache Version könnte etwa folgendes Ergebnis ausgeben:

    Echte Teiler zaehlen in 1 Thread(s)...
    Die maximale Anzahl echter Teiler der Zahlen zwischen 1 und 100000 ist: 126
    Eine Zahl mit dieser Anzahl echter Teiler ist: 83160
    Benoetigte Rechenzeit: 13,646 Sekunden

Optimieren Sie nun Ihre Applikation in zwei Richtungen: Verbessern Sie zunächst die Methode public static int countTeiler(int n). Dies sollte Ihr Programm um einiges schneller machen. 
Führen Sie dann noch nebenläufige Ausführungen ein, indem Sie etwa bis zu 10 Threads für die Berechnungen parallel einsetzen. 
Das Ergebnis einer derartig optimierten Java-Applikation könnte dann wie folgt aussehen:

    Echte Teiler zaehlen in 10 Thread(s)...
    Die maximale Anzahl echter Teiler der Zahlen zwischen 1 und 100000 ist: 126
    Eine Zahl mit dieser Anzahl echter Teiler ist: 83160
    Benoetigte Rechenzeit: 0,121 Sekunden
    Sie sehen also, verbesserte Algorithmen und Multithreading können sich richtig lohnen!
 * 
 */

public class Testat04 {

   public static void main(String[] args){
       calcRawAndOptimizedWithoutMultithreading(Integer.parseInt(args[0]), false);
       calcRawAndOptimizedWithoutMultithreading(Integer.parseInt(args[0]), true);
       calcRawAndOptimizedWithMultithreading(Integer.parseInt(args[0]), true);
   }
    
   public static void calcRawAndOptimizedWithoutMultithreading(int n, boolean optimiert) {
       long startzeit = System.currentTimeMillis();
       int maxTeiler = 0;
       int teiler = 0;
       int zahl = 0;
       int input = n;
       
       // Wenn Anzahl der Teiler des aktuellen Wertes > bisher größte Anzahl Teiler, dann setze neuen Max-Wert
       for (int laufvariable = 0; laufvariable < input; laufvariable++) {
           if (optimiert == true) {
               teiler = countTeilerOptimiert(laufvariable);
           } else {
               teiler = countTeiler(laufvariable);
           };
           if (teiler > maxTeiler) {
               maxTeiler = teiler;
               zahl = laufvariable;
           }
       }
       
       // Ausgabe und Ermittlung der Laufzeit
       System.out.println("\nEchte Teiler zaehlen in " + Thread.activeCount() + " Thread(s)..."); 
       System.out.println("Die maximale Anzahl echter Teiler der Zahlen zwischen 1 und " + n + " ist: " + maxTeiler);
       System.out.println("Eine Zahl mit dieser Anzahl echter Teiler ist: " + zahl); 
       long endzeit = System.currentTimeMillis();
       double laufzeit = endzeit - startzeit;
       System.out.println("Benoetigte Rechenzeit: " + laufzeit/1000.0);
       if (optimiert == true) {
           System.out.println("Sie sehen also, verbesserte Algorithmen (und Multithreading) können sich richtig lohnen!");
       }
       System.out.println();
   }
   
   public static void calcRawAndOptimizedWithMultithreading(int n, boolean optimiert) {
       long startzeit = System.currentTimeMillis();
       int maxTeiler = 0;
       int teiler = 0;
       int zahl = 0;
       int input = n;

       // Anzahl der Threads festlegen
       int threadCount = 10;

       // ExecutorService für parallele Ausführung der Threads erstellen
       ExecutorService executor = Executors.newFixedThreadPool(threadCount);

       // Gemeinsam genutzte Variable für maximale Anzahl echter Teiler
       // Ich habe nach längerem Probieren + Recherche nur diese Variante gefunden - Gibt es eine bessere Lösung?
       MaxTeilerContainer maxTeilerContainer = new MaxTeilerContainer();

       // Aufteilung der Zahlen auf die Threads und Ausführung
       for (int i = 0; i < input; i++) {
           int number = i;
           executor.execute(() -> {
               int teilerCount = countTeilerOptimiert(number);
               synchronized (maxTeilerContainer) {
                   if (teilerCount > maxTeilerContainer.maxTeiler) {
                       maxTeilerContainer.maxTeiler = teilerCount;
                       maxTeilerContainer.zahl = number;
                   }
               }
           });
       }

       // ExecutorService beenden
       executor.shutdown();

       // Warten, bis alle Threads beendet sind
       while (!executor.isTerminated()) {
           Thread.yield();
       }

       // Ergebnisse auswerten
       maxTeiler = maxTeilerContainer.maxTeiler;
       zahl = maxTeilerContainer.zahl;

       // Ausgabe und Ermittlung der Laufzeit
       System.out.println("\nEchte Teiler zaehlen in " + threadCount + " Thread(s)...");
       System.out.println("Die maximale Anzahl echter Teiler der Zahlen zwischen 1 und " + n + " ist: " + maxTeiler);
       System.out.println("Eine Zahl mit dieser Anzahl echter Teiler ist: " + zahl);
       long endzeit = System.currentTimeMillis();
       double laufzeit = (endzeit - startzeit) / 1000.0;
       System.out.println("Benoetigte Rechenzeit: " + laufzeit + " Sekunden");
       System.out.println("""
       Sie sehen also, verbesserte Algorithmen und Multithreading(!?) können sich richtig lohnen! 
       (wobei hier scheinbar auch der Overhead des Multithreading erkennbar wird, da die zweite Variante etwas schneller ist; In diesem konkreten Fall gilt: Je weniger Threads, desto schneller)\n                          
       """);
   }
   
   public static int countTeiler(int n) {  
      int cnt = 0;
      for (int i = 2; i < n ; i++) {
         if ( n % i == 0 )
             cnt += 1;
      }
      return cnt;
   }
   
   public static int countTeilerOptimiert(int n) {
      int cnt = 0;
      //Optimierung: Statt Prüfen für alle Zahlen nur Prüfung bis zur Wurzel der Zahl, da Teiler immer paarweise auftreten und es höchstens Wurzel + Wurzel werden kann
      int sqrt = (int) Math.sqrt(n);
      for (int i = 2; i < sqrt ; i++) { // Vor Optimierung i < n
         if ( n % i == 0 )
             cnt += 2;
      }
      return cnt;
   }
   
   private static class MaxTeilerContainer {
       public int maxTeiler = 0;
       public int zahl = 0;
   }
}