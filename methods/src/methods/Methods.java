
package methods;


public class Methods { // functions

    public static int max(int num1, int num2)
    {
        if (num1 > num2)
            return num1;
        else
            return num2;
        
    }
    public static double max(double num1, double num2) //fucntion overloading
    {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
    
    
    public static void main(String[] args) {
        int result = max(4, 6); // can call max function without object cause its static otherwise youd have to make an object than, use object.max()
        
        double result2 = max(3.0, 42.6);
        
        System.out.println(result2);
    }
    
}
