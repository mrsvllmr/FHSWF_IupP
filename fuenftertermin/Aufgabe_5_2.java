package fuenftertermin;

interface WarteSchlange<T> {
   void add(T wert);
   T remove();
   boolean isEmpty();
}

class Knoten<T> {  
   private T wert; 
   private Knoten<T> nachfolger; 
   public Knoten<T> init(T wert, Knoten<T> nachfolger) {
      this.wert = wert;
      this.nachfolger = nachfolger;
      return this;
   }
   public T getWert() {
      return wert;
   }
   public Knoten<T> getNachfolger() {
      return nachfolger;
   }
   public void setNachfolger(Knoten<T> nachfolger) {
      this.nachfolger = nachfolger;
   }  
}

public class Aufgabe_5_2 implements WarteSchlange<String> {
   private Knoten<String> aeltester, juengster;
   public void add(String wert) {
      Knoten<String> neu = new Knoten<String>().init(wert, null);
      if (aeltester != null) { 
         juengster.setNachfolger(neu);
         juengster = neu;
      } else { 
         juengster = aeltester = neu;
      }
   }
   
   public String remove() {
      String returnWert = null;
      if (aeltester != null) {
         returnWert = aeltester.getWert();
         aeltester =  aeltester.getNachfolger();
      }
      return returnWert;
   }
   
   public boolean isEmpty() {
      return aeltester == null;
   }
   
   public static void main(String[] args) {
      WarteSchlange<String> s = new Aufgabe_5_2();
      String t;
      for (int i=0;i<2;i++) { // 2 mal ausführen
         for (int j=0;j<5;j++) { // 5 einfügen
             s.add("Eintrag "+(10*i+j));
         }
         for (int j=0;j<3;j++) { // 3 entnehmen
            System.out.println(s.remove()); 
         } 
         for (int j=5;j<10;j++) { // 5 einfügen
            s.add("Eintrag "+(10*i+j));
         }           
         while ((t = s.remove()) != null) { // alle entnehmen
            System.out.println(t);
         }
      }  
   }   
}