package probeklausur;

public class aufgabe11
{
    public static void main(String[] args)
    {
        /*
         * Welche Ausgabe bewirken die folgende Anweisungen?
        String s = "";
        boolean b1 = true;
        boolean b2 = false;
        if((b2 = false) | (21%5) > 2) s += "x";
        if(b1 || (b2 == true)) s += "y";
        if(b2 == true) s += "z";
        System.out.println(s);
        */
        
        String s = "";
        boolean b1 = true;
        boolean b2 = false;
        if((b2 = false) | (21%5) > 2) s += "x";
        // (false) | (false) -> false -> keine Änderung von s
        if(b1 || (b2 == true)) s += "y";
        // (true) || (false) --> Änderung von s = s + "y" = "y"
        if(b2 == true) s += "z";
        // (false) --> keine Änderung von s
        System.out.println(s); // Ausgabe von "y"

    }
}
