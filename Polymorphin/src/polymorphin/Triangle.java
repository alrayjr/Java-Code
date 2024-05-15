
package polymorphin;


public final class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;
    
    public Triangle(){
        side1 = 1;
        side2 = 1;
        side3 = 1;
        
    }
    public Triangle(double _side1, double _side2 , double _side3, String color, boolean filled){
        super(color, filled);
        setSide1(_side1);
        setSide2(_side2);
        setSide3(_side3);

        
    }
    public void setSide1(double _side1)
    {
        if(_side1<=0)
        {
            side1 = 1;
        }
        else
        {
            side1 = _side1;
        }
    }
    public void setSide2(double _side2)
    {
        if(_side2<=0)
            side2 = 1;
        else
            side2 = _side2;
    }
    public void setSide3(double _side3)
    {
        if(_side3<=0)
            side3 = 1;
        else
            side3 = _side3;
    }
    
    public double getSide1()
    {
        return side1;
    }
    public double getSide2()
    {
        return side2;
    }
    public double getSide3()
    {
        return side3;
    }
    
    public double getPerimeter()
    {
        return side1+side2+side3;
    }
    public double getArea()
    {
        double s = getPerimeter()/2;
        return Math.sqrt(s* (s -side1)* (s- side2)* (s- side3));
    }
    @Override
    public String toString() {
    return "\narea is " + getArea() + "\nperimeter is " + getPerimeter() + "\nColor: " + color + "\ncreated on " + getDateCreated() + "\nfilled: " + isFilled() + "\n";
    }
}
