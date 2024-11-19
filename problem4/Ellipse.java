package problem4;

// ellipse is a subclass of Shape 
public class Ellipse extends Shape{
    // assign attributes specifc to Ellipse 
    private double majorAxis;
    private double minorAxis;

    // Constructor 
    public Ellipse(double a, double b){
        super("Ellipse"); // update name from super class
        if(a >= b){ // ensure a is greater than or equal to b 
            this.majorAxis = a;
            this.minorAxis = b;
        }else{
            this.majorAxis = b;
            this.minorAxis = a;
        }
    }

    // methods 

    // calculate perimeter 

    @Override
    public double getPerimeter(){
        return Math.PI * 
        (3 * (majorAxis + minorAxis) - 
        Math.sqrt((3 * majorAxis + minorAxis) * 
        (majorAxis + 3 * minorAxis)));
    }

    // calculate area 
    @Override
    public double getArea(){
        return Math.PI * majorAxis * minorAxis;
    }

    // multiply axis' by given scale factor 
    @Override 
    public void scale(double factor){
        this.majorAxis *= factor;
        this.minorAxis *= factor;
    }
}
