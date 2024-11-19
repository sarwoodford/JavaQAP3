package problem1;

// college student extends from student subclass
public class CollegeStudent extends Student{
    // assign attributes specific to college student
    private String major;
    private int year;

    // constructors
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major){
        super(name, age, gender, idNum, gpa); // include params from super
        this.year = year;
        this.major = major;
    }

    // getters and setters 
    public String getMajor(){
        return major;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    // to string method to display results
    @Override
    public String toString(){
        return super.toString() + ", year: " + year + ", major: " + major;
    }
}
