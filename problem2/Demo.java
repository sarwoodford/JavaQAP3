package problem2;

public class Demo {
    public static void main(String[] args){
        Point point = new Point(0.5f, 2.3f);
        System.out.println("Point 1: " + point);

        point.setXY(2.1f, 2.2f);
        System.out.println("Point Updated: " + point);

        MoveablePoint moveablePoint = new MoveablePoint(1.1f, 2.2f, 3.3f, 4.4f);
        System.out.println("Moveable Point: " + moveablePoint);

        moveablePoint.move();
        System.out.println("Point After Being Moved: " + moveablePoint);
    }
}
