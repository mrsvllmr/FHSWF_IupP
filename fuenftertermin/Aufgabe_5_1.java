package fuenftertermin;

class Windgeschwindigkeit {
   
   private static final double WINDSTILLE = 2.0;
   
   private static final double ORKAN = 120.0;   

   private double kilometerProStunde = 0.0;

   public Windgeschwindigkeit init(double kilometerProStunde) {
      this.kilometerProStunde = Math.max(0.0,kilometerProStunde);
      return this;
   }

   public boolean istOrkan() {
      return getKilometerProStunde() >= ORKAN;
   }

   public boolean istWindstille() {
      return getKilometerProStunde() < WINDSTILLE;
   }
   
   public double getKilometerProStunde() {
      return kilometerProStunde;
   }

   public double getKnoten() {
      return getKilometerProStunde() / 1.852;
   }

   public int getBeaufortWert() {
      int beaufort =  
         (int) (Math.pow(getKilometerProStunde()/3.01,0.6666)+0.5);
      return Math.min(12,beaufort);
   }
}

public class Aufgabe_5_1 {
   public static void main(String[] args) {
      Windgeschwindigkeit a = new Windgeschwindigkeit().init(90.0);
      System.out.println("Windgeschwindigkeit " + 
         a.getKilometerProStunde() + " km/h bedeutet:");
      System.out.println("Knoten = " + a.getKnoten());
      System.out.println("Beaufortwert = " + a.getBeaufortWert());          
      System.out.println("Windstille? = " + a.istWindstille());   
      System.out.println("Orkan? = " + a.istOrkan());            
   }
}