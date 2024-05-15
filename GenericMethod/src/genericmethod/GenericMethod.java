/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genericmethod;

/**
 *
 * @author epicb
 */
public class GenericMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer int1 = new Integer(7); // unneccessatry boxing
        Integer int2 = 6;//autoboxing
        
        int max = max(int1,int2);// autounboxing
        
        System.out.println("the max number is " + max + " ....");
        
        Character ch1 = new Character('a');
        Character ch2 = 'A';
        
        char maxch = max(ch1,ch2);
        
        System.out.println("the max character is " + maxch + " ....");
    }
    
    public static <E extends Comparable<E>> E max(E o1,E o2) // have to use comparable due to being more specific
    {
        if(o1.compareTo(o2) == 1)
            return o1;
        else
            return o2;
    }
}
