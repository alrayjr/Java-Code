
package lab7;

import java.util.ArrayList;
import java.util.Arrays;


public class Lab7 {
    public static void main(String[] args) {
        Integer test[] = new Integer[]{1,2,10,5,7,9};
        System.out.println("max number is " + max(test));
        
        ArrayList<Character> charList= new ArrayList<>(Arrays.asList('b','r','B','g','b','A','c','b')) ;
        System.out.println("Nonduplicate list is " + removeDuplicated(charList));
    }
    
       public static <E> ArrayList <E> removeDuplicated (ArrayList<E> list)
    {
       ArrayList<E> New = new ArrayList<>();
       for(int i = 0; i< list.size(); i++)
       {
           if(!New.contains(list.get(i)))
               New.add(list.get(i));
       }
       return New;
    }
    public static <E extends Comparable<E>> E max(E [] list) 
    {
        E l = list[0];
        for(int i=0; i < list.length; i++ )
        {
            if (list[i].compareTo(l) > 0)
            {
                l = list[i];
            }
        }
        return l;
    }
    
    
}
