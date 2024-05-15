
package helloworld;

import java.util.Date;
import java.util.Scanner;

//import java.util.*;

public class HELLOWORLD {

    public static void main(String[] args) {
       
        System.out.println("Hello World!");
        System.out.println("...Freaky");
        
        Date now = new Date();
        
        System.out.println(now);  
        
        Scanner input = new Scanner(System.in);
        
        String name = input.nextLine();
        
        System.out.println(name);
          
    }
    
}
