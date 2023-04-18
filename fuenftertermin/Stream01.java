package fuenftertermin;

import java.util.*;
import java.util.stream.*;
public class Stream01 {
   public static void main(String[] args) {
      Stream.of(-4,1,-2,3); 
      Stream.generate(Math::random);
      Stream.generate(new Random()::nextGaussian);
      Stream.of("John","Paul","George","Ringo"); 
      Stream.iterate(2,x -> x*x);
   }
}