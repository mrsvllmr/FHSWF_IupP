package fuenftertermin;

import java.util.Iterator;

class Knoten<T> {
   private T inhalt;
   private Knoten<T> nachfolger;
   public void setInhalt(T inhalt) {
      this.inhalt = inhalt;
   }
   public T getInhalt() {
      return inhalt;
   } 
   public void setNachfolger(Knoten<T> nachfolger) {
      this.nachfolger = nachfolger;
   }
   public Knoten<T> getNachfolger() {
      return nachfolger;
   }     
}

public class EinfachVerketteteListe 
   implements Iterator<String>, Iterable<String> {
   Knoten<String> erster = null;
   Knoten<String> letzter = null;
   Knoten<String> aktueller = null;
   public void add(String s) {
      Knoten<String> k = new Knoten<String>();
      k.setInhalt(s);
      if (erster == null) { 
         erster = k;
         letzter = k;
         aktueller = k;
      } else {
         letzter.setNachfolger(k);
         letzter = k;
      }
   }
   public boolean hasNext() {
      boolean rueckgabe = (aktueller != null);
      if (rueckgabe == false) {
         aktueller = erster;
      }
      return rueckgabe;
   }
   public String next() {
      String rueckgabe = aktueller.getInhalt();
      aktueller = aktueller.getNachfolger();
      return rueckgabe;
   }
   public Iterator<String> iterator() {
      return this;
   }

   public static void main (String[] args) {
      EinfachVerketteteListe liste = new EinfachVerketteteListe();
      for (int i = 0; i < 10; i++) {
         liste.add("Eintrag " + i);
      }
      for (String s : liste) 
         System.out.println(s);
   }
   
   /*
   public static void main(String[] args) {
      EinfachVerketteteListe liste = new EinfachVerketteteListe();
      java.util.stream.IntStream.range(0,10)
         .forEach(i -> liste.add("Eintrag " + i));
      liste.forEach(System.out::println);
   } 
   */
}
