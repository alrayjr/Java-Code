
package circleclassexception;

public class CircleException {
    
    private double radius;
    
    public static int numberOfObjects = 0;
    
    public CircleException()
    {
        this.radius = 1;
        numberOfObjects++;
    }
    public CircleException(double radius) throws InvalidRadiusException
    {
        setRadius(radius);
        numberOfObjects++;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double newRadius) throws InvalidRadiusException
    {
        if (newRadius >= 0)
            this.radius = newRadius;
        else
            throw new InvalidRadiusException(newRadius);
    }
    public static int getNumberOfObjects()
    {
        return numberOfObjects;
    }
}
