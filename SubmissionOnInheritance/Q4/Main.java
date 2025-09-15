package Q4;

public class Main {
    public static void main(String[] args) {
        Course c = new Course("Java Basics", 30);
        OnlineCourse oc = new OnlineCourse("Python Advanced", 45, "Coursera", true);
        PaidOnlineCourse poc = new PaidOnlineCourse("Web Dev", 60, "Udemy", false, 499.99, 50.0);
        c.display();
        System.out.println();
        oc.display();
        System.out.println();
        poc.display();
    }
}
