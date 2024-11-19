package problem1;

public class Demo {
    public static void main(String[] args){
        // create Person object and display
        Person bob = new Person("Coach Bob", 27, "M");
        System.out.println(bob);

        // create Student object and display
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println(lynne);

        // create Teacher object and display
        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        System.out.println(mrJava);

        // create CollegeStudent object and display
        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println(ima);
    }
}
