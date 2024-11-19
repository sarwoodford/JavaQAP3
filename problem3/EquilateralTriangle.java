package problem3;

// equilateralTriangle is a subclass from Triangle 
public class EquilateralTriangle extends Triangle{

    // constructor 
    public EquilateralTriangle(double side){
        super (side, side, side); // ensure all sides are equal (only one param accepted )
        this.name = "Equilateral Triangle"; // update name from super class
    }

    // method to calculate area 
    // had to override and implement in this class as output was 0 when
    // only the triangle getArea() was being implemented 
    @Override
    public double getArea(){
        return (Math.sqrt(3) / 4) * side1 * side1;
    }
}
