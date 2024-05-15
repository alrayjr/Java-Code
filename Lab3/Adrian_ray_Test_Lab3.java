
package polymorphin;


public class Polymorphin {

    
    public static void main(String[] args) {
        Triangle t1 = new Triangle(4,4,4, "red", false );
        Triangle t2 = new Triangle(5,5,2, "green", true );
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        
        
    }
    
}
