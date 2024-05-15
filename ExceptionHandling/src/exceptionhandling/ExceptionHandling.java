
package exceptionhandling;

//import java.util.InputMismatchException;
//import java.util.Scanner;
//or 
import java.util.*;
public class ExceptionHandling {

    public static int quotient(int num1, int num2)
    {
        if(num2 ==0)
            throw new ArithmeticException("Divisor cannot be zero");
        return num1/num2 ;
    }
    public static void main(String[] args) 
    {
        try{
            quotient(4,0);
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Exception: an integer cannot be divided by zero");
        }
        
       System.out.println("Execution Continuies ...");
      
       boolean continueInput = true;
       Scanner input = new Scanner(System.in);
       do {
           try{
               System.out.println("Enter and integer: ");
               int number = input.nextInt();
               
               System.out.println("The number entered is " + number);
               continueInput = false;
           }
           catch(InputMismatchException ex)
           {
               System.out.println("Try again. Incorrect input: an integer is required");
               
               input.nextLine();
           }
       
       }while(continueInput);
    }
    
}
