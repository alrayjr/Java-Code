/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circleclassexception;

/**
 *
 * @author epicb
 */
public class InvalidRadiusException extends Exception{
    
    private double radius;
    
    public InvalidRadiusException(double radius)
    {
        super("Invalid Radius" + radius);
                this.radius = radius;
    }
    public double getRadius()
    {
        return radius;
    }
}
