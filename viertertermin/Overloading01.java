package viertertermin;

class Overloading01 {
    public static int addieren(int a,int b) {
        return a + b;
    }
    
    public static double addieren(double a,double b) {
        return a + b;
    }
    
    public static int addieren(int a,int b,int c) {
        return a + b + c;
    }
    
    public static double addieren(int a,int b,double c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        String text = "";
        text += addieren(2,3) + "\n" + addieren(5,2,3.0);               // Annahme: Erste Methode, vierte Methode
        text += "\n" + addieren(1,2,3) + "\n" + addieren(3.0,4.0);      // Annahme: Dritte Methode, zweite Methode
        System.out.println(text);                                       // WICHTIGER REMINDER: Es wird alles zu einem String konkateniert!!!
    }
}