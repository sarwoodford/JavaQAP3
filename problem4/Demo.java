package problem4;

public class Demo {
    public static void main(String[] args){
        Shape[] shapes = new Shape[4];

        // create new Circle object
        shapes[0] = new Circle(5);
        // create new Ellipse object
        shapes[1] = new Ellipse(6, 4);
        // create new Triangle object
        shapes[2] = new Triangle(3, 4, 5);
        // calculate EquilateralTriangle object
        shapes[3] = new EquilateralTriangle(2);

        // display shapes before scaling
        System.out.println("Shapes before scale: ");
        for(Shape shape: shapes ){
            System.out.println(shape);
        }

        // scale shapes by a given factor (2.5 given )
        scaleShapes(shapes, 2.5);

        // display shapes after scaling by a factor of 2.5
        System.out.println("\nShapes after scale: ");
        for(Shape shape : shapes){
            System.out.println(shape);
        }
    }

    // multiplies scalable shape params by given value 
        public static void scaleShapes(Scalable[] scalables, double factor){
            for(Scalable scalable : scalables){
                scalable.scale(factor);
            }
        }
}
