
package taskthread;

import java.util.concurrent.*;


public class TaskThread {

    
    public static void main(String[] args) {
        //Runnable printA = new PrintChar('a', 10);  //boomer way to make tasks and threads
        //Runnable printB = new PrintChar('b', 10); 
        //Runnable printOneHund = new PrintNum(10);
        
        //Thread thread1 = new Thread(printA);
        //Thread thread2 = new Thread(printB);
       // Thread thread3 = new Thread(printOneHund);
        
        //thread1.start(); // run() from thread, not from task itself
        //thread2.start();
        //thread3.start();
        /*
        thread1.setPriority(1);
        thread2.setPriority(5);
        thread3.setPriority(10);
*/
        ExecutorService excutor = Executors.newFixedThreadPool(1); //new pool using specified # threads
        
        excutor.execute(new PrintChar('a', 10)); // creates tasks and adds to pool
        excutor.execute(new PrintChar('b', 10));
        excutor.execute(new PrintNum(10));
        
        excutor.shutdown(); // shuts down excutor
    }
    
}
class PrintChar implements Runnable{
    
    private char charPrint;
    private int times;
    
    public PrintChar(char c, int t)
    {
        charPrint= c;
        times = t;
    }
    
    @Override
    public void run(){
        for(int i =0; i < times; i++)
        {
            
            System.out.print(" " + charPrint);
            Thread.yield();
        }
    }
    
}

class PrintNum implements Runnable
{
    private int lastNum;
    
    public PrintNum(int _lastNum)
    {
        lastNum = _lastNum;
    }
    
    @Override
    public void run(){
        Thread thread4 = new Thread(new PrintChar('c',40));
       // thread4.start();
       // try{
        for(int i =0; i <= lastNum; i++)
        {
            System.out.print(" " + i );
            //if(i==5)
                //thread4.join(); // wait for prev thread then do entirety of this thread
                //Thread.yield(); //after 50 pause and wait for next thread
               
            
        }
    }
       // catch(InterruptedException ex){
         //   }
        //    }
    }
