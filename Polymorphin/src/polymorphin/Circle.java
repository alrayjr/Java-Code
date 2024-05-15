
package polymorphin;


public class Circle extends GeometricObject {
        private double radius;
        public Circle()
        {
            radius =1;
        }
        public Circle(double radius)
        {
            this.radius =radius;
        }    
        public Circle (double radius, String color, boolean filled)
        {
            super(color, filled);//grabs user-defined constructor in super(geometricObject) class and plugs in 
            this.radius = radius;
        }
        @Override
        public String toString()
        {
            return super.toString() + "\nradius is " + radius;
        }
}
