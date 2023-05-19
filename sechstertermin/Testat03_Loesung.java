package sechstertermin;

import javax.swing.JOptionPane;
interface Lotterie {
   int getAnzahl();
   int getMaximum();
   public default long berechneMoeglichkeiten() {
      long r = 1;
      int i;
      int maximum = getMaximum();
      for (i = 1; i <= getAnzahl(); i++) {  
         r = r*maximum/i; //r *= maximum/i; wäre hier falsch!
         maximum--;
      }
      return r;      
   }
}
public class Testat03_Loesung {  
   public static void main(String[] args){  
      Lotterie lot6aus49 = 
         new Lotterie() {
            public int getAnzahl() {
               return 6;
            }
            public int getMaximum() {
               return 49;
            }         
         };
      long chancen6aus49 = lot6aus49.berechneMoeglichkeiten();
      System.out.println("Ihre Chancen für 6 aus 49\nsind 1 in " + 
         chancen6aus49 + ". Viel Glück!");     
      Lotterie lot = 
         new Lotterie() {
            int anzahl, maximum;
            {
               anzahl = Integer.parseInt(
                  JOptionPane.showInputDialog(
                  "Wie viele Zahlen sollen gezogen werden?"));
               maximum = Integer.parseInt(
                  JOptionPane.showInputDialog
                  ("Was ist die größtmögliche Zahl?"));
            }
            public int getAnzahl() {
               return anzahl;
            }
            public int getMaximum() {
               return maximum;
            };         
         }; 
      try {                   
         long chancen = lot.berechneMoeglichkeiten();
         JOptionPane.showMessageDialog(null,
            "Ihre Chancen für " + lot.getAnzahl() + " aus " + lot.getMaximum() +
            "\nsind 1 in " + chancen + ". Viel Glück!");
      }
      catch(Throwable e) {
         e.printStackTrace();
      }   
   }
}    

