package problem4;

public class Triangle extends Shape{
    protected double side1, side2, side3;

    public Triangle(double side1, double side2, double side3){
        super("Triangle");
        if(isValidTriangle(side1, side2, side3)){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }else{
            throw new IllegalArgumentException("invalid side values for triangle.");
        }
    }

    private boolean isValidTriangle(double a, double b, double c){
        return a + b > c && b + c > a && c + a > b;
    }

    @Override
    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    @Override
    public double getArea(){
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s = side1) * (s - side2) * (s - side3));
    }

    @Override
    public void scale(double factor){
        this.side1 *= factor;
        this.side2 *= factor;
        this.side3 *= factor;
    }
}
