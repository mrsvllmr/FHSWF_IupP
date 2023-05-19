package probeklausur;

import java.util.*;
import java.util.stream.*;

class aufgabe5_1
{
    public static void main(String[] args)
    {
        /*
        import java.util.*;
        import java.util.stream.*;
        public class Test {
            public static void main(String[] args) { 
                System.out.println(haeufigsteZahl(0,4,1,2,3,3,4,4,4,1,2,1,4)); //4
                System.out.println(haeufigsteZahl(0,3,1,2,3,3,4,4,4,1,2,1,4)); //1 
                int[] beispiel = new int[1000000];
                for (int i=0; i<1000000; i++)
                    beispiel[i] = (int)(Math.random()*101);
                System.out.println(haeufigsteZahl(0,100,beispiel)); 
            }
            public static int haeufigsteZahl(int start, int ende, int... feld) {
                //Bestimmt eine häufigste Zahl in feld, die zwischen start und ende
                //(jeweils einschließlich) liegt.
                return 0;
            }
        }
         */
    }
}

public class aufgabe5 {
    public static void main(String[] args) { 
        System.out.println(haeufigsteZahl(0,4,1,2,3,3,4,4,4,1,2,1,4)); //4
        System.out.println(haeufigsteZahl(0,3,1,2,3,3,4,4,4,1,2,1,4)); //1 
        int[] beispiel = new int[1000000];
        for (int i=0; i<1000000; i++)
            beispiel[i] = (int)(Math.random()*101);
        System.out.println(haeufigsteZahl(0,100,beispiel)); 
    }
    
    public static int haeufigsteZahl(int start, int ende, int... feld) {
        //Bestimmt eine häufigste Zahl in feld, die zwischen start und ende
        //(jeweils einschließlich) liegt.
        for(int i = start; i <= ende; i++) {
            
        }
        return 0;
    }
}