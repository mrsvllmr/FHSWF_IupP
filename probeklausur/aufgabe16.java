package probeklausur;

import java.util.stream.*;
import java.util.*;

public class aufgabe16
{
    
    public static void main(String[] args)
    {
        /*
        Was liefert die Methode mystery()?
        import java.util.stream.*;
        import java.util.*;
        
        public class Test {
            public static void main(String[] args) { 
                System.out.println(Arrays.toString(mystery()));
            }
            
            public static Integer[] mystery() {
                return
                Stream.generate(Math::random)
                .map(x -> (int)(10000*x))
                .filter(x -> x%2 == 0)
                .limit(10)
                .toArray(Integer[]::new)
                ;
            }
        }
        */
        
        System.out.println(Arrays.toString(mystery()));
    }
        
    public static Integer[] mystery() {
    return
        Stream.generate(Math::random)
        .map(x -> (int)(10000*x))
        .filter(x -> x%2 == 0)
        .limit(10)
        .toArray(Integer[]::new)
        ;
    }
        
}
/*
 * Learning 1: "Math::random" erzeugt einen unendlichen Stream von Zufallszahlen zwischen 0 (einschließlich) und 1 (ausschließlich)
 * Learning 2: ".map(x -> (int)(10000*x))" multipliziert jede Zufallszahl mit 10000 und wandelt sie in einen Integer um. Dadurch entstehen Zufallszahlen im Bereich von 0 bis 9999.
 * Learning 3: ".filter(x -> x%2 == 0)" filtert die Zahlen und behält nur die geraden Zahlen
 * Learning 4: ".limit(10)" begrenzt den Stream auf die ersten 10 Elemente
 * Learning 5: ".toArray(Integer[]::new)" wandelt den Stream in ein Integer-Array um   
 */