package fuenftertermin;

import javax.swing.JOptionPane;
public class Throwable02 {
   public static void main(String[] args) {
      try {
         int a, b;
         a = Integer.parseInt(JOptionPane.showInputDialog("Erste Zahl:"));      // Erfragen des Inputs über Eingabemaske
         b = Integer.parseInt(JOptionPane.showInputDialog("Zweite Zahl:"));     // s.o.
         JOptionPane.showMessageDialog(null,a+" + "+b+" = "+(a+b));             // Ausgabedialog (Info, keine Eingabe)
      }
      catch(NumberFormatException e) {                                          // Abfangen einer möglichen NumberFormatException
         JOptionPane.showMessageDialog(null,
            "Sie haben keine Zahl eingegeben.\n" +
            "Programm bricht ab.");       
      }
      catch(Throwable e) {                                                      // Abfangen weiterer Throwable Exceptions -> BEACHTE: Reihenfolge! (spezifisch --> allg.)
         JOptionPane.showMessageDialog(null,
            "Es ist ein Fehler aufgetreten.\n" +
            "Programm bricht ab.\n" +
            "Details:\n" + e.getMessage());                                     // getMessage offenbar Methode der Exceptions
      }      
   }
}