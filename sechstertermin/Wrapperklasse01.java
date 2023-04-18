package sechstertermin;

public class Wrapperklasse01 {
   public static void main(String[] args) {
      Double p = 123456789.123456789;
      System.out.println("byte: " + p.byteValue());
      System.out.println("short: " + p.shortValue());
      System.out.println("int: " + p.intValue());
      System.out.println("long: " + p.longValue());
      System.out.println("float: " + p.floatValue());
      System.out.println("double: " + p.doubleValue());
      System.out.println(4711.longValue());
   }
}
