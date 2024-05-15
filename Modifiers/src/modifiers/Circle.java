
package modifiers;


public class Circle {
    
    private double radius = 1;
    
    private static int numOfObjects = 0; // static = same variable shared by all classes made with this classes constuctors
    
    private static final double PI = 3.141592; // static = every object refers to this one variable, final= const= cannot be changed
    
    public Circle()
    {
        numOfObjects++;
    }
    public Circle(double _radius){
       setRadius(_radius);
       numOfObjects++;
    }
    //get and set methods = encapsulation 
    public void setRadius(double _radius)//void = return nothing
    {
        if (_radius >= 0)
            radius = _radius;
    }
    public double getRadius()
    {
        return radius;
    }
    
    public double getArea(){
        return radius * radius * PI;
    }
    public static int getNumOfObjects(){ //call without using specific object, since its a static method
        return numOfObjects;
    }
}
