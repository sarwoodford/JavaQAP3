package problem3;

public class Ellipse extends Shape{
    private double majorAxis;
    private double minorAxis;

    public Ellipse(double a, double b){
        super("Ellipse");
        if(a >= b){
            this.majorAxis = a;
            this.minorAxis = b;
        }else{
            this.majorAxis = b;
            this.minorAxis = a;
        }
    }

    @Override
    public double getPerimeter(){
        return Math.PI * 
        (3 * (majorAxis + minorAxis) - 
        Math.sqrt((3 * majorAxis + minorAxis) * 
        (majorAxis + 3 * minorAxis)));
    }

    @Override
    public double getArea(){
        return Math.PI * majorAxis * minorAxis;
    }
}
