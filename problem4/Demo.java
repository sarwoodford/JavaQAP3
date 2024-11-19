package problem4;

public class Demo {
    public static void main(String[] args){
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle(5);
        shapes[1] = new Ellipse(6, 4);
        shapes[2] = new Triangle(3, 4, 5);
        shapes[3] = new EquilateralTriangle(2);

        System.out.println("Shapes before scale: ");
        for(Shape shape: shapes ){
            System.out.println(shape);
        }
        scaleShapes(shapes, 2.5);

        System.out.println("\nShapes after scale: ");
        for(Shape shape : shapes){
            System.out.println(shape);
        }
    }

        public static void scaleShapes(Scalable[] scalables, double factor){
            for(Scalable scalable : scalables){
                scalable.scale(factor);
            }
        }
}
