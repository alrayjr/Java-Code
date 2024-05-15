
package twocities;

import java.util.Scanner;

public class Twocities {

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();
        
        if(city1.compareTo(city2) < 0)
            System.out.println("The cities in alpabetical order are " + city1 +" and " + city2);
        else
            System.out.println("The cities in alpabetical order are " + city2 +" and " +  city1);
        
        int value = Integer.parseInt("421");
        
        System.out.println(value);
        
        double value2 = Double.parseDouble("321.5123");
        
        System.out.println(value2);
        
        String s = input.nextLine();
        char ch = s.charAt(0);
        System.out.println(ch);
        
        String s1 = "ABCD";
        String s2 = "ABCD";
        
        if(s1.equals(s2)) //not if(s1 == s2)
            System.out.println("they are equal objects");
        
    }
    
}
