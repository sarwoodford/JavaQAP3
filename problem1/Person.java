package problem1;

// super class Person
public class Person {
    // assign attributes
    protected String myName;
    protected int myAge;
    protected String myGender;

    // constructors
    public Person(String name, int age, String gender){
        myName = name;
        myAge= age;
        myGender = gender;
    }

    // getters and setters
    public String getName(){
        return myName;
    }

    public void setName(String name){
        myName = name;
    }

    public int getAge(){
        return myAge;
    }

    public void setAge(int age){
        myAge = age;
    }

    public String getGender(){
        return myGender;
    }

    public void setGender(String gender){
        myGender = gender;
    }

    // to string method 
    @Override
    public String toString(){
        return "name: " + myName + ", age: " + myAge + ", gender: " + myGender;
    }
}
