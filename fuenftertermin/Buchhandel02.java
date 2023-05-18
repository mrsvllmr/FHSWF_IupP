package fuenftertermin;

class Buch implements Comparable<Buch> {                                // WICHTIG: implements Comparable<Buch>
   private String titel;
   private String autor;
   private float preis;
  
   public Buch init(String titel, String autor, float preis) {
      this.titel = titel;
      this.autor = autor;
      this.preis = preis;
      return this;
   }
  
   public String getTitel() {
      return titel;
   }
  
   public String getAutor() {
      return autor;
   }
  
   public float getPreis() {
      return preis;
   }
  
   public void setTitel(String titel) {
      this.titel = titel;
   }
  
   public void setAutor(String autor) {
      this.autor = autor;
   }
  
   public void setPreis(float preis) {
      this.preis = preis;
   }

   public String toString() {
      return "Buch [Titel=" + titel + ", Autor=" + autor + ", Preis=" + preis
           + "]";
   }

   public int compareTo(Buch b) {                                       // Hier Besonderheit i.V.g. zu vorheriger Version!
      int i = getAutor().compareTo(b.getAutor());
      if (i != 0) 
         return i;                                                      // Wenn schon Vergleich über Autor möglich, dann returne bereits hier
           
      i = getTitel().compareTo(b.getTitel());
      if (i != 0)
         return i;                                                      // Ansonsten nächster Vergleich über Titel
         
      i = (getPreis()>b.getPreis())?1:((getPreis()<b.getPreis())?-1:0);
      return i;                                                         // Ansonsten nächster Vergleich über Preis
   }
}

public class Buchhandel02 {
   public static void main(String[] args) {
       Buch buch1 = new Buch().init("Titel", "Autor", 123);             // BEACHTE Art und Weise der Instanziierung
       Buch buch2 = new Buch().init("Titela", "Autora", 1234);
       int ergebnis = buch2.compareTo(buch1);                           // Rückgabetyp: Wenn aktuell > übergeben, dann 1; andersherum -1; wenn gleich, dann 0
       System.out.println(ergebnis);
   }
}
