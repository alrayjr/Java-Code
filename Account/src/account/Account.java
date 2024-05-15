
package account;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Account {

    private static Accounts account = new Accounts();
    
    public static void main(String[] args) {
        ExecutorService exe = Executors.newFixedThreadPool(10);
                
                for (int i = 0; i < 100; i++)
                {
                    exe.execute(new AddADollarTask()); // add a dollar must be static to be accessed here
                }
                exe.shutdown();
                while(!exe.isTerminated())
                {
                    
                }
                System.out.println("Balance is " + account.balance);
    }
    public static class AddADollarTask implements Runnable
    {
        @Override
        public void run()
        {
            account.deposit(1);
        }
    }
    
    private static class Accounts
    {
       private int balance = 0;
       
       public int getBalance()
       {
           return balance;
       }
       
       public synchronized void deposit(int amount)
       {
           int newBalance = balance + amount;
           
           try
           {
               Thread.sleep(5); 
           }
           catch(InterruptedException ex){
               
           }
           balance = newBalance;
       }
    }
}


