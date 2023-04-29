package sechstertermin;

public class Wrapperklasse02 {
   public static void main(String[] args) {
      System.out.println(Boolean.parseBoolean("Weihnachten"));
      System.out.println(Boolean.parseBoolean("TRUE")); 
      System.out.println(Boolean.parseBoolean("very true")); 
      System.out.println(Byte.parseByte("123"));                  
      System.out.println(Integer.parseInt("123"));
      System.out.println(Integer.parseInt("123",8));  
      System.out.println(Float.parseFloat("123.0"));   
      System.out.println(Double.parseDouble("123.0"));                
   }
}