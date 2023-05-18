package drittertermin;

class CastingExplicit {
   public static void main(String[] args) {
      double a = 7294452388.13;             
      System.out.println((int) a);          // Annahme: "7294452388"
                                            // FALSCH, beachte anderen Datentyp
                                            // Gibt maximalen Int-Wert aus: 2.147.483.647
                                            // --> Bei Casting mit zu großem Wertebereich wird auf maximalen Wert gesetzt!
      double anegativ = -7294452388.13;    
      System.out.println((int) anegativ);   // --> Bei Casting mit zu großem Wertebereich wird auf maximalen Wert gesetzt! (d.h. bei negativen Werten dann auf kleinstmöglichen Wert)
      
      System.out.println("Max Int:" + Integer.MAX_VALUE);
      System.out.println("Max Int + 1: " + (Integer.MAX_VALUE+1));  // -2.147.483.648
      
      double b = 2147483647.0; 
      System.out.println((int) b);          // 2.147.483.647
      int c = 2147483647;
      System.out.println(c+c);              // -2 --> 2.147.483.647 + 1 = -2.147.483.648 + 2147483646 = -2 --> Überlauf im für mich "klassischen" Sinne
   }
   
}