
package pkgabstract;


public class Abstract {

    public static void display(Animal A)
    {
        System.out.println(A.Sound());
    }

    public static void main(String[] args) {
       
    }
    
}
abstract class Animal // objects cannot be created from abstract class
{
    private double weight;
    public double getW() // in abstact = will be used as is in sub classes
    {
        return weight;
    }
    public void setW()
    {
        this.weight = weight;
    }
    public abstract String Sound(); //abstract method = declares every subclass will have sound function but they will be defined/implemented and overridden in each class instead of here
}

class Chicken extends Animal
{
    @Override
    public String Sound()
    {
        return "Bock Bock";
    }
    
}

class Tiger extends Animal
{
@Override
    public String Sound()
    {
        return "Roar";
    }
}