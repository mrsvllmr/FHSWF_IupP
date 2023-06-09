package sechstertermin;

import java.util.concurrent.*;
public class BankAccount_Sync {
   private volatile double balance;
   
   public synchronized void credit(double amount){
      balance = balance + amount; 
   }
   
   public synchronized void debit(double amount){ 
      balance = balance - amount; 
   }
   
   public double getBalance(){
      return balance;
   }
   
   public static void main(String[] args) throws InterruptedException {
      final BankAccount_Sync bankAccount = new BankAccount_Sync();
      ExecutorService executorService = Executors.newFixedThreadPool(10);
      for (int i=0; i < 100; i++) {
         executorService.execute(()-> bankAccount.debit(100)); 
         executorService.execute(()-> bankAccount.credit(100)); 
      }
      executorService.shutdown(); 
      while (!executorService.isTerminated()) {
         Thread.sleep(100);
      }
      System.out.println("Final Balance: " + bankAccount.getBalance()); 
   }
   
}