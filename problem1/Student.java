package problem1;

// student is a subclass of person
public class Student extends Person{
    // assign attribtes specific to student
    protected String myIDNum;
    protected double myGPA;

    // constructors 
    public Student(String name, int age, String gender, String idNum, double gpa){
        super(name, age, gender); // include params from super 
        myIDNum = idNum;
        myGPA = gpa;
    }

    // getters and setters 
    public String getIDNum(){
        return myIDNum;
    }

    public void setIDNum(String idNum){
        myIDNum = idNum;
    }

    public double getGPA(){
        return myGPA;
    }

    public void setGPA(double gpa){
        myGPA = gpa;
    }

    // to string method
    @Override
    public String toString(){
        return super.toString() + ", ID: " + myIDNum + ", GPA: " + myGPA;
    }
}
