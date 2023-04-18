package viertertermin;

class RekursiveMethoden03 {
   static long ggT_Iteration(long a, long b){
      long r;
      while (b != 0) {
         r = a % b;
         a = b;
         b = r;
      }
      return a;
   }
   static long ggT_Rekursion(long a, long b){
      long r = a % b;
      if (r == 0)
         return b;
      else
         return ggT_Rekursion(b, r);
   }
   public static void main(String[] args) {
      final int ITERATIONEN = 1_000;
      long[] a = new long[ITERATIONEN];
      long[] b = new long[ITERATIONEN];  
      for (int i=0; i < ITERATIONEN; i++){
         a[i] = Math.round(Math.random()*1_000_000);
         b[i] = Math.round(Math.random()*1_000_000);       
      }         
      long start;
      start = System.nanoTime();
      for (int i=0; i < ITERATIONEN; i++)
         ggT_Iteration(a[i],b[i]);
      System.out.println("Iteration in Nanosekunden: " 
         + (System.nanoTime() - start)/ITERATIONEN);  
      start = System.nanoTime();
      for (int i=0; i < ITERATIONEN; i++)
         ggT_Rekursion(a[i],b[i]);
      System.out.println("Rekursion in Nanosekunden: " 
         + (System.nanoTime() - start)/ITERATIONEN);         
   }
}