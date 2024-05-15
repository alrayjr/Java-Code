
package lab2;
 
import java.util.Random;

public class Lab2 {


    public static void main(String[] args) {
       System.out.println("Your New Licence Plate Number is:");
        
        String Up = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random r = new Random();
        int index = (int)Math.floor(Math.random()*(25)+0);
            System.out.println(Up.charAt(index));
        int index1 = (int)Math.floor(Math.random()*(25)+0);
            System.out.println(Up.charAt(index1));
        int index2 = (int)Math.floor(Math.random()*(25)+0);
            System.out.println(Up.charAt(index2));
        
                int[] x = new int[4];
       for(int i=0; i<x.length; i++)
       {
            x[i] = (int)Math.floor(Math.random()*(9)+0);
            System.out.println(x[i]);
       }
       
        
 
            
       
       
    }
}
