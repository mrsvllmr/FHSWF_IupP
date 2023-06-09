// package a.b.c;

// import d.e.f.;
// import packagename.*;
// import packagename.ClassName;
// import static ClassName.*;
import javax.swing.JOptionPane;
import java.util.stream.*;
import java.util.concurrent.*;

public class Uebersicht implements BeispielInterface, Comparable<Uebersicht>, Runnable //, funktionaleSchnittstelle
{
    private String undercover = "Mich kennt keiner";
    static String ichGehoereZurKlasse = "Klassenclown";
    public String michKenntManUeberall = "Bekannt wie ein bunter Hund";
    int delay;
    
    public void setUndercover(String s) {
        this.undercover = s;
    }
    
    public String getUndercover() {
        return this.undercover;
    }
    
    //public void gibAus(String v) {
    //    System.out.println("Ich leite die Ausgabe des Lamba-Ausdrucks ein...");
    //}
    
    public static void main (String[] args) {
        /*********************************************** Java Bezeichner ***********************************************/
        int €uro = 10;              // zulässig
        String \u00df = "scharfes S";
        String \u00d6 = "großes Ö";
        String \u10c7 = "wyld..Georgian S";
        System.out.println(€uro);
        System.out.println(\u00df);
        System.out.println(\u00d6);
        System.out.println(\u10c7);
        System.out.println('\u10c7');

        for (int i=0; i<=10; i++){
            System.out.printf("%."+i+"f%n",java.lang.Math.PI);
        }
        // System.out.printf("%.1f%n",java.lang.Math.PI);
        // System.out.printf("%.2f%n",java.lang.Math.PI);
        // System.out.printf("%.3f%n",java.lang.Math.PI);
        /*********************************************** Variablen anlegen ***********************************************/
        int a=10;
        char b='A';
        char c=65;    // weil ANSI-Position des Buchstabens A
        char k = '\u00e4'; 
        int l = 1_000_000;
        float m = 1.5f;
        System.out.println("\nAUSGABE VON VARIABLEN:");
        System.out.println(a);
        System.out.println(b);
        System.out.println("ANSI-Code :" + c);
        System.out.println("Escapesequenz: " + k);
        System.out.println("Integer mit trennenden Unterstrichen i.S: der Lesbarkeit: " + l);
        System.out.println("Float-Wert: " + m);
                
        /*********************************************** Felder anlegen ***********************************************/
        int[] d = {10,-1};
        char[] q = new char[10];
        int[] r = {1,2,3};
        int[] s;
        s = new int[]{4,5,6};
        // mehrdimensional
        int[][] t = new int[3][];
        t[0] = new int[1];
        t[1] = new int[]{1,2};
        t[0][0] = 5;
        System.out.println("Array-Element an Position 0|0 (zuvor neu zugewiesen): " + t[0][0]);
        System.out.println("Array-Element an Position 1|1 (schon bei Deklaration direkt initialisiert): " + t[1][1]);
        
        // Variablen und Modifier
        final int KONSTANTE=10;   // Konstante
        
        // Deklaration mehrerer Variablen gleichen Typs
        int e=11, f=12, g=13, h=14;
        
        // Blockanweisung (schränkt Scope der inneren Variable ein)
        {
            int i=15;   // nur innerhalb des Blocks sichtbar!
            System.out.println("Blockanweisung und Konkatenation: " + h+i);     // Beachte: Auswertung von links nach rechts(!!!), d.h. die Zahlen werden nicht addiert!
        }
        
        /*********************************************** Signifikanz ***********************************************/
        
        System.out.println("\nSIGNIFIKANZ:");
        float i = 1.3000001f;                   // i wieder problemlos nutzbar, da oberhalb ja nur im Block gültig --> wird noch vollständig ausgegeben, weil 7 Nachkommastellen
        float j = 1.30000001f;                  //                                                                 --> wird nicht mehr vollständig ausgegeben, weil > 7 Nachkommastellen
        System.out.println(i); 
        System.out.println(j+"\n");
        
        /*********************************************** Typumwandlung ***********************************************/
        
        System.out.println("\nTYPUMWANDLUNG:");
        long wertl = 1234567890;                         // --> 1234567890 
        System.out.println(wertl); 
        //float wertf = wertl; //casting 
        System.out.println((float) wertl); // 1.234568E9    --> 1234568000
        
        int n=500;
        byte o = (byte) n;
        System.out.println("Narrowing: " + o + ".. von int zu byte werden 24 Bits abgeschnitten, dann Wert im Zweierkomplement");        
        
        /*********************************************** Erzeugung Verbundinstanz ***********************************************/
        
        Verbund verbundBezeichner = new Verbund();
        verbundBezeichner.p = 100;
        System.out.println("\nZugriff auf Variable des Verbundes via Punktoperator: " + verbundBezeichner.p); 
        
        /*********************************************** Textblock ***********************************************/
        
        String u = """
        Testausgabe in einem Textblock (ohne Einrückung)
            Zweite Zeile mit Einrückung
        """;
        String v = "Testausgabe in einem Textblock (ohne Einrückung)\n    Zweite Zeile mit Einrückung\n"; 
        System.out.println(u == v);
        
        /*********************************************** Post- und Prä-Inkrement ***********************************************/
        
        int [][] intArr = {{1},{2,3},{4,5,6}}; 
        int w = 1, x = 0; 
        System.out.print("Ausgabe eines Feldindex unter Verwendung von Inkrementen:"); 
        System.out.println(intArr[w++][++x]);   // w wird nach Verwendung erhöht, x vorher -> w=1 und x=1 -> expected: 3
        
        /*********************************************** Arithmetiken ***********************************************/
        
        byte y=5;
        byte z=10;
        // byte aa=y * z;   --> kompiliert nicht, weil die Berechnung in int erfolgt und das nicht zu byte gecastet werden kann
        System.out.print("Ausgabe nach explizitem Cast: "); 
        byte ab=(byte)(y * z);
        System.out.println(ab);
        System.out.print("Ausgabe von byte-Variable, die Ergebnis einer int-Multiplikation zugewiesen bekommen hat: ");
        byte ac=5 * 10; 
        System.out.println(ac);
        
        /*********************************************** Verbundoperator ***********************************************/
        
        // Verbundoperator
        a += b; // a = (Datentyp von a) (a + b);
        System.out.print("Ausgabe des Produkts von einem int und char Wert -> Ergebnis ist wie zu sehen ein int; Grund: Niedrigste Arithmetik ist int, also Ergebnis ebenfalls int; da kein Cast folgt, bleibt es dabei: "); 
        System.out.println(a); 
        System.out.print("Nach explizitem Cast auf char wird dann das Zeichen an der Position des int Werts ausgegeben: "); 
        System.out.println((char)a); 
        
        /*********************************************** Ternärer Konditionaloperator ***********************************************/
        
        System.out.print("\nTernärer Konditionaloperator: "); 
        System.out.println(a > b ? "\na ist größter":"\na ist kleiner");
        
        /*********************************************** Bedingungen ***********************************************/
        
        // if
        if (a>b) {
            System.out.println("a ist größer als b");
        } else {
            System.out.println("a ist nicht größer als b");
        }
        
        if (a>b) System.out.println("a ist größer als b");      // möglich, weil es nur eine Anweisung gibt (braucht keine Klammern)
        
        if (a>b) System.out.println("a ist größer als b");
        else System.out.println("a ist nicht größer als b");
        
        
        // switch
        switch (a) {
            case 10: 
                System.out.println("a = 10"); 
            case 75: 
                System.out.println("a = 75"); 
                // break;
            case 11: 
                System.out.println("Diese Anweisung ist einer weitere Case-Fall nach dem eigentlich passenden Fall. Man sieht mich, weil es kein break gab.");
            default:
                System.out.println("Mich sieht man immer, d.h. entweder nach einem/mehreren zutreffendem Fall oder wenn keiner zutrifft."); 
        }
        
        /*********************************************** Schleifen ***********************************************/
        
        // for(;;) {System.out.println("Ich bin eine Ausgabe in einer Endlosschleife."); }
        
        for(int ad=0; ad<3; ad++) {     // man kann hier auch andere Variablen für den Vergleich oder die Aktualisierung nutzen, aber das verwirrt dann und ist schwachsinnig
            System.out.println("Ich bin eine Ausgabe in einer for-Schleife und gebe 3x etwas aus.");
        }
        
        int ae = 0;
        while(ae < 3) {
            System.out.println("Ich bin eine Ausgabe in einer while-Schleife und gebe auch 3x etwas aus.");
            ae++;
        }
        
        
        for(int af = 0;af < 5;af++) { 
            aussen:                                 // skippt den kompletten folgenden Block, d.h. hier die innere Schleife
            for(int ag = 0;ag < 5;ag++) { 
                System.out.println("Schleife j"); 
                break aussen; 
            } 
            System.out.println("Schleife i"); 
        } 
        System.out.println("Schluss");
        
        /*********************************************** Methodenaufrufe ***********************************************/
        
        Uebersicht instanzDerKlasse = new Uebersicht();
        instanzDerKlasse.aendere(instanzDerKlasse);
        System.out.println(instanzDerKlasse.michKenntManUeberall);
        
        instanzDerKlasse.aendereAlternative("...und jetzt nochmal, nur auf anderem Wege/mit einer anderen Art und Weise des Aufrufs.");  
        System.out.println(instanzDerKlasse.michKenntManUeberall);
        
        System.out.println(instanzDerKlasse.addiere(a,a)); 
        System.out.println(instanzDerKlasse.addiere(a,m));
        
        System.out.println(instanzDerKlasse.addiere(a,(int)m,a));           // nicht Serien und Arrays mischen, also entweder nur mehrere Werte direkt übergeben oder eben ein Array
        
        System.out.println(instanzDerKlasse.gibZufallszahlAus());           // mit einer Instanz kann ich die nicht statische Methode so aufrufen
                                                                            // wäre die Methode statisch, könnte ich sie auch einfach ohne jegliche Referenz aufrufen; noch besser aber Uebersicht.gibZufallszahlAus()
        
        long startzeit = System.nanoTime();
        System.out.println(15 + " Fakultaet beträgt " + berechneFakultaet(14));
        System.out.println("Dauer in Nanosekunden: " + (System.nanoTime()-startzeit));
        
        int ai = 10;
        float aj = 20.0f;
        System.out.println(wirfMuenze(10,20));
        System.out.println(wirfMuenze(1,ai));
        System.out.println(wirfMuenze(ai,aj));
        System.out.println(wirfMuenze(12,3.14));
        
        String[] stringArray = {"Marius","Vollmer"};
        liesAus(stringArray);        
        Integer[] intArray = {1,2,3};          
        liesAus(intArray);                     // s ist ein int-Array, siehe oben -> Platzhalter in generischen Methoden müssen aber Referenzdatentypen sein, weswegen hier nur die Wrapper-Klasse Integer funktioniert!
        
        erfrageEingabeKonsole();
        erfrageEingabeUI();
        
        /*********************************************** Datenkapselung (Setter/Getter) ***********************************************/
        Uebersicht bezeichner2 = new Uebersicht();
        bezeichner2.setUndercover("Ich bin ein String, der durch eine Setter-Methode gesetzt und schließlich durch eine Getter-Methode ausgegeben wurde.");
        System.out.println(bezeichner2.getUndercover());
        
        /*********************************************** Äußere Schnittstellen ***********************************************/
        Testklasse bezeichner3 = new Testklasse();
        bezeichner3.init();
        
        /*********************************************** Generische äußere Schnittstelle Comparable ***********************************************/
        Uebersicht zweiteInstanz = new Uebersicht();
        zweiteInstanz.setUndercover("zzz");
        System.out.println(zweiteInstanz.compareTo(instanzDerKlasse));
        
        /*********************************************** Generische äußere Schnittstelle Iterable ***********************************************/
        for(int am: intArray) {
            System.out.println(am);             // Learning: For-Each-Loop gibt mir direkt das Element und nicht "nur" den Index!!!
        }
        
        /*********************************************** Anonyme Klasse ***********************************************/
        BeispielInterface bezeichner4 = new BeispielInterface() {
            public void setUndercover(String s) {
                String undercover = s;
            }
            public String getUndercover() {
                return "Hallo";
            }
        };
        
        /*********************************************** Anonyme Methode (Lambda-Ausdruck) -> Kurzform der anonymen Klasse ***********************************************/
        funktionaleSchnittstelle BezeichnerFunktionaleSchnittstelle = (String au) -> System.out.println(au + "HiHaHo"); // diese Implementierung gilt auch nur für das aktuelle Objekt "BezeichnerFunktionaleSchnittstelle"
        BezeichnerFunktionaleSchnittstelle.gibAus("Ich bin der erste Teil der Ausgabe aus der Lamba-Funktion...");
        
        /*********************************************** instanceof ***********************************************/
        System.out.print("Ist zweiteInstanz einer Instanz vom Typ Uebersicht? -> ");
        System.out.println(zweiteInstanz instanceof Uebersicht);
        
        /*********************************************** enums ***********************************************/
        enum hp {
            EINS, ZWEI, DREI
        }
        
        hp bezeichner5 = hp.EINS;
        System.out.println(bezeichner5);
        
        for(hp healthpoint: hp.values()) {          // WICHTIG: values()
            System.out.print(healthpoint+ " "); 
        }
        
        /*********************************************** Threads ***********************************************/
        // /*
         // * - ein Thread ist zur Laufzeit Instanz der Klasse java.lang.Thread
         // * - diese sind immer vom Datentyp java.lang.Runnable
         // * - Kontrollfluss eines jeden Threads muss in funktionaler Schnittstelle Runnable (siehe vorheriger Punkt) implementiert werden
         // * 
         // * - java.util.concurrent zur nebenläufigen Ausführung von Runnable-Instanzen
         // * - funktionale Schnittstelle java.util.concurrent.Executor -> eine abstrakte Methode public void execute(Runnable command);
         // * - Hilfsklasse java.util.concurrent.Executors -> bietet ExecutorService-Objekte mit Warteschlangen für nebenläufige Ausführungen von Runnable-Instanzen
         // *     - static ExecutorService newSingleThreadExecutor()
         // *     - static ExecutorService newCachedThreadPool() [automatisch angepasste Größe]
         // *     - static ExecutorService newFixedThreadPool(int n)
         // */
        // System.out.println("\n++++++++++ Threads ++++++++++");
        // System.out.println(Thread.currentThread());
        
        // ExecutorService pool = Executors.newCachedThreadPool();
        // pool.execute(Uebersicht.create("Thread1", 33));                         // create gibt Instanz von Uebersicht zurück und die Klasse Uebersicht implementiert Runnable, daher hier nutzbar
        // pool.execute(Uebersicht.create("Thread2", 100));
        // pool.shutdown();

        // Runnable ca = 
         // () -> System.out.println("A " + Thread.currentThread().getName());     // hier direkter Aufruf mit Thread, weil diese immer vom Datentyp Runnable sind
        // Runnable cb = 
         // () -> System.out.println("B " + Thread.currentThread().getName());          
        // ExecutorService executor = Executors.newFixedThreadPool(2);
        // executor.execute(ca);
        // executor.execute(cb); 
        // executor.shutdown();
        /*********************************************** Streams ***********************************************/
        // Stream erstellen
        Stream.of(1,2,3,4,5,6,7,8,9);           // für Literale
        Stream.generate(Math::random);          // für Funktionen
        
        // Intermediäre Operationen
        System.out.println("\n++++++++++ Streams ++++++++++");
        System.out.println("\nStream.of");
        Stream.of(1,2,3,4,5,6,7,8,9)
            .map(am -> am*am)                                   // die Operation am*am wird für jedes Element ausgeführt
            .forEach(System.out::println);                      // gibt jedes Element aus
            
        System.out.println("\nStream.iterate");
        Stream.iterate(2,an -> an*an)                           // benötigt einen Startwert und führt die Operation so oft wie definiert aus, d.h. hier wird die 2 10x potenziert
            .limit(10)                                          // Beschränkung auf 10 Elemente
            .forEach(System.out::println);                      
        
        System.out.println("\nStream.of mit map");
        Stream.of(1)
            .map(Math::sin)                                     // berechnet den Sinus-Wert pro Stream-Element
            .forEach(System.out::println);                      
        
        System.out.println("\nStream.of mit peek und sorted");
        Stream.of(5,4,3,2,1)
            .peek(System.out::println)                          // peek ist eine Zwischenoperation, die den Stream nicht verändert; überprüft Zwischenergebnisse/Zustand der Elemente/generiert Debugging-Infos
            .sorted()
            .forEach(System.out::println);                      
        
        System.out.println("\nStream.of mit distinct und sorted");
        Stream.of(1,1,2,2,10,10,5,5)
            .distinct()                                         // zählt nur die distinkten Werte bzw. entfernt alle Duplikate
            .sorted()                                           // sortiert die Stream-Elemente aufsteigend
            .forEach(System.out::println);
        
        System.out.println("\nStream.of mit map und noneMatch/anyMatch");
        boolean match = Stream.of("9","4","1")
            .map(ar -> Integer.parseInt(ar))                    // wandelt jedes Element in einen Integer-Wert um
            //.noneMatch(aq -> aq==5);                          // gibt true zurück, wenn keines der Stream-Elemente 5 ist  --> terminale Operation   
            .anyMatch(aq -> aq==4);                             // gibt true zurück, wenn mindestens ein Stream-Element eine 4 ist  --> terminale Operation
        System.out.println(match);
        
        System.out.println("\nStream.of mit map und allMatch");
        boolean match2 = Stream.of("9","4","1")
            .map(ar -> Integer.parseInt(ar))                
            .allMatch(aq -> aq==4);                             // gibt true zurück, wenn alle Stream-Elemente 4 sind  --> terminale Operation
        System.out.println(match2);
        
        System.out.println("\nStream.of mit filter");
        Stream.of("Marius","Vollmer")
            //.filter(str -> str == "Marius")
            .filter(str -> Character.isUpperCase(str.charAt(0)))    // filtert die Stream-Elemente auf die Elemente, die mit einem Großbuchstaben beginnen
            .forEach(System.out::println);
            
        System.out.println("\nStream.of mit count");            
        // long av = Stream.of("Marius","Vollmer")              // zählt die Elemente im Stream  --> terminale Operation UND WICHTIG Typ long!
        //     .count();
        System.out.println(Stream.of("Marius","Vollmer")        // geht also auch direkt innerhalb des Ausgabebefehls
            .count());
            
        System.out.println("\nStream.of mit skip");
        Stream.of("Marius","Vollmer")
            .skip(1)                                            // lässt die definierte Anzahl an Elementen zu Beginn des Streams aus
            .forEach(System.out::println);
            
        System.out.println("\nStream.of mit reduce");
        String reducedString = Stream.of("A","AAAAA","AA","AAAAAAAA","A")
            .reduce((ay,az) -> ay.length() > az.length() ? ay:az)
            .get();
        System.out.println(reducedString);
        
        System.out.println("\nStream.of mit reduce");
        int[] attempt = IntStream.of(1,2,3,4,3,2,4,1,4,2)
            .sorted()
            .toArray();
        for (int element : attempt) System.out.println(attempt[element]);        
            
        System.out.println("++++++++++ Streams ++++++++++\n");
        
        int ao = 2147483647;
        ao += 2;
        System.out.println(ao);
        
        
        /*********************************************** Char-Besonderheiten ***********************************************/
        System.out.println("\n++++++++++ Char-Besonderheiten ++++++++++");
        char ba = 0x3b;
        System.out.println(ba); 
        char bd = '\u003b';
        System.out.println(bd); 
        char bb = 100;
        System.out.println(bb);
        char bc = 200;
        System.out.println(bc);
        
        char aaaa = 65;
        byte bbbb = (byte) aaaa;
        System.out.println(bbbb);
        
        char aaab = (char) bbbb; 
        System.out.println(aaab+"Hallo\nHallo");        // Escape-Sequenz
        int \u0041 = 5;                                 // Unicode-Escape-Sequenz
        int B = A + 1;
        System.out.println(B);
        
        /*********************************************** Typumwandlung-Besonderheiten ***********************************************/
        byte be = (byte) 128;
        System.out.println(be);     // Ergibt -128 -> klassischer Überlauf
        
        long bf = 65; 
        char bg = (char)bf;
        System.out.println(bg);     // Ergibt 'A' (Unicode-Zeichen)
        
        long bh = 65600; 
        char bi = (char)bh;
        System.out.println(bi);     // Ergibt 'A' (Unicode-Zeichen)
        
        /*********************************************** Zuweisung zu großer Wert ***********************************************/
        short ay = (short) 1000000;
        System.out.println("Zuweisung zu großer Wert: " + ay);
        
        int dies\u1234auch=0;
        System.out.println("\n\ndies\u1234auch");
        System.out.println(dies\u1234auch);
        System.out.println(dies\u1234auch+1);
        
        float abcd\u000d=0;
        System.out.println(abcd\u000d);
        System.out.println(abcd\u000d+1);
        System.out.println();
    
        // int i = 123\u000d; // 45
        
        /*********************************************** Java-API-Klassen ***********************************************/
        /********** String **********/
        System.out.println("++++++++++ Java-API-Klassen ++++++++++");
        String mollberger = "Kevin Molle";
        
        char charAt = mollberger.charAt(6);   // n
        System.out.println(charAt + "\n");
        
        System.out.println("length(): " + mollberger.length());
        System.out.println("substring(): " + mollberger.substring(7,mollberger.length()) + "\n"); // length möglich, weil substring vor dem zweiten int endet
        
        System.out.println("compareTo(): " + mollberger.compareTo("Marius"));      // ignoriert Groß-/Kleinschreibung
        
        System.out.println("trim(): " + mollberger.trim());
        
        System.out.println("equals(): " + mollberger.equals("Kevin Molle"));
        
        System.out.println("startsWith(): " + mollberger.startsWith("K"));
        
        System.out.println("toLowerCase() + indexOf + substring: " + mollberger.substring(mollberger.indexOf(" "), mollberger.length()).toLowerCase());
        
        System.out.print("toCharArray(): "); 
        char[] molleFeld = mollberger.toCharArray();
        System.out.println(molleFeld);
        
        System.out.println("++++++++++ RegEx ++++++++++");
        System.out.println("2bkbv".matches(".+[abc][zv].*"));
        
        String dfgfg = "3e24234_fssdsfsdf54651"; 
        String[] me = dfgfg.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        for(int ii=0; ii<me.length; ii++) System.out.print(me[ii]+" ");
        
        Testklasse GehtdasWirklich = new Testklasse();
        int echtjetzt = 300;
        GehtdasWirklich.testZuParams((byte)echtjetzt);
        
        float abc\u000d=0;
        int i = 123\u000d45;
    }
    
