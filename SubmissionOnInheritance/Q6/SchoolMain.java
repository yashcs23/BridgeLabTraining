package Q6;

public class SchoolMain {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. X", 40, "Maths");
        Student student = new Student("Mr Q", 16, 10);
        Staff staff = new Staff("Mrs. Y", 35, "Library");
        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }
}
