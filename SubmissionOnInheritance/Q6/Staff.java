package Q6;

public class Staff extends Person {
    private String department;

    public Staff(String n, int a, String d) {
        super(n, a);
        department = d;
    }

    public void displayRole() {
        System.out.println("Staff: " + department);
    }
}