    /*********************************************** Setter/Ändere Variable ***********************************************/
    Uebersicht aendere(Uebersicht a) {
        a.michKenntManUeberall="Jetzt wurde der String hiermit überschrieben.";
        return a;
    }
    
    void aendereAlternative(String neuerInhalt) {
        this.michKenntManUeberall = neuerInhalt;
    }
    
    /*********************************************** Überladen ***********************************************/
    int addiere(int a, int b) {
       System.out.println("Ich bin die addiere Methode mit zwei int Werten.");
       return a+b; 
    }
    
    float addiere(int a, float b) {
        System.out.println("Ich bin die addiere Methode mit einem int und einem float Wert.");
        return a+b;
    }
     
    /*********************************************** Variable Anzahl Parameter/Serien ***********************************************/
    int addiere(int... a) {
       System.out.println("Ich bin die addiere Methode mit einer variablen Anzahl an Parametern.");
       int summe=0;
       for(int i=0; i<a.length; i++) summe += a[i];
       return summe; 
    }
    
    int addiere(int a, int b, int c) {
       System.out.print("Ich bin die Konkurrenz der addiere Methode mit einer variablen Anzahl an Parametern, weil ich besser zum Methodenaufruf passe.");
       System.out.println("Wenn du mich nicht aufrufen möchtest, kommentiere mich aus oder ergänze bei dem Aufruf einen weiteren Parameter.");
       return a+b+c; 
    }
    
