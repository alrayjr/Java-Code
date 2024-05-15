
package generics;

import java.util.Arrays;




public class Generics {

   
    public static void main(String[] args) {
        
        
 
        
        GenericStackArray<Integer> stack1 = new GenericStackArray<>();
        
        stack1.push(1); 
        stack1.push(2); 
        stack1.push(3); 
        stack1.push(4);

        System.out.println(stack1.toString());
        
        stack1.pop();
        System.out.println(stack1.toString());
        
        GenericStackArray<String> stack2 = new GenericStackArray<>();
        stack2.push("Luck");
        stack2.push("Duck");
        stack2.push("Tuck");
        stack2.push("Zuck");
        System.out.println(stack2.toString());
        stack2.pop();
        System.out.println(stack2.toString());

        
        
    }
    
}

class GenericStackArray<E>
{
   E [ ] list = (E[ ]) new Object[1];
   E [ ] copy = (E[ ]) new Object[list.length];
   
   

    
    public int getSize()
    {
        return copy.length;
    }
    
    public E peek() // peek at top of stack
    {
        return copy[copy.length-1];
    }
    
    public void push(E o) // E data type of object
    {
     
     
     if(list.length == 1)
     {
        list = (E[ ]) new Object[2];
        list[0] = o;
        
     }
     else
     {
         copy = (E[ ]) new Object[list.length+1];
         for(int i = 0; i < list.length; i++)
         {
             copy[i] = list[i];
         }
         
         copy[copy.length -2 ] = o;
         list = copy; 
     } 
   copy = (E[ ]) new Object[list.length -1];
        for(int i = 0; i < list.length-1; i++)
         {
             copy[i] = list[i];
         }
    }
    
    public E pop() // removes last item and returns it
    {
         E [ ] temp = (E[ ]) new Object[copy.length -1];
         E hold = copy[copy.length -1];
         for(int i = 0; i < temp.length; i++)
         {
             temp[i] = copy[i];
         }
         
         
         copy = temp;
         
         return hold;
       
    }
    
    public boolean isEmpty()
    {
        if (copy.length == 0)
            return true;
        else
            return false;
    }
    
    @Override
    public String toString()
    {
        
        return "My Stack: " + Arrays.toString(copy) ;
    }
}