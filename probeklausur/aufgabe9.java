package probeklausur;

public class aufgabe9
{
    public static void main(String[] args)
    {
        /*
         * Welche Werte für d und e liefern die folgenden Zeilen? Jede Zeile übernimmt dabei 
         * die neuen Werte für d und e?
         * int d = 1, e = 2;
         * d *= e;
         * d += e++;
         * d -= 3 - 2 * e;
         * e /= (d + 1);
         */
        int d = 1, e = 2;       // d=1, e=2
        System.out.println(d+"   "+e);
        d *= e;                 // d=2, e=2
        System.out.println(d+"   "+e);
        d += e++;               // d=4, e=3
        System.out.println(d+"   "+e);
        d -= 3 - 2 * e;         // d=7, e=3
        System.out.println(d+"   "+e);
        e /= (d + 1);           // d=7, e=0
        System.out.println(d+"   "+e);
    }
}
