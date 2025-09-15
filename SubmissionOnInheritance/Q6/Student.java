package Q6;

public class Student extends Person {
    private int grade;

    public Student(String n, int a, int g) {
        super(n, a);
        grade = g;
    }

    public void displayRole() {
        System.out.println("Student: Grade " + grade);
    }
}
