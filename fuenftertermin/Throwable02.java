package fuenftertermin;

import javax.swing.JOptionPane;
public class Throwable02 {
   public static void main(String[] args) {
      try {
         int a, b;
         a = Integer.parseInt(JOptionPane.showInputDialog("Erste Zahl:"));
         b = Integer.parseInt(JOptionPane.showInputDialog("Zweite Zahl:")); 
         JOptionPane.showMessageDialog(null,a+" + "+b+" = "+(a+b)); 
      }
      catch(NumberFormatException e) {
         JOptionPane.showMessageDialog(null,
            "Sie haben keine Zahl eingegeben.\n" +
            "Programm bricht ab.");       
      }
      catch(Throwable e) {
         JOptionPane.showMessageDialog(null,
            "Es ist ein Fehler aufgetreten.\n" +
            "Programm bricht ab.\n" +
            "Details:\n" + e.getMessage());       
      }      
   }
}