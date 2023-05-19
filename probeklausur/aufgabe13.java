package probeklausur;

public class aufgabe13
{
    public static void main(String[] args)
    {
        /*
        Welche Zeilen A – F werden nicht kompilieren? Warum?
            public class Test {
                public static void main(String[] args) {
                    int i1 = 1_000; // Zeile A
                    int i2 = 10_00; // Zeile B
                    int i3 = _10_000; // Zeile C
                    int i4 = 0b101010; // Zeile D
                    int i5 = 0B10_1010; // Zeile E
                    int i6 = 0x2_a; // Zeile F
                }
            }
        */
        int i1 = 1_000;         // Zeile A  -> dezimal 1.000  
        int i2 = 10_00;         // Zeile B  -> dezimal 1.000
        // int i3 = _10_000;    // Zeile C  -> siehe unten
        int i4 = 0b101010;      // Zeile D  -> dezimal 42
        int i5 = 0B10_1010;     // Zeile E  -> dezimal 42
        int i6 = 0x2_a;         // Zeile F  -> dezimal 42
        
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);
    }
    
    /*
     * Zeile C wird nicht kompilieren, da der Unterstrich nicht zu Beginn genutzt werden darf (und auch nicht am Ende, sondern nur zur Trennung im Sinne der Lesbarkeit!)
     */
}