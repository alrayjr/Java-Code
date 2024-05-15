
package modifiers;

/**
 *
 * @author epicb
 */
public class Modifiers {


    public static void main(String[] args) {
        
        System.out.println(Circle.getNumOfObjects());
        
        Circle cir1 = new Circle();
        System.out.println(cir1.getNumOfObjects());
        
        Circle cir2 = new Circle(6.4);
        System.out.println(cir1.getNumOfObjects()); // this shit can be called from any object or without class since itsa static mothod and static variable
        
        
        Circle [] circleArrayMain = createCircleArray();
        
        printCircleArray(circleArrayMain);
        
        
        int a = 5; //integer = primative, EW gross, (is faster tho)
        
        Integer b = 5; // integer object = complex, much wow, has own fuctions so coooool
        
        Double d = 32.1; // double object? Omg ur blowing my mind boi
        
        Boolean c = true; // Holy shit is that a wild boolean variable, *dies*
        
        d.isNaN(); // MY d is Not A Number, NANI?!?!?!?
        
        System.out.println(new Double(12.14).compareTo(new Double(12.3)));
    }
    
        public static Circle[] createCircleArray() //array of objects, Just like c++
    {
        Circle [] circleArray;
        circleArray = new Circle [5]; // creates 5 circle objects, fuck it 5 circles
        for( int i = 0; i < 5; i++)
            circleArray[i] = new Circle(Math.random() * 100);
        
        return circleArray;
    }
        public static void printCircleArray(Circle [] circleArray)
        {
            System.out.printf("%-30s%-15s\n", "Radius", "Area");
            
            for( int i = 0; i < circleArray.length; i++)
                System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());
        }
}
