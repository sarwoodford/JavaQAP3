package problem4;

// circle is a subclass of Shape class
public class Circle extends Shape{
      //assign attribute specifc to circle 
    private double radius;

    // constructor 
    public Circle(double radius){
        super("Cirle"); // update name from superclass
        this.radius = radius;
    }


    // methods 

    // calculate perimeter 
    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    // calculate area 
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    // multiplies radius by given scale factor 
    @Override
    public void scale(double factor){
        this.radius *= factor;
    }
}
