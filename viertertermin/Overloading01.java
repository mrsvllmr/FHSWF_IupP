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
        text += addieren(2,3) + "\n" + addieren(5,2,3.0);
        text += "\n" + addieren(1,2,3) + "\n" + addieren(3.0,4.0);
        System.out.println(text);
    }
}