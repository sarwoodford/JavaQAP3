package problem3;

public class Demo {
    public static void main(String[] args){
        Shape[] shapes = new Shape[4]; 

        // create new Circle object 
        shapes[0] = new Circle(5);
        // create new Ellipse object
        shapes[1] = new Ellipse(6, 4);
        // create new Triangle object
        shapes[2] = new Triangle(3, 4, 5);
        // create new EquilateralTriangle object
        shapes[3] = new EquilateralTriangle(2);

        // print all shapes and their areas and perimeters 
        for(Shape shape : shapes){
            System.out.println(shape);
        }
    }
}
