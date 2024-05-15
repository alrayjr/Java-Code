
package testcircle;


public class TestCircle { //main class is always public


    public static void main(String[] args) {
            Circle cir1 = new Circle(); // default access is " package private"
            Circle cir2 = new Circle(2);
            
            System.out.println(cir1.radius);
            System.out.println(cir2.radius);
            System.out.println(cir2.getArea());
    }
    
}

class Circle // all other classes are like "helper" classes, can be created in same file(as shown) but usually done with seperate files
{
    double radius;
    
    Circle() // no arg constuctor
    {
        radius = 1;
    }
    Circle(double _radius) // user defined constructor
    {
        radius = _radius;
    }
    double getArea() //get method
    {
        return radius * radius * Math.PI;
    }

    
}