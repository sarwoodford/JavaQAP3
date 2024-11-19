package problem2;

// superclass Point
public class Point {
    // assign attributes 
    private float x = 0.0f;
    private float y = 0.0f;

    // constructors

    public Point(){
        // default constructor to initialize coordinates (0,0)
    }

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    // getters and setters 
    public float getX(){
        return x;
    }

    public void setX(float x){
        this.x = x;
    }

    public float getY(){
        return y;
    }

    public void setY(float y){
        this.y = y;
    }

    // methods 

    // sets x and y coordinates together 
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    // gets x and y as an array 
    public float[] getXY(){
        return new float[]{x, y};
    }

    // to string method to display results 
    @Override
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
