package drittertermin;

class Narrowing {
    public static void main(String[] args) {
      int i = 500;                          // 00000000 00000000 00000001 11110100
      byte b = (byte) i;                    //                            11110100 --> 00001011 --> 00001100 --> -12
        System.out.println(b);
    }
} 
