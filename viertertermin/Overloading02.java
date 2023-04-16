package viertertermin;

class Overloading02 {
    public static long addieren(int a,long b) {
        return a + b;
    }
    public static long addieren(long a,int b) {
        return a + b;
    }
    public static void main(String[] args) {
        //System.out.println(addieren(2,3));
    }
}