package probeklausur;

public class aufgabe10
{
    public static void main(String[] args)
    {
        /*
         * Welche Ausgabe bewirken die folgende Anweisungen?
         * 
        loop1:
            for(int i = 0; i < 3; i++){
                loop2:
                    for(int j = 0; j < 3; j++){
                        if (i == j){
                            break loop2;
                        }
                        System.out.print("i = " + i + " j = " + j + " ");
                    }
            }
            
         */
        
        loop1:
            for(int i = 0; i < 3; i++){
                loop2:
                    for(int j = 0; j < 3; j++){
                        if (i == j){
                            break loop2;
                        }
                        System.out.print("i = " + i + " j = " + j + " ");
                    }
            }
        /* i = 1 j = 0 
         * i = 2 j = 0 
         * i = 2 j = 1 
        */
        // WICHTIG/BEACHTE: KEINE ZEILENUMBRUECHE!!!
    }
}