    /*********************************************** Methoden für den Zufall ***********************************************/
    double gibZufallszahlAus() {
        return(Math.random());
    }
    
    /*********************************************** Rekursive Methoden ***********************************************/
    // Beispiel: Fakultät
    static long berechneFakultaet(int a) {
        return a<1 ?  1:(berechneFakultaet(a-1)*a);             // WICHTIG/MERKE: Position des returns (ternärer Operator dahinter!)
    }
    
    /*********************************************** Generische Methoden ***********************************************/
    static <T> T wirfMuenze(T m, T n) {         // <T> sagt, dass man diesen generischen Typ benutzen möchte        T ist dann der Rückgabetyp, d.h. der generische Typ wird direkt dazu genutzt
        return Math.random()>0.5 ? m:n;
    }
    
    static <T> void liesAus (T[] typeArray) {   // Array vom Typ des Platzhalter-Datentyps!
        for(T x: typeArray) {
            System.out.print(x + " ");
        }
    }
    
    /*********************************************** Einfache Benutzerinteraktion ***********************************************/
    /*********************************************** Später ergänzt: Try catch finally ***********************************************/
    // Konsole
    static void erfrageEingabeKonsole () {
        System.out.println();
        try {
            ////////////////int a = Integer.parseInt(System.console().readLine("%s ","Ich bin die Konsole. Ihre Eingabe:"));             // java.lang.System
            ////////////////System.console().printf("%d + %d = %d", a,a,a+a);
        } catch(NumberFormatException e) {
            System.out.println("Sie haben keine Zahl eingegeben. Bitte noch einmal."); 
            erfrageEingabeKonsole();
        } finally {
            System.out.println("Ich bin finally, ich werde immer ausgeführt."); 
        }
                
    }
    
