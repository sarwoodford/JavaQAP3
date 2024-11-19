package problem3;

// abstract super class Shape 
public abstract class Shape {
    // assign attribute 
    protected String name;

    // constructor 
    public Shape(String name){
        this.name = name; // set name 
    }

    // abstract method to calculate perimeter (implemented in subclasses)
    public abstract double getPerimeter();
    // abstract method to calculate perimeter (implemented in subclasses)
    public abstract double getArea();

    // to string method to display results
    @Override
    public String toString(){
        return String.format("Shape: %s, Area: %.2f, Perimeter: %.2f", name, getArea(), getPerimeter());
    }
}
