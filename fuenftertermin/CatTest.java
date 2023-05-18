package fuenftertermin;

class Cat {                                     // Klasse Cat mit einem Attribut "name" und entsprechenden setter-/getter-Methoden
   private String name;                         // Reminder: Attribute private, damit setter/getter ausschlaggebend
   public void setName(String name) {
      this.name = name;
   }
   
   public String getName() {
      return name;
   }
}

public class CatTest {   
   public static void main (String[] args) {    // Erstellen einer Cat-Instanz und initialisieren/Ausgabe des Attributs
      Cat moggy = new Cat();
      //moggy.name = "Moggy"; //FALSCH
      moggy.setName("Moggy"); //RICHTIG
      System.out.println(moggy.getName());
   }
}
