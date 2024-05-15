
package test;


public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println((int) 1.2);
       
       System.out.println( (double) 1/2);
       
       int number1 = (int) (Math.random() * 10);
       int number2 = (int) (Math.random() * 10);
       
       if(number1 > number2)
           System.out.println(number1 + " is greater than " + number2);
       else if (number1 < number2)
                      System.out.println(number1 + " is less than " + number2);
       else
                      System.out.println(number1 + " is equal to " + number2);

       //a + (int) (Math.random() *10) -> makes number between a to b+a-1
       
       int i = 2 + (int) (Math.random() * 12); //between 2-13
       
       System.out.println(i);

               
       System.out.println(Math.random());
       
       
    }
    
}
