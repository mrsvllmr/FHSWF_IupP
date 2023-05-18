package Testat01;

/*
Bei einem float-Wert sind nur etwa 7 signifikante Dezimalstellen garantiert. 
Folglich kann ein Java-Programm den float-Wert 1.0f bei fortgesetzter Halbierung 
(1.0f, 0.5f, 0.25f, ...) irgendwann nicht mehr von 0.0f unterscheiden. 
Bestimmen Sie mit einem Testprogramm die Anzahl der fortgesetzten Halbierungen 
bei der dies zum ersten Mal auftritt.
*/
class Testat01 {
   public static void main(String[] args){
      int i = 0;
      float d = 1.0f;
      while (d > 0.0f) {
         i++;
         d *= 0.5f;
      }
      System.out.println(i);
   }
}