package fuenftertermin;

class Buch {
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
}

public class Buchhandel01 {
   public static void main(String[] args) {
      Buch b = new Buch().init("Grundkurs Java", "Dietmar Abts", 39.99f);
      System.out.println(b.toString());
   }
}
