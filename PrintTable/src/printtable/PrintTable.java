
package printtable;

import java.util.concurrent.*;


public class PrintTable {

    
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3); // new pool
        
        Print p1 = new Print(); // new tasks
        Print p2 = new Print();
        Print p3 = new Print();
        Print p4 = new Print();
        
        executor.execute(p1); // assign task to thread pool
        executor.execute(p2);
        executor.execute(p3);
        executor.execute(p4);
        
        executor.shutdown(); // shuts down executor after task are done
    }
    
}

class Print implements Runnable
{
    private static int number = 1; // static = one number for all objects in class
    
    public static synchronized void printTable() // sync makes each thread wait to first to finish 
    {
        for (int i =0; i < 100; i++)
        {
            System.out.println(number + " ");
            number++;
        }
    }
    
    @Override
    public void run()
    {
        printTable();
    }
}
