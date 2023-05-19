package sechstertermin;

import java.util.concurrent.*;
public class BankAccount_Raw {
   private double balance;
   public void credit(double amount){
      balance = balance + amount; 
   }
   public void debit(double amount){ 
      balance = balance - amount; 
   }
   public double getBalance(){
      return balance;
   }
   public static void main(String[] args)throws InterruptedException{
      final BankAccount_Raw bankAccount = new BankAccount_Raw();
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