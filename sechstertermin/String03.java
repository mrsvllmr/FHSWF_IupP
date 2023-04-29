package sechstertermin;

import java.util.regex.*;
public class String03 {
   public static void main(String[] args) {
      System.out.print("\"aaaab\".matches(\"a*b\") ist ");
      System.out.println("aaaab".matches("a*b"));    
   
      System.out.print("\"b\".matches(\"a*b\") ist ");
      System.out.println("b".matches("a*b"));   
   
      System.out.print("\"a\".matches(\".\") ist ");
      System.out.println("a".matches("."));   
   
      System.out.print("\"abc\".matches(\".\") ist ");
      System.out.println("abc".matches(".")); 
   
      System.out.print("\"abc\".matches(\".*\") ist ");
      System.out.println("abc".matches(".*")); 
      
      System.out.print("\"2nnp\".matches(\".n{1,3}\") ist ");
      System.out.println("2nnp".matches(".n{1,3}"));
   
      System.out.print("\"2ybcd\".matches(\"2[xyz].+\") ist ");
      System.out.println("2ybcd".matches("2[xyz].+"));   
   
      System.out.print("\"2bkbv\".matches(\".+[abc][zv].*\") ist ");
      System.out.println("2bkbv".matches(".+[abc][zv].*")); 
      
      System.out.print("\"1+1\".matches(\"1+1\") ist ");
      System.out.println("1+1".matches("1+1")); 
      
      System.out.print("\"1+1\".matches(\"1\\\\+1\") ist ");
      System.out.println("1+1".matches("1\\+1"));             
   }
}