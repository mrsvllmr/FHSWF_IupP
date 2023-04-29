package viertertermin;

public class PrintfBeispiele {
   public static void main(String[] args) {
      if (System.console() == null) {
         System.out.println("Konsolenfenster nicht verfügbar.");
      } else {
         int i = 123; 
         double d = 123.456; 
         char c = 'a';
         String str = "abcdefg";
         System.console().printf("%d,%f,%c%n",i,d,c);
         System.console().printf("<%10s>%n",str); 
         System.console().printf("<%f>%n",d);
         System.console().printf("<%.2f>%n",d);
         System.console().printf("<%10.0f>%n",d);
         System.console().printf("<%10.4f>%n",d);  
         System.console().printf("<%010.0f>%n",d);
         System.console().printf("<%010.4f>%n",d);          
         System.console().printf("<%-10.0f>%n",d);
         System.console().printf("<%-10.4f>%n",d); 
         System.console().printf("<%10.0e>%n",d);
         System.console().printf("<%10.4e>%n",d);   
      }
   }
}