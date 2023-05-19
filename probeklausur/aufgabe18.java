package probeklausur;

public class aufgabe18
{
    
    public static void main(String[] args)
    {
        /*        
        Schreiben Sie eine Java-Programm, das berechnet, wie viele Zahlen zwischen 1 und 100.000 
        (jeweils einschließlich) existieren, die durch 7 oder durch 17, aber nicht durch 
        beide (7 und 17) teilbar sind.+
        
        public class Test {
            public static void main(String[] args) { 
                //HIER
            }
        }
        */
        
        int counter = 0; 
        for (int i=0; i<=100000; i++) {             // WICHTIG: "<="
            if(i % 17 == 0 ^ i % 7 == 0) {          // WICHTIG/REMINDER: "^" ist exklusives Oder bei logischen Operatoren
                counter++;
            }
        }
        System.out.print(counter);
    }
  
}
/*
 * Learning 1: "^" ist exklusives Oder bei logischen Operatoren
 */