    // UI
    static void erfrageEingabeUI () {                                                           // Hier: Benutzeroberfläche Swing
        System.out.println();
        ////////////////int a = Integer.parseInt(JOptionPane.showInputDialog("Ich bin die UI. Ihre Eingabe:")); //  javax.swing.JOptionPane; Funktioniert so nicht, da ich keine IDE nutze
        ////////////////System.console().printf("%d + %d = %d", a,a,a+a);
        ////////////////JOptionPane.showMessageDialog(null,a+" + "+a+" = "+(a+a));
    }
    
    /*********************************************** Generische äußere Schnittstelle Comparable ***********************************************/
    @Override
    public int compareTo(Uebersicht a) {
        int i = getUndercover().compareTo(a.getUndercover());
        return i;
    }
    
    /*********************************************** Runnable - Implementation der abstrakten Methode (Threads) ***********************************************/
    public void run() {
        int i = 0;
        try {
            while (i < 10) {
                System.out.println(undercover);
                Thread.sleep(delay); // warten
                i++;
            }
        } catch (InterruptedException exc) {
            System.err.println("Interrupt: " + exc); 
            return;
        } 
    }
    
    public static Uebersicht create(String undercover, int delay) {
        Uebersicht p = new Uebersicht();
        p.undercover = undercover;
        p.delay = delay;
        return p;
    }
}


