package problem4;

// 
public class EquilateralTriangle extends Triangle{
    public EquilateralTriangle(double side){
        super (side, side, side); // ensure all sides are equal (only accepts one value as a param)
        this.name = "Equilateral Triangle"; // update name from superclass
    }

    // calculate area 
    @Override
    public double getArea(){
        return (Math.sqrt(3) / 4) * side1 * side1;
    }
}
