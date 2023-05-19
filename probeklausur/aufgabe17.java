package probeklausur;

public class aufgabe17
{
    
    public static void main(String[] args)
    {
        /*        
        Schreiben Sie eine Java-Programm, das alle natürlichen Zahlen < 1000 ausgibt, 
        die durch 3 und 17 aber nicht durch 9 teilbar sind.
        
        public class Test {
            public static void main(String[] args) { 
                //HIER
            }
        }

        */
        
        for (int i=0; i<1000; i++) {
            if (i % 3 == 0 && i % 17 == 0 && i % 9 != 0) {
                System.out.print(i + " ");
            }
        }
    }
  
}
/*
 * Learning 1: Nutzung von doppelten und trägen Operatoren besser (sollte Rechenzeit sparen ^^)
 */