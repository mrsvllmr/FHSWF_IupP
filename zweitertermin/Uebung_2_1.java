package zweitertermin;

class Uebung_2_1 {
    public static void main(String[] args){
        int a = 022;
        byte b = 0xa;
        short c = 20000;
        char d = 0x41;        
        System.out.println(a);  // 18 = 16 + 2
        System.out.println(b);  // 10 = 10 * 1         
        System.out.println(c);  // 20.000 
        System.out.println(d);  // A, weil 1 + 4 * 16 = 65 -> Position von "A"        
        a = (int) Math.PI;       
        b = (byte) 130;
        c = (short) 30.3;
        System.out.println(a);  // 3        // weil int  
        System.out.println(b);  // -126     // weil Überlauf, bis 128, dann -127 bzw. -126
        System.out.println(c);  // 30       // weil short/Ganzzahlwert
    }
}
