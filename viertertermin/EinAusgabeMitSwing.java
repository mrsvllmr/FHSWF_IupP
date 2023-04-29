package viertertermin;

import javax.swing.JOptionPane;
public class EinAusgabeMitSwing {
   public static void main(String[] args) {
      int a, b;
      a = Integer.parseInt(JOptionPane.showInputDialog("Erste Zahl:"));
      b = Integer.parseInt(JOptionPane.showInputDialog("Zweite Zahl:")); 
      JOptionPane.showMessageDialog(null,a+" + "+b+" = "+(a+b)); 
   }
}