package zweitertermin;

class GoodFloatingPointLiterals {
   double d1 = 1135264.326589;
   double d2 = 1235497.654865d;
   double d3 = 3654.3257D;                  // auch großes "D" möglich
   double d4 = 1.23e-45;
   float f1 = 123546.4587F;
   float f2 = 687.3524f;
   
   public static void main(String[] args) {
       GoodFloatingPointLiterals instanz = new GoodFloatingPointLiterals();
       System.out.println(instanz.d1);
        System.out.println(instanz.d2);
        System.out.println(instanz.d3);
        System.out.println(instanz.d4);
        System.out.println(instanz.f1);
        System.out.println(instanz.f2);
   }
   
}

/*
1135264.326589
1235497.654865
3654.3257
1.23E-45
123546.46
687.3524
 */