package probeklausur;

import java.util.stream.*;

public class aufgabe15
{
    final static String LOREMIPSUM = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy " +
        "eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam " +
        "et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor " +
        "sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt " +
        "ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et " +
        "ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.";
    
    public static void main(String[] args)
    {
        /*
        Was liefert die Methode mystery(String)?
        import java.util.stream.*;
        public class Test {
            final static String LOREMIPSUM = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy " +
            "eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam " +
            "et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor " +
            "sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt " +
            "ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et " +
            "ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.";
        
            public static void main(String[] args) { 
                System.out.println(mystery(LOREMIPSUM));
            }
            
            public static long mystery(String x) {
                return
                    Stream.of(x.split("[\\W]+"))
                    .filter(s -> s.length()==3 && s.startsWith("s"))
                    .distinct()
                    .count();
            }
        }
        */
        
        System.out.println(mystery(LOREMIPSUM));
    }
        
    public static long mystery(String x) {
        return
            Stream.of(x.split("[\\W]+"))
            .filter(s -> s.length()==3 && s.startsWith("s"))
            .distinct()
            .count();
    }
        
}
/*
 * Learning 1: Doppelter Backslash, um Interpretation des Sonderzeichens zu unterbinden
 * Learning 2: \W steht für non-word character
 * Learning 3: + steht für one or more times
 * Learning 4: Die übrigen Teilstrings im Array werden dann auf Länge = 3 und Start mit "s" hin gefiltert
 * Learning 5: Dann werden die übrigen Strings distinct gezählt
 */