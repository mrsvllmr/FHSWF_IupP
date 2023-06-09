package sechstertermin;

public class Wrapperklasse03 {
   public static void main(String[] args) {
      Integer i1 = 127;
      Integer i2 = 127;
      int i3 = 127;
      System.out.println(i1 == i2);     // true, weil gleiches Objekt (Integer-Pool/-Cache von -128-127)
      System.out.println(i1 == i3);     // true, weil automatisches Unboxing von Integer zu int
      Integer j1 = 128;
      Integer j2 = 128;
      int j3 = 128;
      System.out.println(j1 == j2);     // false, weil nicht mehr innerhalb Integer-Pool/-Cache
      System.out.println(j1 == j3);     // true, weil automatisches Unboxing von Integer zu int
      Integer k1 = 1000;
      Integer k2 = 1000;
      int k3 = 1000;
      System.out.println(k1 == k2);     // false, weil nicht mehr innerhalb Integer-Pool/-Cache
      System.out.println(k1 == k3);     // true, weil automatisches Unboxing von Integer zu int          
   }
}