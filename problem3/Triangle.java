package problem3;

// triangle subclass from Shape superclass
public class Triangle extends Shape{
    // assign attributes specifc to Triangle
    protected double side1, side2, side3;

    // constructor 
    public Triangle(double side1, double side2, double side3){
        super("Triangle"); // update name from superclass
        if(isValidTriangle(side1, side2, side3)){ // validate that the sides work
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }else{ // else throw error 
            throw new IllegalArgumentException("invalid side values for triangle.");
        }
    }

    // validate that the pythagorean theorem works for side values 
    private boolean isValidTriangle(double a, double b, double c){
        return a + b > c && b + c > a && c + a > b;
    }

    // methods

    // calculate perimeter 
    @Override
    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    // calculate area 
    @Override
    public double getArea(){
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s = side1) * (s - side2) * (s - side3));
    }
}
