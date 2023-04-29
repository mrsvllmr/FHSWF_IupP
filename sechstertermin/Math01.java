package sechstertermin;

public class Math01 {
   public static void main(String[] args) {
    
      int i = 7;
      int j = -9;
      double x = 72.3;
      double y = 0.34;
   
      System.out.println("|" + i + "| = " + Math.abs(i));     
      System.out.println("|" + j + "| = " + Math.abs(j));
      System.out.println("|" + x + "| = " + Math.abs(x));     
      System.out.println("|" + y + "| = " + Math.abs(y));
   
      System.out.println(x + " ~ " + Math.round(x));     
      System.out.println(y + " ~ " + Math.round(y));     
   
      System.out.println("'Ceiling' von " + i + " = " + Math.ceil(i));     
      System.out.println("'Ceiling' von " + j + " = " + Math.ceil(j));
      System.out.println("'Ceiling' von " + x + " = " + Math.ceil(x));     
      System.out.println("'Ceiling' von " + y + " = " + Math.ceil(y));
   
      System.out.println("'Floor' von " + i + " = " + Math.floor(i));     
      System.out.println("'Floor' von " + j + " = " + Math.floor(j));
      System.out.println("'Floor' von " + x + " = " + Math.floor(x));     
      System.out.println("'Floor' von " + y + " = " + Math.floor(y));
   
      System.out.println("min(" + i + "," + j + ") = " + Math.min(i,j));     
      System.out.println("min(" + x + "," + y + ") = " + Math.min(x,y));     
      System.out.println("min(" + i + "," + x + ") = " + Math.min(i,x));     
      System.out.println("min(" + y + "," + j + ") = " + Math.min(y,j));     
   
      System.out.println("max(" + i + "," + j + ") = " + Math.max(i,j));     
      System.out.println("max(" + x + "," + y + ") = " + Math.max(x,y));     
      System.out.println("max(" + i + "," + x + ") = " + Math.max(i,x));     
      System.out.println("max(" + y + "," + j + ") = " + Math.max(y,j));     
   
      System.out.println("Pi = " + Math.PI);     
      System.out.println("e = " + Math.E);       
   
      double angle = 45.0 * 2.0 * Math.PI/360.0;
      System.out.println("cos(" + angle + ") = " + Math.cos(angle));     
      System.out.println("sin(" + angle + ") = " + Math.sin(angle));     
   
      double value = 0.707;
   
      System.out.println("acos(" + value + ") = " + Math.acos(value));     
      System.out.println("asin(" + value + ") = " + Math.asin(value));     
      System.out.println("atan(" + value + ") = " + Math.atan(value));     
   
      System.out.println("exp(1.0) = "  + Math.exp(1.0));
      System.out.println("exp(10.0) = " + Math.exp(10.0));
      System.out.println("exp(0.0) = "  +  Math.exp(0.0));
   
      System.out.println("log(1.0) = "    + Math.log(1.0));
      System.out.println("log(10.0) = "   + Math.log(10.0));
      System.out.println("log(Math.E) = " + Math.log(Math.E));
   
      System.out.println("pow(2.0,2.0) = "  + Math.pow(2.0,2.0));
      System.out.println("pow(10.0,3.5) = " + Math.pow(10.0,3.5));
      System.out.println("pow(8,-1) = "     + Math.pow(8,-1));
    
      System.out.println("Zufallszahl: " + Math.random());     
      System.out.println("Noch eine Zufallszahl: " + Math.random());
   }
}
