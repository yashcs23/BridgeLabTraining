package Q6;

public class Teacher extends Person {
    private String subject;

    public Teacher(String n, int a, String s) {
        super(n, a);
        subject = s;
    }

    public void displayRole() {
        System.out.println("Teacher: " + subject);
    }
}
