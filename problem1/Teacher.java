package problem1;

// teacher is a subclass of person
public class Teacher extends Person{
    // assign attributes specifc to teacher
    private String subject;
    private double salary;

    // constructors
    public Teacher(String name, int age, String gender, String subject, double salary){
        super(name, age, gender); // include params in super 
        this.subject = subject;
        this.salary = salary;
    }

    // getters and setters 
    public String getSubject(){
        return subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    // to string method to display results
    @Override
    public String toString(){
        return super.toString() + ", subject: " + subject + ", salary: " + salary;
    }
}
