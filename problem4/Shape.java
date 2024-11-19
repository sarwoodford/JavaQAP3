package problem4;

// abstract superclass shape 
public abstract class Shape implements Scalable{
    // assign name attribute 
    protected String name;

    // constructor 
    public Shape(String name){
        this.name = name;
    }

    // abstract methods implemented in subclasses 
    public abstract double getPerimeter();
    public abstract double getArea();

    // to string method to display results 
    @Override
    public String toString(){
        return String.format("Shape: %s, Area: %.2f, Perimeter: %.2f", name, getArea(), getPerimeter());
    }
}
