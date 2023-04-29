package sechstertermin;

import java.util.*;
class MyString implements Comparable<MyString> {
   private String s;
   public String getString() {
      return s;
   }
   public void setString(String s) {
      this.s = s;
   }
   public static MyString create(String s) {
      MyString ms = new MyString();
      ms.setString(s);
      return ms;
   }
   public int compareTo(MyString s) {
      //Splitte auf Übergang Zahl -> Keine Zahl und  Keine Zahl -> Zahl
      String[] me = getString().split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
      String[] you = s.getString().split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)"); 
      
      int i = -1, result = 0; 
       
      while (true) {
      
         i++;
         
         if (i >= me.length && i >= you.length) {
            return 0;
         }
         else if (i >= me.length) {
            return -1;
         }
         else if (i >= you.length) {
            return +1;
         }
         
         try {
            result = Long.valueOf(me[i]).compareTo(Long.valueOf(you[i]));
            if (result == 0) {
               result = me[i].length()-you[i].length();
            }
         } 
         catch (Throwable ex) {
            result = me[i].compareToIgnoreCase(you[i]);
         }
      
         if (result != 0) {
            return result;
         }
      }        
   }  
   public String toString() {
      return getString();
   } 
}
public class Aufgabe_6_4 {
   public static void main(String[] args){	
      final int MAX = 20;
      final MyString[] liste = new MyString[MAX];
      for (int i=0; i < MAX; i++)
         liste[i] = MyString.create((Math.random() < 0.5 ? "A_" : "B_") + 
            Math.round(Math.random()*MAX) +
            (Math.random() < 0.5 ? "_a" : "_b"));
      Arrays.sort(liste);
      System.out.println(Arrays.toString(liste));
   } 
}