/*********************************************** Äußere Schnittstelle ***********************************************/
interface BeispielInterface {
    void setUndercover(String s);
    String getUndercover();
    default int berechne(int a, int b) {
        return (a + b);
    }
    static void einfacheAusgabe() {
        System.out.println("Ich bin die Ausgabe der statischen Methode innerhalb der äußeren Schnittstelle.");
    }
}

interface funktionaleSchnittstelle {
    void gibAus(String s);
}

/*
class KonkreteAussereKlasse implements BeispielInterface {   // public und implements... optional
    // Variablendeklarationen mit opt. Initialisierung
    // Methoden
}
*/

/*********************************************** Verbund ***********************************************/
class Verbund {
    int p = 0;
    char q = 'a';
    // ... lediglich Variablendeklarationen und opt. Initialisierungen 
}


/*********************************************** Dritte Klasse (für Kontext Referenzvariable Schnittstelle -> Instanz der Klasse ***********************************************/
class Testklasse {
    public static void init() {
        BeispielInterface interfaceBezeichner = new Uebersicht();
        interfaceBezeichner.setUndercover("Ich wurde via Setter und Referenzvariable vom Typ der Schnittstelle gesetzt");
        System.out.println(interfaceBezeichner.getUndercover());
        
        System.out.println(interfaceBezeichner.berechne(1,2)); 
        BeispielInterface.einfacheAusgabe();
    }
    
    public void testZuParams(byte b) {
        return;
    }
}