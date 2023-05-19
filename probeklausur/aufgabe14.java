package probeklausur;

public class aufgabe14
{
    public static void main(String[] args)
    {
        /*
        Was passiert, wenn Sie den folgenden Quelltext kompilieren und ggf. ausführen?
        public class Test {
        public static void main(String[] args) {
        char[] ca = {0x4e, \u004e, 78};
        System.out.println((ca[0] == ca[1]) + " " + (ca[0] == ca[2]));
        }
        }
        Hinweis: Der Buchstabe N hat die Unicode-Tabellenposition 004e

        */
        char[] ca = {0x4e, '\u004e', 78};
        System.out.println((ca[0] == ca[1]) + " " + (ca[0] == ca[2]));
    }
}
/*
 * Learning 1: Einfache Anführungsstriche um Escapesequenz fehlten!
 * Learning 2: Reminder! Numerischer Wert in char-Array ergibt das jeweilige Zeichen!
 *              Da hier Hexadezimalwerte und der int-Wert alle identisch -> "true true"
 */