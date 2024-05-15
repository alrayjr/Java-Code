/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author epicb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                final double PI = 3.1415;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the radius of a circle: ");
                
        double radius = input.nextDouble();
        
        double area = Math.pow(radius, 2) * PI;
        
        System.out.println("the area of the circle is " + area);
    }
    
}
