package fuenftertermin;

import java.util.stream.*;
public class Stream02 {
   public static void main(String[] args) {
      //Listet 10 Sinuswerte ab PI-Halbe
      Stream.iterate(Math.PI/2,d -> d + 0.1)  
            .limit(10)                          
            .map(Math::sin)                       
            .forEach(System.out::println);
      //Sortierung von 9 4 3 mit peek
      Stream.of(9,4,3)
         .peek(System.out::println)  // 9 4 3
         .sorted()
         .forEach(System.out::println); // 3 4 9
      //Sortierung mit Entfernung von Duplikaten
      Stream.of(3, 2, 2, 1, 1, 3)
         .distinct()
         .sorted()
         .forEach(System.out::println); // 1 2 3    
      //Zeichenkettenverarbeitung
      boolean match = Stream.of("9","4","3")
         .map(s -> Integer.parseInt(s))
         .noneMatch(i -> i == 5);  
      System.out.println(match); //true         
   }
}