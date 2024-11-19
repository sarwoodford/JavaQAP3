package problem3;

public class EquilateralTriangle extends Triangle{
    public EquilateralTriangle(double side){
        super (side, side, side);
        this.name = "Equilateral Triangle";
    }

    @Override
    public double getArea(){
        return (Math.sqrt(3) / 4) * side1 * side1;
    }
}
