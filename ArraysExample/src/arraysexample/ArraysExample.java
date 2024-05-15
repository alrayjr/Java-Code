
package arraysexample;

public class ArraysExample {

    public static void fun(int number, int [] numbers) //numbers are passed by value, but arrays are apssed by reference
    {
        number = 10;
        numbers[0] = 5;
    }

    public static void main(String[] args) {
        //double arr[];
        double [] myList; //myList will point to an array, creates myList reference on stack
        myList = new double [3]; //creates a new 3 space on heap and assignes myList to point to the 1st element on heap
        
        myList[0] = 5.6;
        myList[1] = 3.2;
        myList[2] = 3.2;
        
        System.out.println(myList.length);
        
        double [] list1={2.1, 3.2}, list2={4.2, 6.2};
        
        /*list1 = list2; reassignes list1 to point to the same location of list2
                         list1's origninal data is deleted due to javas automatic garbage collection */
        
        System.arraycopy(list2, 0, list2, 0, list2.length); 
        
        int x = 1;
        int [] y = new int[10];
        
        fun(x,y);
        
        System.out.println(x); // x doesnt change due to pass by value
        System.out.println(y[0]); // y does change due to pass by reference
        
        double [] numbers = {6.2, 3.2, 4.1, 8.4};
        
        java.util.Arrays.sort(numbers);
        
        System.out.println(numbers[0]); //sorts and changes orignal array
        
    }
    
}
