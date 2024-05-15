/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circleclassexception;

/**
 *
 * @author epicb
 */
public class CircleClassException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            new CircleException(5);
            new CircleException(-5);
            new CircleException(8);
        }
        catch(InvalidRadiusException ex)
        {
            System.out.println(ex);
        }
        System.out.println("Num of objects created = " + CircleException.getNumberOfObjects());
        
        try
        {
            method();
             System.out.println("After Method Called" );
        }
        catch(RuntimeException ex)
        {
             System.out.println("RuntimeException in main" );
        }
        catch(Exception ex)
        {
             System.out.println("Exception in main" );
        }
    }
    
    public static void method() throws Exception
    {
        try{
            CircleException c1 = new CircleException(1);
            c1.setRadius(-1);
            System.out.println(c1.getRadius());
        }
        catch(RuntimeException ex)
        {
            System.out.println("Runtime Exception in method()" );
        }
        catch(Exception ex)
        {
             System.out.println("Exception in method()" );
             throw ex;
        }
    }
}
