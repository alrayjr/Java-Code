
package writedata;

import java.util.Scanner;

public class WriteData {

  
    public static void main(String[] args) {
        try{
            write(); // try write method return error here if any
            
            java.io.File file = new java.io.File("Scores.txt"); // creates file object
            Scanner input = new Scanner (file); // need scanner since read takes a scanner object (write() makes its own). 
            read(input); 
        }
        catch(java.io.IOException ex)
        {
            System.out.println("Mad errors here");
        }
    }
    
    
    
    
    
    public static void write()throws java.io.IOException //creates write meathod that can throw an IO Exception, to created scores.txt file
    {
        java.io.File file = new java.io.File("scores.txt");
        if(file.exists())
        {
            System.out.println("FIle already exists");
            System.exit(0);
           
        }
        try ( //With normal parenthesis new file created will be closed outomatically instead of having to do it by hand via output.close();
                //try "With recorces", different from try/catch block
            java.io.PrintWriter output = new java.io.PrintWriter(file); // print writer to write to file
            )
        {
            output.print("Adrian Ray");
            output.println(90);
            
            output.print("JoE BiDeN");
            output.println(85);
        }
        
    }
    public static void read(Scanner input) throws java.io.IOException //creates read meathod that can throw an IO Exception
    {
        while(input.hasNext())// if try is not used "closing" must be done manually
        {
            String firstName = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            
            System.out.println(firstName + " " + lastName + " " + score);
            
            input.close();
        }
    }
}
