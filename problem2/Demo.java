package problem2;

public class Demo {
    public static void main(String[] args){
        // create Point (assign x and y coordinates) and print
        Point point = new Point(0.5f, 2.3f);
        System.out.println("Point 1: " + point);

        // update x and y coordinates using setXY() method 
        point.setXY(2.1f, 2.2f);
        System.out.println("Point Updated: " + point);

        // create a moveable point (assign x and y coordinates, as well as xSpeed and ySpeed) and print
        MoveablePoint moveablePoint = new MoveablePoint(1.1f, 2.2f, 3.3f, 4.4f);
        System.out.println("Moveable Point: " + moveablePoint);

        // move the moveable point (adding the assigned speed values) and print
        moveablePoint.move();
        System.out.println("Point After Being Moved: " + moveablePoint);
    }
}
