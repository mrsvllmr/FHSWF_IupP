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
      return getString().compareTo(s.getString());
   }  
   public String toString() {
      return getString();
   } 
}
public class Aufgabe_6_4_X {
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
