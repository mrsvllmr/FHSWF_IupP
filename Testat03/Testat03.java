/**
 * Testat03 im Modul Imperative und prozedurale Programmierung
 * 
 * @author Marius Vollmer
 * @version 30.04.2023
 */

package Testat03;

import javax.swing.JOptionPane;

// BigInteger-Klasse benötigt, um Überlauf bei sehr großen Fakultäten zu vermeiden
// Vor der Hintergrund der Tatsache, dass wir Klassen wie BigInteger bisher so nicht genutzt haben: War das so gedacht? :)
import java.math.BigInteger; 

interface Lotterie {
   int getAnzahl();
   int getMaximum();
   
   // Hilfsfunktion, um dreifache Wiederholung zur Berechnung der Fakultäten zu vermeiden
   public default BigInteger berechneFakultaet(BigInteger wert) {
      // Berechnung der Chance: n über k = n! / (k! * (n-k)!)
      BigInteger fakultaet = BigInteger.valueOf(1);
       for (BigInteger i = BigInteger.valueOf(1); i.compareTo(wert)<=0; i = i.add(BigInteger.ONE)) {
          fakultaet = fakultaet.multiply(i);
      }
      return fakultaet;
   }
   
   public default long berechneMoeglichkeiten() {
      // Attribute aus Instanz einlesen
      BigInteger anzahl = BigInteger.valueOf(this.getAnzahl());
      System.out.println("Anzahl " + anzahl);
      BigInteger maximum = BigInteger.valueOf(this.getMaximum());
      System.out.println("Maximum " + maximum);
      
      // Fakultäten berechnen
      BigInteger fakultaetMaxElemente = berechneFakultaet(maximum);
      BigInteger fakultaetAnzahlGezogeneElemente = berechneFakultaet(anzahl);
      BigInteger fakultaetKombiniert = berechneFakultaet(maximum.subtract(anzahl));
      
      // Berechnung und Rückgabe der Chance
      return fakultaetMaxElemente.divide(fakultaetAnzahlGezogeneElemente.multiply(fakultaetKombiniert)).longValue();
      // return 0L; //HIER MUSS PROGRAMMIERT WERDEN      
   }
}

public class Testat03 {  
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
         
      //Lotterie lot = null; //HIER MUSS PROGRAMMIERT WERDEN   
      //Anonyme Klasse
      Lotterie lot = 
          new Lotterie() {
              public int getAnzahl() {
                  try {
                      //int anzahlZuZiehendeWerte = Integer.parseInt(JOptionPane.showInputDialog("Anzahl zu ziehende Werte:"));
                      //return anzahlZuZiehendeWerte;
                      return Integer.parseInt(JOptionPane.showInputDialog("Anzahl zu ziehende Werte:"));
                  } catch(NumberFormatException e) {
                      //Falls kein Integer-Wert eingegeben wird, soll der Nutzer darauf aufmerksam gemacht (in diesem Fall via Kommandozeile) und erneut gefragt werden.
                      System.out.println("Ungültige Eingabe.");
                      return getAnzahl();
                  }
              }
              public int getMaximum() {
                  try {
                      //int anzahlAllerWerte = Integer.parseInt(JOptionPane.showInputDialog("Anzahl alle Werte:"));
                      //return anzahlAllerWerte;
                      return Integer.parseInt(JOptionPane.showInputDialog("Anzahl alle Werte:"));
                  } catch(NumberFormatException e) {
                      //Falls kein Integer-Wert eingegeben wird, soll der Nutzer darauf aufmerksam gemacht (in diesem Fall via Kommandozeile) und erneut gefragt werden.
                      System.out.println("Ungültige Eingabe.");
                      return getMaximum();
                  }
              }
          };
      
      try {     
         // Eingaben werden hier doppelt erfragt; da dies so vorgegeben war, wurden hier auch keine Anpassungen vorgenommen
         // Mein Gedanke war, die Eingaben in Variablen zu puffern. Allerdings wird folgend ja auch für die Ausgabe nochmal die gleiche Funktion aufgerufen.
         long chancen = lot.berechneMoeglichkeiten();
         JOptionPane.showMessageDialog(null,
            "Ihre Chancen für " + lot.getAnzahl() + " aus " + lot.getMaximum() +
            "\nsind 1 in " + chancen + ". Viel Glück!");
      }
      catch(Throwable e) {
          System.out.println("Catch block erreicht");
      }
   }
}