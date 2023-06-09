import javax.swing.JOptionPane; 

// public class Aufgabe_4_3 { 
 
 // public static void main(String[] args) { 
    // // gibBitmusterAus(Integer.parseInt(System.console().readLine("%s", "Für welchen Int-Wert möchten Sie das Bitmuster sehen?")));
    // gibBitmusterAus(Integer.parseInt(JOptionPane.showInputDialog("Für welche Zahl möchten Sie das Bitmuster sehen?")));
    // JOptionPane.showMessageDialog(null,(gibBitmusterAusRekursiv(Integer.parseInt(JOptionPane.showInputDialog("Für welche Zahl möchten Sie das Bitmuster sehen?")),31)));
 // } 
 
 // static void gibBitmusterAus(int a) {
     // String bitmuster = "";
     
     // for(int i=31; i>=0; i--) {
          // if((1 << i & a) != 0) {
              // bitmuster += "1"; 
          // } else {
              // bitmuster += "0"; 
          // }
      // }
      
     // //System.out.print(bitmuster);
     // JOptionPane.showMessageDialog(null, "Das Bitmuster für Ihre Eingabe " + a + " sieht wie folgt aus:\n " + bitmuster);
 // }
 
 // static String gibBitmusterAusRekursiv(int zahl, int bit) {                 // WICHTIG: Bei dieser Variante Rückgabeyp String, weil die ja immer wieder aufgerufen wird und den String erweitert
     // // Aufgrund der Rekursion ist hier besonders auf die Reihenfolge zu achten bzw. diese umzudrehen, da der letzte Aufruf ja zuerst beendet wird
     // String bitmuster = "";
     
     // if(bit<0) return "";
     // else return ((zahl >> bit) & 1)+gibBitmusterAusRekursiv(zahl,bit-1);
 // }
 
// }

import javax.swing.JOptionPane; 
public class Aufgabe_4_3 { 
 static String iteration(int a) { 
     String s = ""; 
     for (int i = 31; i >= 0; i--) { 
         if ((1 << i & a) != 0)                             // Verundung von einer um x Stellen nach links verschobenen 1 (Rest Nullen) und dem Input-Wert -> Ergebnis ist Wert > 0 oder 0
             s += "1"; 
         else 
             s += "0"; 
     } 
 return s; 
 }
 
 static String rekursion(int a, int bit) { 
     if (bit < 0) 
         return ""; 
     else 
         //return ((a>>bit)&1)+rekursion(a,bit-1);          // Verundung von dem um x Stellen nach rechts verschobenen Input-Wert und einer 1 -> Ergebnis ist hier also immer 0 oder 1 (und nicht > 0 wie bei obiger iterativer Variante!)
         if((1 << bit & a) > 0) {
             return "1"+rekursion(a,bit-1);
         } else {
             return "0"+rekursion(a,bit-1);
         }
         // return (1 << bit & a)+rekursion(a,bit-1);            
 } 
 
 public static void main(String[] args) { 
     int a = Integer.parseInt(JOptionPane.showInputDialog("Zahl:")); 
     //System.out.println(iteration(a).equals(rekursion(a,31))); 
     JOptionPane.showMessageDialog(null, 
     "Die kanonische 32-Bit-Darstellung im Zweierkomplement " + 
     "der Zahl\n" + a + 
     "\nist\n" + rekursion(a,31)); //iteration(a)); 
     //statt iteration(a) auch rekursion(a,31) möglich 
 } 
} 