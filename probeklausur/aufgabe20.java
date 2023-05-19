package probeklausur;


public class aufgabe20
{
    /*
    Welche Ausgabe bewirken die folgenden Anweisungen?
        String s = "1";                                     s = "1"
        boolean b = false;                                  b = false
        int x = 7, y = 8;                                   x = 7, y = 8
        if((x < 8) ^ (b = true)) s += "2";                  x<8 -> true, b = true -> true --> daher beides true und dadurch keine Anpassung von s ... b = true
        if(!(x > 8) | ++y > 5) s += "3";                    !(x > 8) -> true, ++y > 5 -> true --> Anpassung von s ... y = 9, s = "13"
        if(++y > 9 && b == true) s += "4";                  ++y > 9 -> true, b == true -> true --> beides true, daher Anpassung von s ... y = 10, s = "134"
        if(y % 8 > 1 || y / (x - 7) > 1) s += "5";          y % 8 > 1 -> true, y / (x - 7) > 1 -> Kompilierfehler durch Division durch 0 !?                         !!! FALSCH (siehe unten) !!! -> "1345"
        System.out.println(s)                               "1345"
     */
    public static void main(String[] args) {
        String s = "1";
        boolean b = false;
        int x = 7, y = 8;
        if((x < 8) ^ (b = true)) s += "2";
        if(!(x > 8) | ++y > 5) s += "3";
        if(++y > 9 && b == true) s += "4";
        if(y % 8 > 1 || y / (x - 7) > 1) s += "5";          // WICHTIG!!! Zweiter Term wird aufgrund des trägen Operators nicht ausgewertet (da der erste Term bereits true ergibt und ein logisches Oder genutzt wird)
        System.out.println(s);
    }
}
