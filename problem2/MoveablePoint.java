package problem2;

// moveable point is a subclass of Point class
public class MoveablePoint extends Point{
    // assign attributes specifc to moveable point
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    // constructors
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // default constructor
    public MoveablePoint(){

    }

    // getters and setters 
    public float getXSpeed(){
        return xSpeed;
    }

    public void setXSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }

    public float getYSpeed(){
        return ySpeed;
    }

    public void setYSpeed(float ySpeed){
        this.ySpeed = ySpeed;
    }

    // methods

    // sets speeds for both axis'
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // gets speed as an array of floats
    public float[] getSpeed(){
        return new float[]{xSpeed, ySpeed};
    }

    // moves the points by adding speed
    public MoveablePoint move(){
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }

    // tostring method to display results
    @Override 
    public String toString(){
        return super.toString() + ", speed: " + xSpeed + ", " + ySpeed;
    }
}
