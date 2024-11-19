package problem3;

// circle is a subclass of Shape class
public class Circle extends Shape{
    //assign attribute specifc tp circle 
    private double radius;

    // constructor 
    public Circle(double radius){
        super("Cirle"); // update name from superclass
        this.radius = radius;
    }

    // methods 

    // calculate circle perimeter
    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    // caluclate circle area
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

}
