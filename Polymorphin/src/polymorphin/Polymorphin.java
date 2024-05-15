
package polymorphin;


public class Polymorphin {

    
    public static void main(String[] args) {
        Triangle t1 = new Triangle(4,4,4, "red", false );
        Triangle t2 = new Triangle(5,5,2, "green", true );
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        
        /*
        Circle c = new Circle(2);
        Rectangle r = new Rectangle();
        */
        //displayObject(t);
       //System.out.println(t.toString());
        //displayObject(r);
        /*
        StringBuilder myString = new StringBuilder();//string is normally immutable but with string builder you can edit it whnever you want
        myString.append("Welcome");
        myString.append(" to ");
        myString.append("Java");
        */
        
        
    }
    
    public static void displayObject(GeometricObject object)
    {
        System.out.println(object.toString());
        System.out.println(object.getDateCreated() + "\n" + object.getColor());
    }
}
