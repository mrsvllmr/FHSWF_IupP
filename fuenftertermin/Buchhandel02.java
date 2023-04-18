package fuenftertermin;

class Buch implements Comparable<Buch> {
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

   public int compareTo(Buch b) {
      int i = getAutor().compareTo(b.getAutor());
      if (i != 0) 
         return i;
           
      i = getTitel().compareTo(b.getTitel());
      if (i != 0)
         return i;
         
      i = (getPreis()>b.getPreis())?1:((getPreis()<b.getPreis())?-1:0);
      return i; 
   }
}
public class Buchhandel02 {
   public static void main(String[] args) {
    
   }
}
