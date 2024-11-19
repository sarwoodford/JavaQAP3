package problem4;

// triangle is a subclass of shape 
public class Triangle extends Shape{
    // assign attributes specifc to triangle 
    protected double side1, side2, side3;

    // constructor 
    public Triangle(double side1, double side2, double side3){
        super("Triangle"); // update name from super class
        if(isValidTriangle(side1, side2, side3)){ // validate triangle side values 
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }else{ // else throw error 
            throw new IllegalArgumentException("invalid side values for triangle.");
        }
    }

    // methods 

    // validate side values given for triangle to ensure it satisfies
    // the pythagorean theorem 
    private boolean isValidTriangle(double a, double b, double c){
        return a + b > c && b + c > a && c + a > b;
    }

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

    // muliply sides by given scale factor 
    @Override
    public void scale(double factor){
        this.side1 *= factor;
        this.side2 *= factor;
        this.side3 *= factor;
    }
}
