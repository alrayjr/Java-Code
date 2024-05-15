
package lab2;


public class Lab2 {


    public static void main(String[] args) {
        Integer [] x = {1,2,3,4,5,6,7,8,9,10} ;
        for(int i=0; i <10; i++)
            System.out.printf(" %-2d " ,x[i]);
        
        System.out.println("\n Now in Reverse");
        
        for(int i=9; i >=0; i--)
            System.out.printf(" %-2d ",x[i]);
        
       
    }
}
