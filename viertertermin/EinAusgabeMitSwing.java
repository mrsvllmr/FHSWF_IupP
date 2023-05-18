package viertertermin;

import javax.swing.JOptionPane;                                         // WICHTIG
public class EinAusgabeMitSwing {
   public static void main(String[] args) {
      int a, b;
      a = Integer.parseInt(JOptionPane.showInputDialog("Erste Zahl:")); // Funktion wichtig!!!
      b = Integer.parseInt(JOptionPane.showInputDialog("Zweite Zahl:"));// s.o. 
      JOptionPane.showMessageDialog(null,a+" + "+b+" = "+(a+b));        // Klammer um a+b, damit hier erst gerechnet wird!
   }
}